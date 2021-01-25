#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : entradaNumero.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   :
Descripcion     :
'''
# Importaciones
import re

# 1) Leer texto

number = input("Please enter a number: ")
while not re.match("^[0-9 \-]+$", number):
    print("Error! Make sure you only use numbers")
    number = input("Please enter a number: ")
number = int(number)
print("You picked number " + str(number))


