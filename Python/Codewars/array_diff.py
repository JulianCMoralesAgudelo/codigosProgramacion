#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : array_diff.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-19
Documentación   : https://www.codewars.com/kata/523f5d21c841566fde000009/train/python
Descripcion     : 

Su objetivo en este kata es implementar una función de diferencia, que resta una lista de otra y devuelve el resultado.

It should remove all values from list a, which are present in list b.


1) Leer lista a
2) Leer lista b
2) Buscar diferencias
3) imprimir


'''

a = 5
print(a)
a = 'a'
print(a)

'''
def array_diff(a, b):
    result = [x for x in a if x not in b]
    return result


print(array_diff([1, 2], [1]))
print(array_diff([1, 2, 2], [1]))
print(array_diff([1, 2, 2], [2]))
print(array_diff([1, 2, 2], []))
print(array_diff([], [1, 2]))
'''