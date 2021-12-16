#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          :
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-22
Documentación   :
Descripcion     :
'''

import random
import time

def busqueda_lineal(lista,objetivo):
    for i in range(len(lista)):
        if lista[i]== objetivo:
            return i
    return -1

lista = [1,3,5,10,12]

print(busqueda_lineal(lista,10))