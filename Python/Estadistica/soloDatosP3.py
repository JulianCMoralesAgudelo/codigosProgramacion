#!/usr/bin/env python
# -*- coding: UTF-8 -*-
from math import sqrt
# ###############################################################################
# Declaracion e inicializacion de variables
xi = []
cuartiles = []

print("")
print("Ingrese la cantidad de datos xi:")
datos = int(input())
print("")

print("")
print("Ingrese los datos:")
for i in range(0, datos):
    xi.append(float(input()))

# Se ordenan los datos
n = len(xi)
lista = sorted(xi)
maximo = max(xi)
minimo = min(xi)
rango = maximo-minimo

# ###############################################################################
# Funciones
# Funcion media


def media(datos):
    suma = sum(xi)
    total = float(len(datos))
    return suma/total

# Funcion mediana


def mediana(datos):
    datos.sort()  # .sort Ordena los ítems dela lista
    if len(datos) % 2 == 0:
        n = len(datos)
        mediana = (datos[int(n / 2) - 1] + datos[int(n / 2)]) / 2
    else:
        mediana = datos[int(len(datos) / 2)]
    return mediana

# Funcion moda


def moda(datos):
    repeticiones = 0
    for i in datos:
        n = datos.count(i)
        if n > repeticiones:
            repeticiones = n

    moda = []  # Arreglo donde se guardara el o los valores de mayor frecuencia

    for i in datos:
        # Devuelve el número de veces que x aparece enla lista.
        n = datos.count(i)
        if n == repeticiones and i not in moda:
            moda.append(i)
    if len(moda) != len(datos):
        return moda
    else:
        return('No hay moda')

# Funcion varianza


def varianza(datos):
    suma = 0.0
    for i in datos:
        suma += (i-media(datos))**2
    return suma/float(len(datos))


# Funcion varianza muestral


def varianzamuestral(datos):
    suma = 0.0
    for i in datos:
        suma += (i-media(datos))**2
    return suma/float(len(datos)-1)


def desviacion_tipica(datos):
    return sqrt(varianza(datos))

# Funcion cuartiles


def cuartiles(datos):
    cuartiles = []
    if len(datos) % 2 == 0:
        q1 = n/4
        q3 = 3*n/4
        cuartiles.append(datos[int(q1)])
        cuartiles.append(mediana(datos))
        cuartiles.append(datos[int(q3)])
    else:
        q1 = (n+1)/4
        q3 = 3*(n+1)/4
        cuartiles.append(datos[int(q1)])
        cuartiles.append(mediana(datos))
        cuartiles.append(datos[int(q3)])
    return cuartiles

# Funcion asimetria


def asimetria(datos):
    m3 = 0.0
    for i in datos:
        m3 += (i-media(datos)) ** 3
    m3 /= n
    s3 = desviacion_tipica(datos) ** 3
    return m3/float(s3)

# Funcion asimetria muestral


def asimetriamuestral(datos):
    m3 = 0.0
    for i in datos:
        m3 += ((i - media(datos)) ** 3)/desviacion_tipica(datos) ** 3
    m3 *= n/((n-1)*(n-2))
    return m3


# Funcion curtosis


def curtosis(datos):
    m4 = 0.0
    for i in datos:
        m4 += (i-media(datos)) ** 4
    m4 /= n
    s4 = desviacion_tipica(datos) ** 4
    return m4/float(s4) - 3


# ###############################################################################
# Llamado de funciones
desviacion = desviacion_tipica(xi)/media(xi)*100
asimetria = asimetria(xi)

if(asimetria < 0):
    msj = "Es una distribución negativa, es dispersa a la izquierda"
elif(asimetria == 0):
    msj = "Es una distribución negativa simétrica, media: ", media, " mediana: ", mediana, " moda: ", moda
else:
    msj = "Es una distribución positiva, es dispersa a la derecha."


curtosis = curtosis(xi)

if(curtosis < 0):
    msm = "Es una distribución platicúrtica o achatada."
elif(curtosis == 0):
    msm = "Es una distribución normal o mesocúrtica, forma de campana.",
else:
    msm = "Es una distribución leptocúrtica o apuntada."

# ###############################################################################

# Presentacion de lista.
print(" ")
print("Presentacion de la información")
print(" ")
print('Lista de datos\t\t\t\t', xi)
print('Tamaño de la población:\t\t\t', n)
print('Maximo:\t\t\t\t\t', maximo)
print('Minimo:\t\t\t\t\t', minimo)
print('Rango:\t\t\t\t\t', rango)
print('Media aritmética (μ) :\t\t\t{0:.2f}'.format(media(xi)))
print('Mediana:\t\t\t\t', mediana(xi))
print('Moda:\t\t\t\t\t', moda(xi))
print('Varianza poblacional :\t\t\t{0:.2f}'.format(varianza(xi)))
print('Varianza muestral :\t\t\t{0:.2f}'.format(varianzamuestral(xi)))
print('Desviación estándar (σ) :\t\t{0:.2f}'.format(desviacion_tipica(xi)))
print('Cuartiles:\t\t\t\t', cuartiles(xi))
print('Coeficiente de variación (σ) en %:\t{0:.2f}'.format((desviacion)))
print('Asimetria:\t\t\t\t{0:.2f}'.format(asimetria), msj)
print('Asimetria muestral:\t\t\t{0:.2f}'.format(asimetriamuestral(xi)))
print('Curtosis:\t\t\t\t{0:.2f}'.format(curtosis), msm)
print('')
