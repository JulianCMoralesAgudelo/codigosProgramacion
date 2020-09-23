#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-

# Declaracion e inicializacion de variables
# Sentencia para imnportar numeros aleatorios
# La mas sencilla e intuitiva
import random

# lectura de datos
n = int(raw_input("Ingresa la cantidad de filas:"))
try:
	n = int(filas)
except:
	"Eso no es un numero"
else:
	print "La cantidad de filas es: ", n
print ("")
m = int(raw_input("Ingresa la cantidad de columnas:"))
try:
	m = int(columnas)
except:
	"Eso no es un numero"
else:
	print "La cantidad de columnas es: ", m

# La mas sencilla e intuitiva

matriz = []
for i in range(n):
    matriz.append([random.randrange(100)])
    for j in range(m):
        matriz[i].append(random.randrange(100))
		
# Menos intuitiva pero mas eficiente
print matriz

matriz = [None] * n
for i in range(n):
    matriz[i] = [None] * m
		
print matriz

