#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

# Definición de funciones
def palindromo(frase):
    # 1. Quitar acentos y signos de puntuación
    tr = str.maketrans("áéíóúüñÁÉÍÓÚÜÑ.,;!¡¿?", "aeiouunAEIOUUN       ")
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

# lectura de datos y manipulacion de datos


frase = input('Dame una palabra: ')
print(palindromo(frase))

# Presentacion de datos.
