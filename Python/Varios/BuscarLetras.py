#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Algoritmo
# Leer cadena
# Ordenar cadena
# Comparar caracteres e imprimir

# Funciones

def ordenaCadena(cadena):
    return ''.join(sorted(cadena, key=str.upper))

# Declaracion e inicializacion de variables


# Dado una cadena conformada por las letras mayusculas del alfabeto ingles.
cadena = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

# lectura, manipulacion de datos y presentacion de datos.

print("Ingrese una palabra:", end=" ")
dato = ordenaCadena(input()).upper()

letras = []

for i in range(0, len(cadena)):
    print(cadena[i], " = ", dato.count(cadena[i]))
