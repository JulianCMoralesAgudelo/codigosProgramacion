#!/usr/bin/env python3
# -*- coding: utf-8 -*- 
'''
Script          : bitCounting.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-09
Documentación   : https://www.codewars.com/kata/526571aae218b8ee490006f4/train/python
Descripcion     : 

Escriba una función que tome un número entero como entrada y devuelva el número de bits que son iguales a uno en la representación binaria de ese número. Puede garantizar que la entrada no sea negativa.

Ejemplo: la representación binaria de 1234 es 10011010010, por lo que la función debería devolver 5 en este caso
'''
from solution import count_bits

print(count_bits(1234))