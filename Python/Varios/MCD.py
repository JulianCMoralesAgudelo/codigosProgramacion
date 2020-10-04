#!/usr/bin/env python
# -*- coding: UTF-8 -*-


# Funciones
'''
Funcion MCD que encuentra el maximo comun divisor.
'''


def mcd(x, y):
    mcd = 1

    if x % y == 0:
        return y

    for i in range(int(y/2), 0, -1):
        if (x % i == 0) & (y % i == 0):
            mcd = i
            break
    return mcd


# Declaracion e inicializacion de variables
print("Ingrese dos numeros para buscar el mcd: ")

# lectura de datos
print("Ingrese el primer numero:    ", end="")
x = int(input())
print("Ingrese el segundo numero:   ", end="")
y = int(input())

# Manipulacion de datos y Presentacion de datos.
print(mcd(x, y))
