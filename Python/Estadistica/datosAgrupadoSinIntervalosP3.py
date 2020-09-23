#!/usr/bin/env python
# -*- coding: UTF-8 -*-
from math import sqrt
# ##############################################################################################################################################################
# Lectura de datos
# Declaracion e inicializacion de variables y calculo de valores

xi = []
fi = []
fr = []
Fi = []
Fr = []

print("")
print("Ingrese la cantidad de datos en el campo xi:")
datos = int(input())
print("")

print("Ingrese los datos del campo Xi:")
for i in range(0, datos):
    xi.append(int(input()))

print("")
print("Ingrese las frecuencias acumuladas fi:")
for i in range(0, datos):
    fi.append(int(input()))

n = sum(fi)
amplitud = xi[1]-xi[0]
maximo = max(xi)
minimo = min(xi)
rango = maximo-minimo
# ##############################################################################################################################################################
# Funciones

# Funcio media


def media():
    s = 0.0
    for i in range(0, len(xi)):
        s += xi[i]*fi[i]
    return float(s / n)

# Funcio mediana


def mediana():
    med = 0
    xmed = sum(fi)/2
    for i in range(0, len(fi)):
        if(Fi[i] >= xmed) & (med == 0):
            med = i
            print(med)
    if(xmed % 2==0):
        return xi[med]                       
    else:
        return (xi[med]+(xi[med+1]))/2

# Funcion moda


def moda():
    mod = max(fi)
    for i in range(0, len(fi)):
        if(fi[i] == mod):
            mod = i
    return mod

# Funcion varianza


def varianza(media):
    v = []
    s = 0.0
    for i in xi:
        v.append((i - media) ** 2)
    for i in range(0, len(fi)):
        s += v[i] * fi[i]
    return s / n


# Funcion varianza muestral


def varianzamuestral(media):
    v = []
    s = 0.0
    for i in xi:
        v.append((i - media) ** 2)
    for i in range(0, len(fi)):
        s += v[i] * fi[i]
    return s / (n-1)

# Funcion desviacion_tipica


def desviacion_tipica(varianza):
    return sqrt(varianza)

# Funcion desviacion media


def desviacion_media(media):
    dm = 0.0
    for i in range(0, len(xi)):
        dm += abs(xi[i] - media)*fi[i]
    return dm/len(xi)

# Funcion cuartiles


def cuartiles():
    cuartiles = []
    q1 = n/4    
    q2 = (2*n+1)/4
    q3 = (3*n+1)/4
    for i in range(0, len(Fi)):
        if(Fi[i] >= q1)&(q1 == n/4):
            q1 = xi[i]
        if(Fi[i] >= q2) & (q2 == (2*n+1)/4):
            q2 = xi[i]          
        if(Fi[i] >= q3) & (q3 == (3*n+1)/4):
            q3 = xi[i]
    cuartiles.append(q1)
    cuartiles.append(q2)
    cuartiles.append(q3)        
    return cuartiles


# Funcion asimetria


def asimetria(media, desviacion):   
    m3 = 0.0
    s3 = 0.0
    for i in range(0, len(xi)):
        m3 += (xi[i]-media) ** 3 * fi[i]
    m3 /= n
    s3 = desviacion ** 3
    return m3/s3

# Funcion curtosis


def curtosis(media, desviacion):
    m4 = 0.0
    s4 = 0.0
    for i in range(0, len(xi)):
        m4 += (xi[i]-media) ** 4
    m4 /= n
    s4 = desviacion ** 4
    return m4/s4 - 3


# ##############################################################################################################################################################
# Calculo de frecuencias
for x in range(0, len(fi)):
    fr.append(float(fi[x]/n))
    if(x == 0.0):
        # Frecuencia absoluta acumulada
        Fi.append(fi[x])
        # Frecuencia relativa acumulada
        Fr.append(fr[x])
    else:
        # Frecuencia absoluta acumulada
        Fi.append(fi[x]+Fi[x-1])
        # Frecuencia relativa acumulada
        Fr.append(fr[x]+Fr[x-1])
        # print "{0:.2f}".format(fr[x])
# ###############################################################################
# Llamado de funciones
media = media()
mediana = mediana()
moda = moda()
cuartiles = cuartiles()
varianza = varianza(media)
varianzamuestral=varianzamuestral(media)
desviacion = desviacion_tipica(varianza)
desviacion_media = desviacion_media(media)
coeficienteVariacion = desviacion/media
asimetria=asimetria(media, desviacion)
curtosis=curtosis(media, desviacion)
# ###############################################################################
# Presentacion de datos.

# Formateo las litas para imprimir a dos decimales
fr = ['%.3f' % elem for elem in fr]
Fr = ['%.3f' % elem for elem in Fr]

print("")
print("Datos\t\t\t\txi:", xi)
print("")
print("Frecuencia absoluta\t\tfi:", fi)
print("")
print("Frecuencia absoluta acumulada\tFi:", Fi)
print("")
print("Frecuencias relativa\t\tfr:", fr)
print("")
print("Frecuencia relativa acumulada\tFr: ", Fr)
print("")
print("Cantidad de datos:\t\t", n)
print("")
print('Maximo:\t\t\t\t', maximo)
print("")
print('Minimo:\t\t\t\t', minimo)
print("")
print('Rango:\t\t\t\t', rango)
print("")
print("Amplitud:\t\t\t", amplitud)
print("")
print("Media:\t\t\t\t{0:.2f}".format(media))
print("")
print("Mediana:\t\t\t", mediana)
print("")
print("Moda:\t\t\t\t", xi[moda])
print("")
print("Varianza:\t\t\t{0:.2f}".format(varianza))
print("")
print("Varianza muestral:\t\t{0:.2f}".format(varianzamuestral))
print("")
print("Desviacion tipica:\t\t{0:.2f}".format(desviacion))
print("")
print('Cuartiles:\t\t\t', cuartiles)
print("")
print("Desviacion media:\t\t{0:.2f}".format(desviacion_media))
print("")
print("Coeficiente de variacion:\t{0:.2f}".format(coeficienteVariacion))
print("")
print("Asimetria:\t\t\t{0:.2f}".format(asimetria))
print("")
print("Curtosis:\t\t\t{0:.2f}".format(curtosis+3))
print("")
print("Exceso de Curtosis:\t\t{0:.2f}".format(curtosis))
print("")