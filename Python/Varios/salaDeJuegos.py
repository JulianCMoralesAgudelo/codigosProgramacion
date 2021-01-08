#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script       : salaDeJuegos.py
Autor        : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión      : 1.0
Modificado   : 2021-01-08
Descripcion  : Escribir un programa para una empresa que tiene salas de juegos para todas las edades y quiere calcular de forma automatica el precio que "debe cobrar a sus clientes por entrar.

El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. Si el cliente es menor de 4 anos puede entrar gratis, si tiene entre 4 y 18 anos debe pagar 5€ y si es mayor de 18 anos, 10€."
'''

# Declaracion e inicializacion de variables y lectura de datos
print()
nombre = input("Escriba su nombre: ")
edad = int(input("Escriba su edad: "))


# Manipulacion de datos y Presentacion de datos.

if(edad < 4):
    print('Usted :', nombre, 'cuenta con entrada gratis.')
elif (edad == 4 | edad < 18):
    print("Valor a pagar 5€ para usted", nombre)
elif (edad > 18):
    print("Valor a pagar 10€ para usted", nombre)
    print("Estas viejito no -_-")
