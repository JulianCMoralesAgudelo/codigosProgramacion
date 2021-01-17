#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : invertirCadena.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-17
Documentación   : https://www.youtube.com/watch?v=rbH5HJ9IOTA&list=PL2PZw96yQChwNxk7f8stySXf7Cic8oQk8
Descripcion     : invertir una cadena.
'''

# Declaracion de variables.

cadena = 'Python'

# Recorrer la cadena
for i in range(len(cadena)):
    print((cadena[len(cadena)-1-i]), end=' ')


print()

# Mediante notación slice de Python

print(cadena[-1:0])


