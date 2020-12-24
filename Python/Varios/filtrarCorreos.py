#!/usr/bin/env python
# -*- coding: UTF-8 -*-
import time
import re

# Cadena con los correos
cadena = """    """
# Se eliminan caracteres externos al utf8
cadena = cadena.encode('ascii', 'ignore').decode('ascii')

# Expresion regular para filtrar los correos
mailsearch = re.compile(r'[\w\-\.]+@[\w\-\.]+\.+[a-zA-Z]{1,4}')

# Lista para almacenar los correos
emails = []

#  Bucle para recorrer la cadena y extraer los correos
for mail in mailsearch.findall(cadena):
    emails.append(mail)

# Eliminar correos repetidos.
emails = set(emails)

#  Bucle para Imprimir  y escribir resultados

for mail in emails:    
    print(mail)

# Imprimir cantidad de correos en el conjunto
print(len(emails))

# Organizar correos
sorted(emails)

fic = open("correos.txt", "w")
fic.writelines("%s\n" % s for s in emails)
fic.close()

