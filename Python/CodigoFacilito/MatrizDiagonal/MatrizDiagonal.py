#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-

# Declaracion e inicializacion de variables
# Sentencia para imnportar numeros aleatorios
import random

# Funcion para imprimir una matriz.
def dibujaMatriz(M):
	for i in range(len(M)):
		print '[',
		for j in range(len(M[i])):
			print '{:>3s}'.format(str(M[i][j])),
		print ']'

# lectura de datos
# Pregunto por la cantidad de filas
n = int(raw_input("Ingresa la cantidad de filas : "))
try:
	n = int(filas)
except:
	"Eso no es un numero"
else:
	print "La cantidad de filas es: ", n
print ("")
# Pregunto por la cantidad de columnas
m = int(raw_input("Ingresa la cantidad de columnas : "))
try:
	m = int(columnas)
except:
	"Eso no es un numero"
else:
	print "La cantidad de columnas es: ", m

# Crear una matriz de forma dinamica
matriz = [0] * n
for x in range (n):
    matriz[x] = [0] * m

# Llenar matriz con numeros aleatorios hasta el numero 100
for i in range(n):		
		for j in range(len(matriz[i])):
			matriz[i][j]=random.randrange(100)

#Imprimimos la lista original
print ""
print "Matriz original"
dibujaMatriz(matriz)
print ""

# Creo dos listas vacias para almacenar el resultado de las busquedas, aunque se puede imprimir sin necesida de guardar.
DiagonalPrincipal = [ ]
DiagonalSecundaria = [ ]


# Para crear la matriz diagonal pregunto si la posicion i es igual a la posicion j, de ser asi guardo el dato.
if n==m:
	print "Perfecto el numero de filas y de columnas son iguales: ",n,"filas y ",m,"columnas"
	print ""
	print "Diagonal principal"
	for i in range(len(matriz)):
		for j in range(len(matriz[i])):
			if(i==j):
				DiagonalPrincipal.append(matriz[i][j])
	print DiagonalPrincipal
	print ""
	# Para crear la matriz diagonal pregunto si la posicion i + j es igual la cantidad menos filas o columnas, de ser asi guardo el dato.
	print "Diagonal secundaria"	
	for i in range(len(matriz)):
		for j in range(len(matriz[i])):
			if(i+j==n-1):
				DiagonalSecundaria.append(matriz[i][j])	
	print DiagonalSecundaria
	print ""
	
else:
	print "No es posible ya que el numero de filas y de columnas no son iguales:",n,"filas y",m,"columnas"
	print ""
	print "Para mayor informacion, puede visitar"
	print ""
	print "https://es.wikipedia.org/wiki/Diagonal_principal"



