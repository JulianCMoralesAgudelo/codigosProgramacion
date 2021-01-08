#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script       : tributar.py
Autor        : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión      : 1.0
Modificado   : 2021-01-08
Descripcion  : Para tributar un determinado impuesto se debe ser mayor de 16 anos y tener unos ingresos iguales o superiores a 1000 € mensuales.
Escribir un programa que pregunte al usuario su edad y sus ingresos mensuales y muestre por pantalla siel usuario tiene que tributar o no.
'''

# Declaracion e inicializacion de variables y lectura de datos
print()
nombre = input("Escriba su nombre: ")
edad = int(input("Escriba su edad: "))
ingresos = float(input("Escriba sus ingresos mensuales: "))

# Manipulacion de datos y resentacion de datos.
if (edad > 16) & (ingresos > 1000):
    print('Usted :', nombre, 'cumple los requeisitos para tributar.')
else:
    print('Usted :', nombre, 'no cumple los requeisitos para tributar.')
print()
