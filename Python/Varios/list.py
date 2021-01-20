#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : List
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-19
Documentación   :
Descripcion     : 
'''

# Declaracion e inicializacion de variables


# lectura de datos


# Manipulacion de datos


# Presentacion de datos.
dato = None

print("")
while True:
    print("Ingrese un numero entero: ")
    try:
        dato = int(input(""))
        break
    except:
        print("Dato invalido")

print("")
print("Dato ingresado correctamente")
print(dato)
