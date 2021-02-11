#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : printFunction.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-08
Documentación   : https://www.hackerrank.com/challenges/python-print/problem?h_r=next-challenge&h_v=zen
Descripcion     : l código auxiliar incluido leerá un número entero, n, de STDIN. Sin utilizar ningún método de cadena, intente imprimir lo siguiente: 

                Ejemplo n = 5 Imprime la cadena 12345.
'''
dato = input()
dato = int(dato)

for i in range(1, dato+1):
    print(i, end="")

