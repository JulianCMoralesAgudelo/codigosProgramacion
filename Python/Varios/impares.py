#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : impares.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-12
Documentación   : Programa que solicita numero entero postivo e imprime los impares hasta el ingresado.

'''

print('')

while True:
    try:
        num = int(input("Ingrese numero entero positivo: "))
        if num > 0:
            break
    except:
        print('Error')
        
i = 1

while i < num:
    if i % 2 != 0:
        print(i)
    i += 1
