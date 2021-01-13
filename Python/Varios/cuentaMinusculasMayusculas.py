#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : cuentaMinusculasMayusculas
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-08
Documentación   : Programa que identifica los caracteres mayusculas, minusculas, numeros , caracteres y los cuenta. 

'''

# importando el modulo de regex de python
import re


# Declaracion e inicializacion de variables y lectura de datos
texto = input("Ingrese palabra: ")

textoSoloMayusculas = re.sub('[^A-Z]', '', texto)

textoSoloMinusculas = re.sub('[^a-z]', '', texto)

textoSoloNumeros = re.sub('[^\d]', '', texto)

textoSoloCaracteres = re.sub('[^\W]', '', texto)

print("Mayusculas: " + str(len(textoSoloMayusculas)))

print("Minusculas: " + str(len(textoSoloMinusculas)))

print("Numeros: " + str(len(textoSoloNumeros)))

print("Caracteres: " + str(len(textoSoloCaracteres)))
