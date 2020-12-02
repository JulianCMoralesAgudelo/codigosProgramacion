#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Declaracion e inicializacion de variables

an = int(input("Ingrese el numero final an: "))
a1 = int(input("Ingrese el numero inicial a1: "))
d = int(input("Ingrese la Constante o diferencia común d: "))

# lista de comprension
datos = list(range(a1, an))
lista = [numero for numero in datos if numero % 2 == 1]
recorrido = an-a1
n = ((an - a1)/d) + 1
promedio = (a1+an)/2
# lista = [numero for numero in datos]
# Manipulacion de datos
print("El recorrido entre an-a1 (", an, ") - (", a1, ") =", recorrido)
print("La cantidad de numeros, es el recorrido:", recorrido,
      "sobre la diferencia", d, " (an-a1/d) + 1 =", recorrido/d + 1)
print("La cantidad de numeros es:", n)
print("La sumatoria de numeros en la lista es de:", promedio*n)
