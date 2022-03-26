#!/usr/bin/env python3
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

<<<<<<< HEAD
# Declaracion de funciones

# Borrar pantalla
=======
>>>>>>> 94aee5892f66f60c9f968c54011b9db0a1cc8bdf
def borrarPantalla():  # Definimos la función estableciendo el nombre que queramos
    if os.name == "posix":
        os.system("clear")
    elif os.name == "ce" or os.name == "nt" or os.name == "dos":
<<<<<<< HEAD
        os.system("cls")

=======
        os.system("cls")
>>>>>>> 94aee5892f66f60c9f968c54011b9db0a1cc8bdf
