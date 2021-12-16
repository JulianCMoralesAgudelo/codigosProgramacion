#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          :
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   :
Descripcion     :
'''

import random
import time

def busqueda_lineal(lista,objetivo):
    for i in range(len(lista)):
        if lista[i]== objetivo:
            return i
    return -1

def busqueda_binaria(lista, objetivo, limite_inferior=None, limite_superior=None):
    if limite_inferior is None:
        limite_inferior = 0 # Inicio lista.
    if limite_superior is None:
        limite_superior = len(lista) - 1 # Fin lista.
    if limite_superior < limite_inferior:
        return -1

    punto_medio = (limite_inferior + limite_superior) // 2

    if lista[punto_medio] == objetivo:
        return punto_medio
    elif objetivo < lista[punto_medio]:
        return busqueda_binaria(lista,objetivo, limite_inferior, punto_medio-1)
    else:
        return busqueda_binaria(lista,objetivo, punto_medio+1,limite_superior)

if __name__=='__main__':
    # Crear lista ordenada con diezmil numero aleatorios
    longitud = 10000
    conjunto_inicial = set()

    while len(conjunto_inicial) < longitud:
        conjunto_inicial.add(random.randint(-3 * longitud,3 * longitud))

    lista_ordenada = sorted(list(conjunto_inicial))

    # Medir tiempo de respuesta por busqueda lineal
    inicio = time.time()
    for objetivo in lista_ordenada:
        busqueda_lineal(lista_ordenada,objetivo)
    fin = time.time()
    print(f"Tiempo de busqueda lineal: {(fin - inicio):.2f} segundos")
    # Medir tiempo de respuesta por busqueda binaria

    inicio = time.time()
    for objetivo in lista_ordenada:
        busqueda_binaria(lista_ordenada, objetivo)
    fin = time.time()
    print(f"Tiempo de busqueda binaria: {(fin - inicio):.2f} segundos")


