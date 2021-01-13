#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : listas.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-12
Documentación   : Dada una lista se realizan varias operaciones de manipulacion.

'''

# Dada un lista

lista = [12, 23, 5, 29, 92, 64]


print('')
print(lista)
# Eliminar el ultimo numero y añadir al principio de esta.
lista.insert(0, lista.pop())
print(lista)
# Mover el segndo elemento a la ultima posicion
lista.append(lista.pop(1))
print(lista)
# Añadir el 14 al inicio de la lista.
lista.insert(0, 14)
print(lista)
# Suma todos los elementos de la lista y los añade al final
lista.append(sum(lista))
print(lista)
# Combina la lista actual con la siguiente [4,11,32]
lista = lista + [4, 11, 32]
print(lista)
# Eliminar los impares de la lista.
lista = [par for par in lista if par % 2 == 0]
print(lista)
# Ordena la lista
lista.sort()
print(lista)

