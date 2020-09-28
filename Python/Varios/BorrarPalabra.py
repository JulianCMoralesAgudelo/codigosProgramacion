#!/usr/bin/env python
# -*- coding: UTF-8 -*-

# Escriba un programa que permita crear una lista de palabras
# Pida una palabra
# Elimine esa palabra de la lista.

print("Ingrese la cantidad de palabras a crear en la lista:")
cantidad = int(input())
lista = []
i = 0
while i < cantidad:
    print("Ingrese una palabra a agregar en la lista:")
    palabra = input()
    lista.append(palabra)
    print(lista)
    print("¿Desea borrar una palabra de la lista?")
    palabra = input()
    if(palabra == 'si'):
        print("Ingrese una palabra a eliminar:")
        palabra = input()
        lista.remove(palabra)
        i = i - 1
    print(lista)
    i = i+1