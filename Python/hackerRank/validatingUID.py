#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : validatingUID.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-08
Documentación   : https://www.hackerrank.com/challenges/validating-uid/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
Descripcion     : 

La empresa ABCXYZ tiene hasta 100 empleados.
La empresa decide crear un número de identificación único (UID) para cada uno de sus empleados.
La empresa le ha asignado la tarea de validar todos los UID generados aleatoriamente.

Un UID válido debe seguir las siguientes reglas:

1) Debe contener al menos 2 caracteres del alfabeto inglés en mayúsculas.
2) Debe contener al menos 3 dígitos (0-9).
3) Solo debe contener caracteres alfanuméricos (a-z, A -Z y 0 -9).
4) Ningún personaje debe repetirse
5) Debe haber exactamente 10 caracteres en un UID válido.

'''

# Importaciones
import string
import random

cadena=""

# Creo lista de letras para iterar
mayusculas = [i for i in string.ascii_uppercase]
minusCulas = [i for i in string.ascii_uppercase]

cadena += random.choice(mayusculas)
cadena += random.choice(mayusculas)

def letrasMayusMinus():
    for ()

print(cadena)
