#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class UnoError(Exception):
    def __init__(self, valor):
        self.valorError = valor

    def __str__(self):
        print("No se puede devidir entre 1 el numero", self.valorError)


print("Bienvenido")

d = 5
n = 1

try:
    print (n/5)
except (TypeError, NameError):
    print("Error en tipo de dato")
except ZeroDivisionError:
    print("No se puede dividir entre 0")
else:
    print("No hubo error")
finally:
    print("Me ejecuto pase lo que pase")


try:
    if n == 1:
        raise UnoError(d)
except UnoError:
    print("Se ha producido un error diseñado")
print("Adios")

# Declaracion e inicializacion de variables


# lectura de datos


# Manipulacion de datos


# Presentacion de datos.
