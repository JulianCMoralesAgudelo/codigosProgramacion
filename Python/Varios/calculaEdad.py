#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : calculaEdad.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-12
Documentación   : Programa que solicita edad e imprime los años desde su nacemiento.

'''

print('')
print('Ingrese los datos solictados con numeros enteros')
anioA = int(input("Ingrese el años actual: "))
mesA = int(input("Ingrese el mes actual: "))
diaA = int(input("Ingrese dia actual: "))

print('')

anioN = int(input("Ingrese su año de nacimiento: "))
mesN = int(input("Ingrese su mes de nacimiento: "))
diaN = int(input("Ingrese su dia de nacimiento: "))

fechaActual = (anioA, mesA, diaA)
fechaNacimiento = (anioN, mesN, diaN)


edad = anioA-anioN
# Si el mes actual es menor al mes de nacimiento se resta una unidad
edad -= ((mesA, diaA) < (anioN, mesN))



print('')

print(edad)

print('')