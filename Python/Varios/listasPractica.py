#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : listas.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 26/03/2022
Documentación   : https://youtu.be/Gk_fk1RvAys
Descripcion     : Practicas con listas

Script en python que calcula y muestras la suma de dos matrices cuadrada (misma cantidad de renglones y columnas) generadas aleatoriamente.
Utilizar comprensiond e listas para generar as matroces de forma aleatoria.
'''
# Importar librerias
import configparser
import os
import random 

configparser.__name__


# Declaracion de funciones

# Borrar pantalla
def borrarPantalla():  # Definimos la función estableciendo el nombre que queramos
    if os.name == "posix":
        os.system("clear")
    elif os.name == "ce" or os.name == "nt" or os.name == "dos":
        os.system("cls")


# Declaracion de variables
borrarPantalla()

N = int(input('Ingrese un numero entero: '))

# Presentacion
print(f'\nPrograma que calcula la suma de matrices de tamaño {N}x{N}\n')

# Crear una matriz cuadrada con datos generados aleatoriamente
matriz_a = [[random.randint(1,50) for j in range(N)] for i in range(N)]
matriz_b = [[random.randint(1,50) for j in range(N)] for i in range(N)]


# Proceso con for
'''
resultado =[[0] * N for i in range(N)]
for fila in range(N):
    for columna in range(N):
        resultado[fila][columna] = matriz_a[fila][columna] + matriz_b[fila][columna]
'''

resultado = [[matriz_a[i][j]+matriz_b[i][j] for j in range(N)] for i in range(N) ]


print(matriz_a)
print(matriz_b)
print(resultado)
print('\n')

'''
for fila in range(N):
    if fila == N//2:
        print(f'{matriz_a[fila]} + {matriz_b[fila]} = {resultado[fila]}')
    else:
        print(f'{matriz_a[fila]}   {matriz_b[fila]}  {resultado[fila]}')
'''

for i in range(N):
    print(f'{matriz_a[i]} + {matriz_b[i]} = {resultado[i]}') if i == N//2 else print(f'{matriz_a[i]}   {matriz_b[i]}  {resultado[i]}')
    print()


print('\n')