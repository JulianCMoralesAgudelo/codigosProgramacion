#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : promedios.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   : 
Descripcion     : Calcular el promedio de una lista de numeros
'''

# Preguntar la cantidad de números a ingresar

numero = 0
print()
while(numero <= 0):
    try:
        numero = int(input("Ingrese la cantidad de numeros a promediar: "))
    except:
        print("Intente nuevamente: ")
print()

# Preguntar los números a almacenar en una lista
lista = []
for i in range(numero):
    try:
        lista.append(float(input("ingrese un numero : ")))
    except:
        print("Intente nuevamente: ")

# Sacar o imprimir el promedio  suma(lista)/len(lista)
promedio = sum(lista)/len(lista)

# Imprimir
print()
print("El promedio de los numeros ingresados es = ", promedio)
print()