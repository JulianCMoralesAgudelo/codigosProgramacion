#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Declaracion e inicializacion de variables
# lista de comprension

numeros = list(range(3, 401))
# Manipulacion de datos
# Lista que almacenara los datos impares en el rango creado en el paso anterior
impares = [numero for numero in numeros if numero % 2 == 1]
print("La cantidad de elementos en la sucesión de la lista es: ")
print(len(impares)+1)
print("")
print(
    "La sucesión aumenta por 401−3=398, desde el primer hasta el último término.",
    "\nDado que la sucesión aumenta por 2 cada vez, le toma 398/2=199",
    "términos para ir del primero al último.",
    "\nTodavía nos falta contar el primer término, así que hay 199+1=200")
print("")
# Presentacion de datos.
