#!/usr/bin/env python3
# -*- coding: UTF-8 -*-
# Declaracion e inicializacion de variables
dato = 0

# lectura de datos
while True:
    try:
        dato = int(input("Ingrese un numero entero mayor que 1: "))
    except ValueError:
        print("Intenta nuevamente...")
    if(dato > 1):
        break
# Manipulacion de datos y presentacion de datos.
print(dato)
for i in range(12):
    print(dato, "*", i+1, "\t=", (i*dato))