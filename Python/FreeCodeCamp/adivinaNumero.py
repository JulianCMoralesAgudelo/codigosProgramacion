#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : adivinaNumero
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-11-10
Documentación   : FreeCodecamp
Descripcion     : https://www.youtube.com/watch?v=tWnyBD2src0
'''

import random


def adivinaNumero(x):
    print("======================")
    print(" ¡Bienveido al juego! ")
    print("======================")
    print("=La meta es adivinar un numero aleatorio generado por la computadora")
    # Numer aleatorio entre 1 y x
    aleatorio = random.randint(1, x)

    prediccion = 0

    while prediccion != aleatorio:
        prediccion = int(input(f"Ingrese un numero entero entre 1 y {x}: "))

        if prediccion < aleatorio:
            print("Intenta otra vez, este numero es muy pequeño")
        elif prediccion > aleatorio:
            print("Intenta otra vez, este numero es muy grande")
    print(f"Felicitaciones! Adivinaste el numero {aleatorio} correctamente.")


adivinaNumero(10)
