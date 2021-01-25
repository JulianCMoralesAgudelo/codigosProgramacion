#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : contarFrecuencias.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   : https://programminghistorian.org/es/lecciones/contar-frecuencias
Descripcion     : Python posee una manera fácil de contar frecuencias, pero requiere el uso del diccionario.
'''

# cuenta-elementos-de-lista-1.py

cadenaPalabras = 'it was the best of times it was the worst of times '
cadenaPalabras += 'it was the age of wisdom it was the age of foolishness'

listaPalabras = cadenaPalabras.split()

frecuenciaPalab = []
for w in listaPalabras:
    frecuenciaPalab.append(listaPalabras.count(w))

print(" ")
print("Cadena\n" + cadenaPalabras + "\n")
print("Lista\n" + str(listaPalabras) + "\n")
print("Frecuencias\n" + str(frecuenciaPalab) + "\n")
print("Pares\n" + str(list(zip(listaPalabras, frecuenciaPalab))))
print(" ")