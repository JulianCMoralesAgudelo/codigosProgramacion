#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-

l = [1,2,3,-1,4]
s = ["H","O","L","A"]

print l


def factorial(n):
	i = 1
	while n > 1:
		i = n * i
		yield i
		n -= 1

for e in factorial(5):
	print e


# Declaracion e inicializacion de variables


# lectura de datos



# Manipulacion de datos



# Presentacion de datos.
