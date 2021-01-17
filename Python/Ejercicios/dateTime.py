#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : dateTime.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-17
Documentación   : https://www.youtube.com/watch?v=rbH5HJ9IOTA&list=PL2PZw96yQChwNxk7f8stySXf7Cic8oQk8
Descripcion     : Obtener la Fecha y Hora Actuales del Sistema con el Módulo datetime
'''

# Importar librerias
import datetime

ahora = datetime.datetime.now()

print(ahora)

print(type(ahora))

# Formatear la salida
print(ahora.strftime('%d/%m/%Y %H:%M:%S'))
