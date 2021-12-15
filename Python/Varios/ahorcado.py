#!/usr/bin/env python3
# -*- coding: utf-8 -*- 
'''
Script          : ahoraco.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-12-14
Documentación   : https://www.youtube.com/watch?v=tWnyBD2src0
Descripcion     : 
'''
import string
import random
from palabras import palabras
from ahorcado_diagramas import vidas_diccionario_visual

def obtener_palabra_valida(palabras):
    # Seleccionar una palabra al azar de la lista de plabras validas
    palabra = random.choice(palabras)

    while '-' in palabra or ' ' in palabra:
        palabra = random.choice(palabras)
    return palabra.upper()


def ahorcado():

    print("========================================")
    print(" ¡Bienvenido(a) al juego del Ahorcado! ")
    print("========================================")
    palabra = obtener_palabra_valida(palabras)
    letras_por_adivinar = set(palabra)
    letras_adivinadas = set()
    abcdario = set(string.ascii_uppercase)

    vidas = 7

    while len(letras_por_adivinar) > 0 and vidas > 0:
        print(f"Te quedan {vidas} vidas y has usado estas letras: {' '.join(letras_adivinadas)}")

        # Mostrar el estado actual de la palavra
        palabra_lista = [letra if letra in letras_adivinadas else '-' for letra in palabra]
        # Mostar estado del ahorcado
        print(vidas_diccionario_visual[vidas])
        # Mostar palabras separadas por in espacio
        print(f"Palabra: {' '.join(palabra_lista)}")

        letra_usuario = input("Escoge una letra: ").upper()

        # Si la letra escogida esta en el abcdario y no en el conjunto de  letras ingresadas se añade la letra al conjunto de letras ingresadas
        if letra_usuario in abcdario - letras_adivinadas:
            letras_adivinadas.add(letra_usuario)

            # Si la letra esta en la palabra
            if letra_usuario in letras_por_adivinar:
                letras_por_adivinar.remove(letra_usuario)
                print('')
            else:
                vidas = vidas - 1
                print(f"\nTu letra, {letra_usuario} no esta en la palabra.")
        # Si la ñetra escogida por el susario ya fue ingresada.
        elif letra_usuario in letras_adivinadas:
            print(f"\nYa escogiste esa letra. Por favor escoge una ñetra nueva.")
        else:
            print("\nEsta letra no es valida")

    # El juego llega a esta linea cuando se adivinan todas las letras de la palabra o pierde el juego
    if vidas == 0:
        print(vidas_diccionario_visual[vidas])
        print(f"¡Ahorcado! Perdiste. Lo lamento mucho. La palabra era: {palabra}")
    else:
        print(f"¡Excelente! ¡Adivinaste la palabra {palabra}!")


ahorcado()