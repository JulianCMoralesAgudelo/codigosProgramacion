#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : salarioEmpleado.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 01-05-2021
Descripcion     :

Un obrero necesita calcular su salario semanal, 
el cual se obtiene de la siguiente manera: 
Si trabaja 48 horas o menos se le paga un salario de $3800 por hora, 
si trabaja más de 48 horas se le paga un salario de $5200 
por cada hora extra

'''

# Declaracion e inicializacion de variables y lectura de datos
print()
nombre = input("Ingrese sus nombres y apellidos : ")
horas = float(input("Ingrese la cantidad de horas laboradas esta semana: "))

if horas <= 48:
    print()
    print("Su salario para esta semana es por valor de ", horas * 3800)
    print("Por las", horas, " laboradas.")
else:
    print("Su salario para esta semana es por valor de ", horas * 5200)
    print("Por las", horas, " laboradas.")
print()
