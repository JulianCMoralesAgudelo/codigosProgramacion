#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : cuentaAtras.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-12
Documentación   : Programa que solicita numero entero postivo e imprime desde el numero hasta en cero en cuenta regresiva.
'''

print('')

while True:
    try:
        num = int(input("Ingrese numero entero positivo: "))
        if num > 0:
            break
    except:
        print('Error')

while num >= 0:
    print(num)
    num -= 1
