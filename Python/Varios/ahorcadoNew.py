#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : 
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2022-03-07
Documentación   : 
Descripcion     : 
'''
# Importar librerias
import configparser
import os

configparser.__name__


def borrarPantalla():  # Definimos la función estableciendo el nombre que queramos
    if os.name == "posix":
        os.system("clear")
    elif os.name == "ce" or os.name == "nt" or os.name == "dos":
        os.system("cls")

# Declaracion de variables
borrarPantalla()

Paises = 'Antigua y Barbuda-Argentina-Bahamas-Barbados-Belice-Bolivia-Brasil-Canadá-Chile-Colombia-Costa Rica-Cuba-Dominica-Ecuador-El Salvador-Estado Unidos-Granada-Guatemala-Guyana-Haití-Honduras-Jamaica-México-Nicaragua-Panamá-Paraguay-Perú-República Dominicana-San Cristóbal y Nieves-San Vicente y las Granadinas-Santa Lucia-Surinam-Trinidad y Tobago-Uruguay-Venezuela'
Paises = Paises.split('-')
print('Paises del continente Americano')
for i in range(len(Paises)):
    print(Paises[i])