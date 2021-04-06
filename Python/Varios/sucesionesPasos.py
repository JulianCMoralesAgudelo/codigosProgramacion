#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Declaracion e inicializacion de variables
print("Paso 1: encuentra a1 y an (el primer y el último término)")
print("Donde a1 es el primer término, an es el último término, y nnnn es el número de términos.")
an = int(input("Ingrese el numero final an: "))
a1 = int(input("Ingrese el numero inicial a1: "))
n = int(input("Ingrese el la cantidad n: "))

recorrido = an-a1
suma = ((a1 + an)/2) * n

# Manipulacion de datos
print("El recorrido entre an-a1 (", an, ") - (", a1, ") =", recorrido)
print("La Sumatoria de la sucesión es =", suma)
