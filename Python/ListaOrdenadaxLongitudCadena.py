#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Declaracion e inicializacion de variables
lista = ['hola', 'julian', 'camilo', 'morales', 'agudelo',
         'berrio', 'bello', 'antioquia', 'medellin', 'colombia']
print("Lista inicial\n")
print(lista)
print("")
# Manipulacion de datos y presentacion de datos.
print("Lista ordenada alfabeticamente\n")
lista.sort()
print(lista)
print("")
print("Lista ordenada por longitud\n")
lista=sorted(lista, key=len)
print(lista)
print("")
