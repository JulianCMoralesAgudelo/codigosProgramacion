#!/usr/bin/env python
# -*- coding: UTF-8 -*-
from math import sqrt
from math import log
# ###############################################################################
# Lectura de datos
# Declaracion e inicializacion de variables y calculo de valores
# Se ingresan intervalos y la amplitud
print("Ingrese el limite superior")
lis = int(input())
print("Ingrese el limite inferior")
lif = int(input())
print("Ingrese la amplitud")
amplitud = int(input())
intervalos = int((lis-lif)/amplitud)

rango = lis - lif

li = []
ls = []
xi = []
fi = []
fr = []
Fi = []
Fr = []

# Se ingresan llenan ingresan las frecuencias acumuladas
print("Ingrese las frecuencias absolutas:")
for i in range(0, intervalos):
    fi.append(int(input()))
n = sum(fi) + 0.0
k = 1 + 3.322 * log(n)
# ###############################################################################
# Funcio media


def media():
    s = 0.0
    for i in range(0, len(xi)):
        s += xi[i]*fi[i]
    return float(s / n)

# Funcio mediana


def mediana():
    # Calculo de la posicion de la mediana
    med = 0
    xmed = 0.0
    if(sum(fi) % 2 == 0):
        xmed = sum(fi)/2
    else:
        xmed = sum(fi)/2 + 1
    for i in range(0, len(Fi)):
        if(Fi[i] >= xmed) & (med == 0):
            med = i
    amp = li[med]-li[med-1]
    median = li[med] + float(xmed - Fi[med-1])/fi[med] * amp
    return median

# Funcion moda


def moda():
    maxfrec = max(fi)
    pos = 0
    amp = li[1]-li[0]
    moda = 0
    for i in range(0, len(fi)):
        if(fi[i] >= maxfrec):
            pos = i
    if(pos == len(fi)-1):
        moda = li[pos]
    elif(pos == 0):
        moda = li[pos] + amp
    else:
        moda = li[pos] + float(fi[pos+1])/(fi[pos+1]+fi[pos-1]) * amp
    return moda

# Funcion varianza


def varianza(media):
    v = []
    s = 0.0
    for i in xi:
        v.append((i - media) ** 2)
    for i in range(0, len(fi)):
        s += v[i] * fi[i]
    return s / float(sum(fi))


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
    k1 = 0.0
    k2 = 0.0
    k3 = 0.0
    q1 = 0
    q2 = 0
    q3 = 0
    for i in range(0, len(Fi)):
        if(Fi[i] >= n/4) & (q1 == 0):
            q1 = i
        if(Fi[i] >= 2*(n+1)/4) & (q2 == 0):
            q2 = i
        if(Fi[i] >= 3*(n+1)/4) & (q3 == 0):
            q3 = i
    k1 = li[q1] + ((n/4) - Fi[q1-1])/fi[q1] * (ls[q1]-li[q1])
    k2 = li[q2] + ((2*(n+1)/4) - Fi[q2-1])/fi[q2] * (ls[q2]-li[q2])
    k3 = li[q3] + ((3*(n+1)/4) - Fi[q3-1])/fi[q3] * (ls[q3]-li[q3])
    cuartiles.append(k1)
    cuartiles.append(k2)
    cuartiles.append(k3)
    cuartiles = ['%.3f' % elem for elem in cuartiles]
    return cuartiles

# Funcion asimetria


def asimetria(xi, fi, media, desviacion):
    m3 = 0.0
    s3 = 0.0    
    for i in range(0, len(fi)):
        m3 += float(xi[i]-media) ** 3 * fi[i]
    m3 /= float(sum(fi))
    s3 = desviacion ** 3    
    return m3/s3
# Funcion curtosis


def curtosis(xi, fi, media, desviacion):
    m4 = 0.0
    s4 = 0.0
    curtosis = 0.0
    for i in range(0, len(fi)):
        m4 += float(xi[i]-media) ** 4 * fi[i]
    m4 /= n
    s4 = desviacion ** 4
    curtosis = (m4 / s4)
    return curtosis - 3


# ###############################################################################
# Funciones
# Se ingresan llenan intervalos y se calcula marca de clase
dato = lif
li.append(dato)
for i in range(0, intervalos):
    dato += amplitud
    li.append(dato)
    ls.append(li[i]+amplitud)
    xi.append(float(li[i]+ls[i])/2)
li.pop()

# ###############################################################################
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


# ###############################################################################
# Llamado de funciones
media = media()
mediana = mediana()
moda = moda()
varianza = varianza(media)
desviacion = desviacion_tipica(varianza)
desviacion_media = desviacion_media(media)
coeficientevariacion = (desviacion/media)*100
cuartiles = cuartiles()
asimetria = asimetria(xi, fi, media, desviacion)

if(asimetria < 0):
    mensaje ="Es una distribución negativa, es dispersa a la izquierda"
elif(asimetria == 0):
    mensaje ="Es una distribución negativa simétrica, media: ", media, " mediana: ", mediana, " moda: ", moda
else:
    mensaje ="Es una distribución positiva, es dispersa a la derecha."

curtosis = curtosis(xi, fi, media, desviacion)
if(curtosis < 0):
    msm = "Es una distribución platicúrtica o achatada."
elif(curtosis == 0):
    msm = "Es una distribución normal o mesocúrtica, forma de campana. ",
else:
    msm = "Es una distribución leptocúrtica o apuntada."
# ###############################################################################
# Presentacion de datos.
# Formateo las litas para imprimir a dos decimales
fr = ['%.3f' % elem for elem in fr]
Fr = ['%.3f' % elem for elem in Fr]

print("")
print("Datos \t\t\t\txi:",xi)
print("")
print("Frecuencia absoluta\t\tfi:",fi)
print("")
print("Frecuencia absoluta acumulada\tFi:",Fi)
print("")
print("Frecuencias relativa\t\tfr:",fr)
print("")
print("Frecuencia relativa acumulada\tFr:",Fr)
print("")
print("Cantidad de datos n:\t\t",n)
print("")
print("Maximo:\t\t\t\t",lis)
print("")
print("Minimo:\t\t\t\t",lif)
print("")
print("Rango:\t\t\t\t",rango)
print("")
print("Amplitud:\t\t\t",amplitud)
print("")
print("Numero Intervalos (k):\t\t",intervalos)
print("")
print("Media:\t\t\t\t{0:.2f}".format(media))
print("")
print("Mediana:\t\t\t{0:.2f}".format(mediana))
print("")
print("Moda:\t\t\t\t{0:.2f}".format(moda))
print("")
print("Varianza:\t\t\t{0:.2f}".format(varianza))
print("")
print("Desviacion tipica:\t\t{0:.2f}".format(desviacion))
print("")
print("Desviacion media:\t\t{0:.2f}".format(desviacion_media))
print("")
print("Coeficiente de variacion:\t{0:.2f}".format(coeficientevariacion), "%")
print("")
print('Cuartiles:\t\t\t',cuartiles)
print("")
print('Asimetria:\t\t\t'"{0:.2f}".format(asimetria),mensaje)
print("")
print('Curtosis:\t\t\t{0:.2f}'.format(curtosis), msm)
print("")
