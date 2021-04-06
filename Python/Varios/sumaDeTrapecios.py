#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : sumaDeTrapecios.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   :
Descripcion     : 
'''

# Declaracion e inicializacion de variables
print('')
subdivisiones = int(input('Ingrese la cantidad de subdivisiones: '))
ls = int(input('Ingrese el limite superior: '))
li = int(input('Ingrese el limite inferior: '))
longitudBaseTrapecio = abs(ls - li)
valoresEntrada = []
area = 0
print('Ingrese los datos de entrada variable x: ')
for i in range(subdivisiones + 1):
    valoresEntrada.append(int(input('Ingrese valor de entrada: ')))

for i in range(subdivisiones):
    area += (valoresEntrada[i] + valoresEntrada[i + 1])/2


print(area)


# lectura de datos


# Manipulacion de datos


# Presentacion de datos.
