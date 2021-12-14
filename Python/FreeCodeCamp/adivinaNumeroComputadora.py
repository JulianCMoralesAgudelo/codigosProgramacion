#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : adivinaNumeroComputadora
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-11-10
Documentación   : FreeCodecamp
Descripcion     : https://www.youtube.com/watch?v=tWnyBD2src0
'''

import random


def adivinaNumeroComputadora(x):
    print("======================")
    print(" ¡Bienveido al juego! ")
    print("======================")
    print(
        f"Ingrese un numero entero entre 1 y {x} para que la computadora lo adivine. ")
    # Numer aleatorio entre 1 y x
    limiteInferior = 1
    limiteSuperior = x
    respuesta = ""

    while respuesta != "c":
        if limiteInferior != limiteSuperior:
            prediccion = random.randint(limiteInferior, limiteSuperior)
        else:
            prediccion = limiteSuperior
        # Respuesta
        respuesta = input(
            f"Mi prediccion es {prediccion} Si es muy alta, ingresa (A). Si es muy baja ingresa (B). Si es correcta ingresa (C): ").lower()

        if respuesta == "a":
            limiteSuperior = prediccion - 1
        elif respuesta == "b":
            limiteInferior = prediccion + 1
    print(
        f"La computadora adivino tu numero {prediccion}. ")


adivinaNumeroComputadora(10)
