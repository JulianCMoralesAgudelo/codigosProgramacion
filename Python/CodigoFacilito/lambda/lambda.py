#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-

# Funcion a utilizar con map() y reduce()

def suma(n,m):
	return n+m


# Funcion a utlizar con filter()

def filtrar(n):
	return(n == 'o')


li = [1,-2,1,-4]
lo = [5,3,6,7]
s = "Hoola mundo"


print map(lambda n,m: n+m ,li,lo)
print filter(lambda n: n=='o' ,s)
print reduce(lambda n,m: n+m,lo)

#print map(suma,li,lo)
#print filter(filtrar,s)
#print reduce(suma,lo)


# Declaracion e inicializacion de variables


# lectura de datos



# Manipulacion de datos



# Presentacion de datos.
