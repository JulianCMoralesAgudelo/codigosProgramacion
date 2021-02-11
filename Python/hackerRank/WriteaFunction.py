#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : esBisiesto.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-08
Documentación   : https://www.hackerrank.com/challenges/write-a-function/problem
Descripcion     : Como seguramente sabrás, debido a algunas razones astronómicas, el año pueden ser bisiesto o común . Los primeros tienen una duración de 366 días, mientras que los últimos tienen una duración de 365 días.

Desde la introducción del calendario gregoriano (en 1582), se utiliza la siguiente regla para determinar el tipo de año:

Si el número del año no es divisible entre cuatro, es un año común.
De lo contrario, si el número del año no es divisible entre 100, es un año bisiesto.
De lo contrario, si el número del año no es divisible entre 400, es un año común.
De lo contrario, es un año bisiesto.
'''


'''
Funciones
'''


def esBisiesto(year):
    leap = False
    # Write your logic here
    if year >= 1582:
        if year % 4 == 0:
            if year % 100 == 0:
                if year % 400 == 0:
                    leap = True
                else:
                    leap = False
            else:
                leap = True
        else:
            leap = False
    else:
        leap = False

    return leap


#
# Coloca tu código aquí.
#
print(esBisiesto(int(input(""))))
