#!/usr/bin/env python3
# -*- coding: utf-8 -*-

'''
Script          : esPrimo.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-12
Documentación   : Programa que solicita numero entero postivo e imprime si es numero primo.
'''


def esPrimo(numero):
    if numero < 1:
        return False
    elif numero == 1:
        return False
    elif numero == 2:
        True
    else:
        for i in range(2, numero):
            if numero % i == 0:
                return False
    return True


print('')

numero = int(input("Ingrese un numero entero: "))

if esPrimo(numero):
    print('')
    print("El numero ingresdo es primo")
else:
    print('')
    print("El numero ingresdo no es primo")

print('')
