#!/usr/bin/env python3
# -*- coding: utf-8 -*-

'''
Script          : interesAnual.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-12
Documentación   : Programa que calcula el interes compuesto, solitando el monto inicial, el interes y la cantidad de años.
'''

# i igual a interes
# n numero de año


def valorFuturo(vp, i, n):
    '''
    Calcula el interes futuro
    '''
    return vp * (1+i)**n


print('')
monto = float(input("Ingrese el monto inicial: "))
interes = float(input("Ingrese numero el interes: "))
anios = int(input("Ingrese los años especificos: "))

print("El valor final de su inversion es de :{0:.2f}".format(valorFuturo(monto, interes/100, anios)))

