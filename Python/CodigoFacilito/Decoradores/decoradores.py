#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-


loggueado = True 
usuario = "CodigoFacilito"

def admin(f):
	def comprobar(*args, **kwargs):
		if loggueado:
			f(*args,**kwargs)
		else:
			print "No tiene permisos de ejecutar ", f.__name__
	return comprobar


def decorador(funcion):
	def funcionDecorada(*args, **kwargs):
		print "Funcion ejecutada ", funcion.__name__
		funcion(*args,**kwargs)	

	return funcionDecorada

@admin
@decorador
def resta(n,m):
	print n-m


# Decorando
resta(3,5)
#decorador(resta)(5,3)


	




# Declaracion e inicializacion de variables


# lectura de datos



# Manipulacion de datos



# Presentacion de datos.
