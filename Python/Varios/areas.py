#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : areas.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-08
Documentación   : 
Descripcion     : Crear una funcion que permita al usuario calcular el area de figuras geometricas.
'''

# Funciones
# Areas

# Triangulo


def areaTriangulo(a, b):
    print("El area del triangulo es:", end=" ")
    return (a*b)/2

# Paralelogramo


def areaParalelogramo(a, b):
    print("El area del triangulo es:", end=" ")
    return (a*b)

# Rectangulo


def areaRectangulo(a, b):
    print("El area del triangulo es:", end=" ")
    return (a*b)


# Cuadrado

def areaCuadrado(a, b):
    print("El area del triangulo es:", end=" ")
    return (a*b)

# Rombo

def areaRombo(a, b):
    print("El area del triangulo es:", end=" ")
    return (a*b)

# Rombo

def areaRombo(a, b):
    print("El area del triangulo es:", end=" ")
    return (a*b)


# Menu


def switch(case, a, b):
    sw = {
        1: areaTriangulo(a, b),
        2: areaParalelogramo(a, b),
        3: areaRectangulo(a, b),
        4: areaCuadrado(a, b),
        4: areaRombo(a, b),
    }
    return sw.get(case, default())


# lectura de datos y Presentacion de datos.
print("")
a = int(input("Ingrese la altura de la figura: "))
b = int(input("Ingrese la base de la figura: "))

print(areaTriangulo(a, b))
