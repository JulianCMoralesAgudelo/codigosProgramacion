#!/usr/bin/env python3
# -*- coding: UTF-8 -*-
import time
import re

# Cadena con los correos
cadena = """
    """

# Se eliminan caracteres externos al utf8
cadena = cadena.encode('ascii', 'ignore').decode('ascii')


# Expresion regular para filtrar los correos
mailsearch = re.compile(r'[\w\-\.]+@[\w\-\.]+\.+[a-zA-Z]{1,4}')

# Lista para almacenar los correos
foundMail = []

#  Bucle para recorrer la cadena y extraer los correos
for mail in mailsearch.findall(cadena):
    foundMail.append(mail)

#  Bucle para Imprimir resultados
for mail in foundMail:
    print(mail)
