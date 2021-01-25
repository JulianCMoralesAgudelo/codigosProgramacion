#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : Mini-Max Sum
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   : https://www.hackerrank.com/challenges/mini-max-sum/problem
Descripcion     : Imprimir las sumas minima y maxima.
'''

# Funcion


def miniMaxSum(arr):
    lista = []
    for i in range(len(arr)):
        lista.append(sum(arr)-arr[i])
        # Imprimir
    return(min(lista), max(lista))


# lectura de datos
arr = [1, 2, 3, 4, 5]
# Sumar datos y restar el indice de estos
print(miniMaxSum(arr))
