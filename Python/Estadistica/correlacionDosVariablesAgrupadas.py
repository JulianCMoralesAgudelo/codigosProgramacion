#!/usr/bin/env python
# -*- coding: UTF-8 -*-
from math import sqrt
# ##############################################################################################################################################################
separador = "###############################################################################################################################################################"

# Declaracion e inicializacion de variables

xi = []
yi = []
fi = []
xminmed = []
xminmed2 = []
yminmed = []
yminmed2 = []
xminmedxyminmed = []

print("")
print("Ingrese la cantidad de datos:")
cantidad = int(input())

print("")
print("Ingrese los datos de la variable x:")
for i in range(0, cantidad):
    xi.append(float(input()))

print("")
print("Ingrese los datos de la variable y:")
for i in range(0, cantidad):
    yi.append(float(input()))

print("")
print("Ingrese los datos de la variable fi:")
for i in range(0, cantidad):
    fi.append(float(input()))

n = sum(fi)
print("")
# ##############################################################################################################################################################
# Funciones

# Funcion media


def media(dato):
    s = 0
    for i in range(0, cantidad):
        s += dato[i] * fi[i]
    return s / float(n)

# Funcion media


def datox2fi(dato):
    datox2fi = 0.0
    for i in range(0, cantidad):
        datox2fi += dato[i]**2 * fi[i]
    return datox2fi


def xiyifi():
    xiyifi = 0
    for i in range(0, cantidad):
        xiyifi += xi[i] * yi[i] * fi[i]
    return xiyifi

# Funcion para reducir decimales()


def decimas(data):
    data = ['%.3f' % elem for elem in data]
    return data

# Funcion coovarianza

# ##############################################################################################################################################################
# Manipulacion de datos y llamado de funciones


# Calculos de las medias de x y
mediaxi = media(xi)
mediayi = media(yi)

# Creacion de las sumatoria de (xi^2 * fi) y (yi^2 * fi)
xi2fi = datox2fi(xi)
yi2fi = datox2fi(yi)

# Creacion de las sumatoria de (xi * yi * fi)
xiyifi = xiyifi()

# Varianza de x y y

varianzaxi = xi2fi/n - mediaxi**2
varianzayi = yi2fi/n - mediayi**2

# Desviacion tippica de x
desviacionTipicax = sqrt(varianzaxi)
desviacionTipicay = sqrt(varianzayi)

# Coovarianza entre ambas variables

coovarianza = xiyifi/n - mediaxi * mediayi

# Coeficnete de correlacion de Pearson
productodesviaciones = desviacionTipicax * desviacionTipicay
r = coovarianza / productodesviaciones

# Calculo de los parametros de la recta de regresion de y/x.
# Calculo del coeficiente de regresion
# Formula = b = y - mx

m = coovarianza/varianzaxi

b = (sum(yi) - (m*sum(xi)))/n


# Criterios de coorelacion
if(r > 0):
    mensaje = "La relacion es directamente proporcional y "
else:
    mensaje = "La relacion es inversamente proporcional y "

# Tipo de coorelacion

if (r == 1) | (r == -1):
    mensaje += "La correlación es perfecta"
elif (0.90 <= r) & (r <= 1) | (-1 < r) & (r <= -0.90):
    mensaje += "La correlación es excelente"
elif (0.80 <= r) & (r <= 0.90) | (-0.90 < r) & (r <= -0.80):
    mensaje += "La correlación es aceptable"
elif (0.60 <= r) & (r <= 0.80) | (-0.80 < r) & (r <= -0.60):
    mensaje += "La correlación es regular"
elif (0.30 <= r) & (r <= 0.60) | (-0.60 < r) & (r <= -0.30):
    mensaje += "La correlación es mínima"
elif (0 <= r) & (r <= 0.30) | (-0.30 < r) & (r <= 0.0):
    mensaje += "No hay correlación"
else:
    mensaje = "Error en el sistema"

# ##############################################################################################################################################################

# Presentacion de datos
print("")
print(separador)
print("")
print("Datos de la variable x")
print(xi)
print("")
print("Media de x:\t\t\t{0:.2f}".format(mediaxi))
print("")
print("Varianza de x:\t\t\t{0:.2f}".format(varianzaxi))
print("")
print("Desviacion tipica de x:\t\t{0:.2f}".format(desviacionTipicax))
print("")
print(separador)
print("")
print("Datos de la variable y")
print(yi)
print("")
print("Media de y:\t\t\t{0:.2f}".format(mediayi))
print("")
print("Varianza de y:\t\t\t{0:.2f}".format(varianzayi))
print("")
print("Desviacion tipica de y:\t\t{0:.2f}".format(desviacionTipicay))
print("")
print(separador)
print("")
print("Datos de coorelacion")
print("")
print("Coovarianza:\t\t\t{0:.2f}".format(coovarianza))
print("")
print("Coeficiente de correlacion de Pearson R:\t\t{0:.3f}".format(r), mensaje)
print("")
print(separador)
print("")
print("Datos de la recta de regresion")
print("")
print("Coeficiente de regresion m:{0:.2f}".format(m))
print("")
print("Coeficiente de posicion b:{0:.2f}".format(b))
print("")
print("La ecuacion de regresion seria y = mx + b:")
print("")
print("y = {0:.3f}".format(m), "x + {0:.3f}".format(b))
print("")
