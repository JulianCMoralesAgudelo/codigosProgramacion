#!/usr/bin/env python3
# -*- coding: utf-8 -*- 
'''
Script          : edadFormatos.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-04-29
Documentación   :
Descripcion     : 
'''

# Declaracion e inicializacion de variables 


# lectura de datos
print("")
nombre = input("Por favor ingrese su nombre: ")
apellido = input("Por favor ingrese su apellido: ")
edad = int(input("Por favor ingrese su edad en numero entero: "))

# Manipulacion de datos y presentacion de datos.
print("")
print('Hola señor o señora ', nombre ,apellido, '\tsu edad en\tsemestres es:\t',edad * 2)
print('Hola señor o señora ', nombre ,apellido,'\tsu edad en\ttrimestres es:\t',edad * 4)
print('Hola señor o señora ', nombre ,apellido,'\tsu edad en\tmeses es:\t',edad * 12)
print('Hola señor o señora ', nombre ,apellido,'\tsu edad en\tsemanas es:\t',edad * 52)
print('Hola señor o señora ', nombre ,apellido,'\tsu edad en\tdias es:\t',edad * 365)
print("")








