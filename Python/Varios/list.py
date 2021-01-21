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
'''
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

'''
print()
fib = {1:1,2:1,3:2,4:3} # Diccionario
print(fib.get(4,0)) # El metodo get devuelve el valor de la clave si esta esta en el diccionario y si no devueleve el valor por defecto
print(fib.get(7,5)) # Esta clave no existe en el diccionario pero le estamos diciendo que si no existe dvuelva 5
print(fib.get(7,5)+fib.get(4,0)) # estamos sumando el valor almacenado en una clave existente mas el valor que asignamos a una clave inexistente
print()
