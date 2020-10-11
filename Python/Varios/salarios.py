#!/usr/bin/env python3
# -*- coding: UTF-8 -*-
# Declaracion e inicializacion de variables
# Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 3500.
salarios = []
i = 0
mayores = 0
# lectura de datos
while(i < 10):
    print("Ingresa un salario # ", (i+1), end=" :")
    try:
        dato = int(input())
        salarios.append(dato)
        if(dato > 3500):
            mayores += 1
    except ValueError:
        print("Intenta nuevamente...")
        i -= 1
        if(i == 0):
            i = 0
    i += 1
# Manipulacion de datos y presentacion de datos.
print("\nLos salarios ingresados fueron", salarios)
print("La suma de los salarios ingresados fue", sum(salarios))
print("La cantidad de salarios mayores a 3500 es ", mayores)
print()

