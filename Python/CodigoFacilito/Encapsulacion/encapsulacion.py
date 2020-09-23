#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-

class Prueba(object):
	def __init__(self):
		self.__privado = "Soy privado"
		self.privado = "Soy publico"

	def __metodoPrivado(self):
		return "Soy privado"

	def metodoPublico(self):
		print "Soy publico"


	def getPrivado(self):
		return self.__privado

	def setPrivado(self,valor):
		self.__privado = self.__metodoPrivado()

obj = Prueba()

#print obj.privado
#print obj.__privado

#obj.metodoPrivado()
#obj.__metodoPrivado()

obj.setPrivado("Tengo nuevo valor")
print obj.getPrivado()



# Declaracion e inicializacion de variables


# lectura de datos



# Manipulacion de datos



# Presentacion de datos.
