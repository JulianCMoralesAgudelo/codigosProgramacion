#!/usr/bin/env python3
# -*- coding: utf-8 -*-

# Definición
'''
Escribior un programa que lea un numero e imprima el cuadrado de los numeros hasta este.
'''

'''
Funciones
'''


def leerNumero(numero):
    while numero <= 0:
        try:
            numero = int(input('Ingresa un numero entero por favor positivo:'))
        except ValueError:
            print("Oops!  No es un numero valido.  Intenta nuevamente...")


# Declaracion e inicializacion de variables y lectura de datos
print('Ingresa la cantidad de numeros a elevar al caudrado')



# Manipulacion de datos y presentacion de datos.
for i in range(1, cantidad):
    print(i, "al cuadrado = ", i ** 2)
