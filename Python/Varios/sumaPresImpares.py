#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : sumaPresImpares.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-04
Documentación   :
Descripcion     : 
'''
import random

limite = random.randint(0, 100)
print()
print(limite)
print()
pares = []
impares = []


for i in limite:
    if(i % 2 == 0):
        pares.append(i)
    else:
        impares.append(i)

print("Resultado")
print("\nNumeros pares :",pares," sumatoria ",sum(pares))
print("\nNumeros pares :",impares," sumatoria ",sum(impares))
print()
