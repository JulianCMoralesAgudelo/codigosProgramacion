#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : fileExtenxion.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-17
Documentación   : https://www.youtube.com/watch?v=rbH5HJ9IOTA&list=PL2PZw96yQChwNxk7f8stySXf7Cic8oQk8
Descripcion     : obtiene la extension de un archivo
'''

# Declaracion de variables.
print()

nombre_archivo = input("Ingrese el nombre del archivo: ")

# main.py

partes_nombre_archivo = nombre_archivo.split('.')

print(partes_nombre_archivo)


print(partes_nombre_archivo[-1])