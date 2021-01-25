#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : reverseWords.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   : 
Descripcion     :

Se le da una matriz de caracteres arr que consta de secuencias de caracteres
separados por espacios.

Cada secuencia de caracteres delimitada por espacios define una palabra.

Implemente una función reverseWords que invierta el orden de las palabras en la matriz de la
manera más eficiente.

Explique su solución y analice sus complejidades temporales y espaciales.

Complejidad temporal: cuanto se demora un algoritmo en terminar.

Complejidad espacial: cuanta memoria operativa (RAM usualmente) es requerida por el algoritmo.

Esto tiene dos apartados, la cantidad de memoria que necesita el código y la cantidad que
necesitan los datos sobre los que opera el algoritmo.

Example:

input:  arr = [ 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ',
                'm', 'a', 'k', 'e', 's', '  ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' ]

output: [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', '  ',
          'm', 'a', 'k', 'e', 's', '  ',
          'p', 'e', 'r', 'f', 'e', 'c', 't' ]
'''


# Recorrer el array y añadir los elementos hasta enconrar un espacio.
# Invertir las listas
# Concatenar
# Imprimir

# Funcion recorrer array.
def recorrerArray(arr):
    cadena = ''
    for i in range(len(arr)):
        if arr[i] != '  ':
            cadena += arr[i]
        else:
            cadena += '  '

    lista = cadena.split()
    lista.reverse()
    arr = []
    for i in range(len(lista)):
        for j in lista[i]:
            arr.append(j)
        arr.append('  ')
    print(arr)


# Declarar array.
arr = ['p', 'e', 'r', 'f', 'e', 'c', 't', '  ',
       'm', 'a', 'k', 'e', 's', '  ',
       'p', 'r', 'a', 'c', 't', 'i', 'c', 'e']

# Main
recorrerArray(arr)
