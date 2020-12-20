#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Definición de funciones
def palindromo(frase):
    # 1. Quitar acentos y signos de puntuación
    tr = str.maketrans("áéíóúüñÁÉÍÓÚÜÑ.,;!¡¿?", "aeiouunAEIOUUN")
    frase = frase.translate(tr)
    # 2. Quitar espacios
    frase = "".join(frase.split())
    # 3. Pasar todo a minúsculas
    frase = frase.lower()
    # Comprobar resultado palindrómico
    if frase == frase[::-1]:
        return True
    else:
        return False


# lectura de datos, manipulacion de datos y presentacion de datos.
lista = ['OSO', 'MARIA', 'ANA', 'GOOGLE', 'OLO']

salida = []

for i in range(len(lista)):
    salida.append(palindromo(lista[i]))


print(lista)
print(salida)
