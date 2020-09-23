#!/usr/bin/env python
# -*- coding: UTF-8 -*-
from math import sqrt
# ##############################################################################################################################################################
# Declaracion e inicializacion de variables

x = []
y = []


print("")
print("Ingrese la cantidad de datos:")
datos = int(input())

print("")
print("Ingrese los datos de la variable x:")
for i in range(0, datos):
    x.append(float(input()))

print("")
print("Ingrese los datos de la variable y:")
for i in range(0, datos):
    y.append(float(input()))

n = len(x)

# ##############################################################################################################################################################
# Funciones

# Funcion media

# Funcion media


def media(lista):
    s = 0
    for elemento in lista:
        s += elemento
    return s / float(n)

# Funcion varianza


def varianza(xi):
    s = 0
    m = media(xi)
    for i in xi:
        s += (i - m) ** 2
    return s / float(n)

# Funcion desviacion_tipica


def desviacion_tipica(varianza):
    return sqrt(varianza)

# ##############################################################################################################################################################
# Manipulacion de datos y llamado de funciones


# Creacion de tablas y Calculos para la variable x
mediax = media(x)

# Creacion de tablas y Calculos para la variable y
mediay = media(y)

# Varianza de x y y

varianzax = varianza(x)
varianzay = varianza(y)

# Desviacion tippica de x
desviacionx = desviacion_tipica(varianzax)
desviaciony = desviacion_tipica(varianzay)


# Coovarianza entre ambas variables
coovarianza = 0.0
for i in range(0, n):
    coovarianza += x[i] * y[i]

coovarianza = (coovarianza / n) - (mediax * mediay)


# Calculo del coeficiente de correlacion de Pearson
r = coovarianza/(desviacionx*desviaciony)

# Criterios de coorelacion
if(r > 0):
    mensaje = "La relacion es directamente proporcional y "
else:
    mensaje = "La relacion es inversamente proporcional y "

# Tipo de coorelacion
if (r == 1) | (r == -1):
    mensaje = "la correlación es perfecta"
elif (0.90 <= r) & (r <= 1) | (-1 < r) & (r <= -0.90):
    mensaje = "la correlación es excelente"
elif (0.80 <= r) & (r <= 0.90) | (-0.90 < r) & (r <= -0.80):
    mensaje = "la correlación es aceptable"
elif (0.60 <= r) & (r <= 0.80) | (-0.80 < r) & (r <= -0.60):
    mensaje = "la correlación es regular"
elif (0.30 <= r) & (r <= 0.60) | (-0.60 < r) & (r <= -0.30):
    mensaje = "la correlación es mínima"
elif (0 <= r) & (r <= 0.30) | (-0.30 < r) & (r <= 0.0):
    mensaje = "No hay correlación"
else:
    mensaje = "Error en el sistema"

# Calculo de los parametros de la recta de regresion de y/x.
# Formula = y = mx + b
# m = (n * (sum(xy)) - sum(x)* sum(y))/ n*(sum(x^2)) -(sum(x))^2

m = coovarianza/varianzax

b = (sum(y) - (m * sum(x))) / n

# ##############################################################################################################################################################

# Presentacion de datos

print("##############################################################################################################################################################")
print("")
print("Datos de la variable x")
print("")
print("Media de x: {0:.2f}".format(mediax))
print("")
print("Varianza de x: {0:.2f}".format(varianzax))
print("")
print("Desviacion tipica de x: {0:.2f}".format(desviacionx))
print("")

print("##############################################################################################################################################################")

print("Datos de la variable y")
print("")
print("Media de y: {0:.2f}".format(mediay))
print("")
print("Varianza de y: {0:.2f}".format(varianzay))
print("")
print("Desviacion tipica de y: {0:.2f}".format(desviaciony))
print("")

print("###############################################################################################################################################################")
print("")
print("Datos de correlacion ")
print("")
print("Coovarianza: {0:.2f}".format(coovarianza))
print("")
print("Coeficiente de correlacion de Pearson R: {0:.2f}".format(r), mensaje)
print("")

print("###############################################################################################################################################################")
print("")
print("Datos de la recta de regresion")
print("")
print("Coeficiente de regresion m: {0:.2f}".format(m))
print("")
print("Coeficiente de posicion b: {0:.2f}".format(b))
print("")
print("La ecuacion de regresion seria y = mx + b:")
print("")
print("y ={0:.2f}".format(m), "x + {0:.2f}".format(b))
print("")
