#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-


# Declaracion e inicializacion de variables
lista = [1,"Dos",3]

print lista

buscar = 1

if buscar in lista:
	print lista.index(buscar)
else:
	print "No esta el elemento"

lista.append("Nuevo elemento")

print lista

print lista.count(3)

lista.insert(2,[5,"Uno",True])

print lista


iterable = "Cadena"

lista.extend(iterable)

print lista

print lista.pop()
print lista.pop(2)

lista.append("Dos")
lista.remove(3)

print lista

lista.reverse()

print lista
