#!/usr/bin/env python
# -*- coding: UTF-8 -*-

# Dado un arreglo de N elementos de tipo entero y un número X ingresado por teclado, escribir un función que:
# A. Busque todos los elementos que coincidan con X y devuelva la cantidad de coincidencias encontradas.
# B. Busque la primera coincidencia del elemento en la lista y devuelva su posición.
# Si X no existe en el arreglo debe devolver -1 .
# C. Utilizando la función anterior, busque todos los elementos que coincidan con X y devuelva un arreglo con las posiciones que
# ocupan estos elementos en el arreglo original. Si no hay elementos coincidentes, devolverá un arreglo vacío.

separador = "#####################################################################################################################################"

#################################################################################################################################################
# Funciones
# A. Busque todos los elementos que coincidan con X y devuelva la cantidad de coincidencias encontradas.


def buscarocurrecnias(lista, dato):
    encontrado = 0
    for i in range(0, len(lista)):
        if(lista[i] == dato):
            encontrado += 1
    return encontrado


# B. Busque la primera coincidencia del elemento en la lista y devuelva su posición.
# C. Utilizando la función anterior, busque todos los elementos que coincidan con X y devuelva un arreglo con las posiciones que
# ocupan estos elementos en el arreglo original. Si no hay elementos coincidentes, devolverá un arreglo vacío.
def buscarposicion(lista, dato, letra):
    posicion = []
    for i in range(0, len(lista)):
        if(lista[i] == dato):
            posicion.append(i)
    if(letra == 'b'):
        if(posicion):
            return posicion[0]
        else:
            return -1
    if(letra == 'c'):
        return posicion


#################################################################################################################################################
# Principal
# Declaracion e inicializacion de variables
print("Ingrese la cantidad de elementos a agregar en el arreglo:")
cantidad = int(input())
lista = []
i = 0
print(separador)
print()
# lectura de datos
for item in range(cantidad):
    print("Ingrese una numero a agregar en el arreglo:")
    palabra = input()
    lista.append(palabra)
print(separador)
print("\n¿Escriba el dato a buscar en el arreglo?")
dato = input()
print(separador)

#################################################################################################################################################
# Presentacion de datos.
print()
print("Arreglo de datos ingresados ", lista)
print("Cantidad de datos iguales ", buscarocurrecnias(lista, dato))
print("Primera posición de datos iguales ", buscarposicion(lista, dato, "b"))
print("Arreglo posiciones de datos iguales ", buscarposicion(lista, dato, "c"))
