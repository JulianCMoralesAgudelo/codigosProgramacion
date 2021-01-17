#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : separarLista.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-17
Documentación   : https://www.youtube.com/watch?v=rbH5HJ9IOTA&list=PL2PZw96yQChwNxk7f8stySXf7Cic8oQk8
Descripcion     : Se recibe una cadena de caracteres separados cualquier caracter y se convierte en una lista.
'''

# Declaracion de variables.
print()

# Se recibe cadena de caracteres.
entrada = input('Escriba varios numeros separados por coma: ')

print(entrada)

print(type(entrada))

# Se pasa de cadena a lista mediante el metodo split.
lista = entrada.split(',')

print(type(lista))

print(lista)

