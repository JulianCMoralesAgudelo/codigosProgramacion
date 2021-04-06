#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : conjuntos.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-19
Documentación   : https://relopezbriega.github.io/blog/2015/10/11/conjuntos-con-python/
Descripcion     : 

Ejemplos de conjuntos en python

'''

# Creando un conjunto en python
A = {1, 2, 3, 4}
print(A)
print('')
lista = ["bananas", "manzanas", "naranjas", "limones"]
print('Lista', lista)
print('')
B = set(lista)
print('Conjunto', B)
print(B)
print('')

# Los conjuntos eliminan los elementos duplicados
lista = ["bananas", "manzanas", "naranjas", "limones",
         "bananas", "bananas", "limones", "naranjas"]
print('Lista', lista)
print('')
B = set(lista)
print('Conjunto', B)
print('')
print('Los conjuntos eliminan los elementos duplicados')
print('')


# Creando el conjunto vacío
O = set()
print(O)
print('')

# Cardinalidad de un conjunto con len().
print("La cardinalidad del conjunto A = {0} es {1}".format(A, len(A)))
print('')

# comprobando membresía
print('2 en A =', 2 in A)
print('')

# Igualdad entre conjuntos. El orden de los elementos no importa.
print('Igualdad entre conjuntos. El orden de los elementos no importa.')
A = {1, 2, 3, 4}
B = {4, 2, 3, 1}
A == B
print('')


# Subconjunto. No hay distincion entre subconjunto y propio
# para el conjunto por defecto de python.
print('')
A = {1, 2, 3}
B = {1, 2, 3, 4, 5}
A.issubset(B)
print('')


# Subconjunto propio
print(A.issubset(B) and A != B)
print('')

# Union de conjuntos
A = {1, 2, 3, 4, 5}
B = {4, 5, 6, 7, 8, 9, 10}
print(A.union(B))
print('')


# Intersección de conjuntos
print(A.intersection(B))
print('')


# Diferencia entre conjuntos
print(A - B)
print('')


