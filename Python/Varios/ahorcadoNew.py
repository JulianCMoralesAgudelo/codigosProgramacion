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
import random
import secrets

configparser.__name__

# Funciones

# Limpiar pantalla


def borrarPantalla():
    if os.name == "posix":
        os.system("clear")
    elif os.name == "ce" or os.name == "nt" or os.name == "dos":
        os.system("cls")


# Declaracion de variables
borrarPantalla()

Paises = 'Antigua y Barbuda-Argentina-Bahamas-Barbados-Belice-Bolivia-Brasil-Canadá-Chile-Colombia-Costa Rica-Cuba-Dominica-Ecuador-El Salvador-Estado Unidos-Granada-Guatemala-Guyana-Haití-Honduras-Jamaica-México-Nicaragua-Panamá-Paraguay-Perú-República Dominicana-San Cristóbal y Nieves-San Vicente y las Granadinas-Santa Lucia-Surinam-Trinidad y Tobago-Uruguay-Venezuela'
Paises = Paises.split('-')
# print('Paises del continente Americano')
# print(Paises)

MAX_FALLOS = 5

# Funciones

# Crear cadenas


def crearCadenas():
    pais = random.choice(Paises)
    secreto = '_'*len(pais)
    return pais, secreto

# remplazar Simbolo


def remplazarSimbolo(original, secreto, simbolo):
    cantidad = original.count(simbolo)
    inicio = 0
    for i in range(cantidad):
        pos = original.find(simbolo, inicio)
        secreto = secreto[:pos] + simbolo + secreto[pos+1:]
        inicio = pos + 1
    return secreto



# Logica del juego
def ahorcado():
    print(f'Bienvenido al juego del ahorcado, debes adivinar el nombre de uno de los 35 paises del continente americano\ntienes hasta {MAX_FALLOS} para intentarlo. ¡Comencemos!')
    print('\n')
    input('Presiona enter para comenzar ')
    original, secreto = crearCadenas()
    fallos = 0
    while secreto != original and fallos < MAX_FALLOS:
        borrarPantalla()
        print(f'Palabra:  {secreto}')
        letra = input('¿Cual simbolo quieres destapar? ')
        if letra in original:
            secreto = remplazarSimbolo(original, secreto, letra)
            print('La letra existe en la plabra ')
            print(secreto)
        else:
            print('Esa letra no existe en la palabra ')
            fallos += 1
        input('Presiona enter para continuar ')
    if secreto == original:
        print(f'Felicidades, el pais es {secreto}')
    else:
        print(f'Lo siento, el pais era {original}')

# Principal
def main():
    ahorcado()

if __name__ == '__main__':
    main()
