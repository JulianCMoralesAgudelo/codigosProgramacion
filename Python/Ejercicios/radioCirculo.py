#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : radioCirculo.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-17
Documentación   : https://www.youtube.com/watch?v=rbH5HJ9IOTA&list=PL2PZw96yQChwNxk7f8stySXf7Cic8oQk8
Descripcion     : Calcular area circulo.
'''



# Importar librerias
from math import pi

# Declaracion de variables.
print()

r = float(input('Escriba el radio del circulo : '))

area = pi * r ** 2

print('El area del circulo es {}'.format(area))
