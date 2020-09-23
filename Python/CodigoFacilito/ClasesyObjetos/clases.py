#!/usr/bin/env python
#-*- coding: iso-8859-15 -*-


# Para python 3 las clases se declaran que heredan de object

# El método constructor de las clases en Python (__init__)

class Humano(): #Creamos la clase Humano
	def __init__(self, edad): #Definimos el atributo edad
	    self.edad = edad # Definimos que el atributo edad, sera la edad asignada

	def hablar(self,mensaje):
	    print (mensaje)

class IngSistemas(Humano):
	def __init__(self): 
	    print ('Hola')

	def programar(self,lenguaje):
    	    print ('Voy a programar en', lenguaje)


class licDerecho(Humano):
	def __init__(self,escuela):
	    print ('Lic, en derecho egresado de:', escuela)
	
	def estudiarCaso(self,de):
	    print ('Debo de estudiar el caso de:', de)


class estudioso(licDerecho,IngSistemas):
	pass

pepe = estudioso('IUD')

pepe.hablar('Hola soy de herencia Multiple')

pepe.programar('C++')

pepe.estudiarCaso('Juan')



# Declaracion e inicializacion de variables


# lectura de datos



# Manipulacion de datos



# Presentacion de datos.
