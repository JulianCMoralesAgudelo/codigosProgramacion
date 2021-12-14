#!/usr/bin/env python3
# -*- coding: utf-8 -*- 
'''
Script          : priedra_papel_tijera.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 13-12-2021
Documentación   : https://www.youtube.com/watch?v=tWnyBD2src0
Descripcion     : 
'''
# Importacion de librerias
import random


# Declaracion de funciones

def jugar():
    usuario = input("Escoge una opción: 'pi' para piedra, 'pa' para papel, 'ti' para tijera. :").lower()
    computadora = random.choice(['pi','pa','ti'])

    if  usuario == computadora:
        return '¡Empate!'

    if gano_el_jugador(usuario, computadora):
        return '¡Ganaste!'

    return '¡Perdiste!'

def gano_el_jugador(jugador, oponente):
    # Retorna verdadero si el jugador gana
    # Piedra gana a Tijera ( pi>ti )
    # Tijera gana a Papel ( ti>pa )
    # Papel gana a Piedra ( pa>pi )
    if((jugador == 'pi' and oponente =="ti") or (jugador == 'ti' and oponente =="pa") or (jugador == 'pa' and oponente =="pi")):
        return True
    else:
        False


print(jugar())