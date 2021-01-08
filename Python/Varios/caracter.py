#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : caracter.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-08
Documentación   : https://jarroba.com/busqueda-de-patrones-expresiones-regulares/
Descripcion     : Diseña un programa que,dado un caracter cualquiera, lo identifique si es mayuscula o minuscula,o caracter cualquiera" 

'''

# importando el modulo de regex de python
import re

# Declaracion e inicializacion de variables y lectura de datos
print('')
caracter = input("Escriba un caracter: ")
while len(caracter) != 1:
    caracter = input("Escriba un solo caracter: ")

p = re.compile('[A-Z]+')
m = p.match(caracter)
if m:
    print('Mayuscula ingresada ', m.group())
else:
    p = re.compile('[a-z]+')
    m = p.match(caracter)
    if m:
        print('Minuscula ingresada ', m.group())
    else:
        p = re.compile('[0-9]+')
        m = p.match(caracter)
        if m:
            print('Digito ingresado ', m.group())
        else:
            p = re.compile('\W')
            m = p.match(caracter)
            if m:
                print('Caracter ingresado ', m.group())

print('')
