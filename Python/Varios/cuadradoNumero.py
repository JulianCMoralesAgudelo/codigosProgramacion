#!/usr/bin/env python3
# -*- coding: utf-8 -*-

'''
Script       : Cuadrado Numeros
Autor        : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión      : 1.0
Modificado   : 2021-01-08
Descripcion  : Script que solicita una cantidad numeros y luego eleva estos al cuadrado.
'''
# ********************************************************************************

# Declaracion e inicializacion de variables y lectura de datos
lista = []


# ********************************************************************************
# Definición
'''
Escribir un programa que lea un numero e imprima el cuadrado de los numeros hasta este.
'''


def leerNumero():
    try:
        numero = int(input("Ingresa un numero entero: "))
    except:
        print('Inténtelo de nuevo')
    return numero


# Leer numeros
print('')
cantidad = int(input("Escriba la cantidad de números positivos a leer: "))
while cantidad < 1:
    objetivo = int(
        input("La cantidad debe ser mayor que 0. Inténtelo de nuevo: "))

print()
for i in range(cantidad):
    lista.append(leerNumero())


# Imprimir numeros
print()
print("Resultados:")
for i in range(len(lista)):
    print('El numero', lista[i], ' elevado al cuadrado =', (lista[i]**2))
print()
