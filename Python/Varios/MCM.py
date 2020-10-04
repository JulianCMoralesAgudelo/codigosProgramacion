#!/usr/bin/env python
# -*- coding: UTF-8 -*-


# Funciones
'''
Funcion MCM que encuentra el minimo comun multiplo.
'''


def mcm(x, y):
    z = max(x, y)

    while True:
        if (z % x == 0) & (z % y == 0):
            return z
        z += 1


# Declaracion e inicializacion de variables
print("Ingrese dos numeros para buscar el mcm: ")

# lectura de datos
print("Ingrese el primer numero : ", end="")
x = int(input())
print("Ingrese el segundo numero: ", end="")
y = int(input())

# Manipulacion de datos y Presentacion de datos.
print(mcm(x, y))
