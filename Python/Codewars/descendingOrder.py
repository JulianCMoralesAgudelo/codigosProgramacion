#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : descendingOrder.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-09
Documentación   : https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/python
Descripcion     : 

Su tarea es crear una función que pueda tomar cualquier número entero no negativo como argumento y devolverlo con sus dígitos en orden descendente. Básicamente, reorganice los dígitos para crear el número más alto posible.

Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321


1) Leer Numero
2) Separar por digitos
3) Organizar descendentemente

'''

# Declaracion de variables


def descending_order(num):
    # Bust a move right here
    cifras = []
    cadena = ""
    out = 0
    if not (num <= 0):
        while(num > 0):
            cifras.append(num % 10)
            num = num // 10

        cifras.sort(reverse=True)

        for i in cifras:
            cadena += str(i)
        num = int(cadena)

        return num
    else:
        return num

'''
def Descending_Order(num):
    return int("".join(sorted(str(num), reverse=True)))
'''

'''
def Descending_Order(num):
    if isinstance(num, int) and num >= 0:
        return int(''.join(sorted(str(num),reverse=True)))
    else:
        raise ValueError('Non-negative integer expected')
'''
print(descending_order(0))
print(descending_order(15))
print(descending_order(51))
print(descending_order(111))
print(descending_order(2110))
print(descending_order(282))
print(descending_order(183364))
print(descending_order(123456789))
print(descending_order(987654321))
