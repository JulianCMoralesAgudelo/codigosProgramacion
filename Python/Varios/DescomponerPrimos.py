#!/usr/bin/env python
# -*- coding: UTF-8 -*-


# Funciones
'''
Funcion que descompone un numero dado en sus numeros primos
'''


def descomponer(n):
    primos = []

    for i in range(2, n+1):
        while n % i == 0:
            primos.append(i)
            n = n / i
    return primos


# Declaracion e inicializacion de variables
print("Ingrese un numero a descomponer en primos: ", end="")

# lectura de datos
n = int(input())

# Manipulacion de datos y Presentacion de datos.
print(descomponer(n))
