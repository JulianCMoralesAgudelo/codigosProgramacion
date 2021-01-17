#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : mostrarFecha.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-17
Documentación   : https://www.youtube.com/watch?v=rbH5HJ9IOTA&list=PL2PZw96yQChwNxk7f8stySXf7Cic8oQk8
Descripcion     : imprimirFecha de una tupla.
'''

# Declaracion de variables.
print()

fechaEvento = (2021, 12, 15)

print(type(fechaEvento))

print('El evento proramdo sera para la fecha:', fechaEvento)


# Impresion mediante placeholder o fromateo de impresion.

print('El evento proramdo sera para la fecha: %i/%i/%i' % fechaEvento)

# Impresion mediante desestructuracion.

agnio, mes, dia = fechaEvento

print('El evento proramdo sera para la fecha: {}/{}/{}'.format(agnio, mes, dia))
