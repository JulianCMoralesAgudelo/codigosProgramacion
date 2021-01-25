#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : birthdayCakeCandles
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   : https://www.hackerrank.com/challenges/birthday-cake-candles/problem?h_r=next-challenge&h_v=zen
Descripcion     : Buscar el numero mas grande de la lista e imprimir la cantidad de veces que se repite
'''


lista = [18, 90, 90, 13, 90, 75, 90, 8, 90, 43]
mayor = max(lista)
cantidad = 0


for i in range(len(lista)):
    if mayor == lista[i]:
        cantidad += 1
print(cantidad)
