#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : angurrioso.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-04
Documentación   :
Descripcion     : 
'''
import random

# Declaracion e inicializacion de variables y lectura de datos

print("")
print("Bienvenido al juego del angurrioso.")
print("\nLa dinamica del juego es tirar el dado 6 veces y luego se suman los puntos de cada jugada.")
print("\nEl juego termina cuando saques el numero 1")

print("\nResultados")

i = 1
jugadas = 6
dado = 0
lista = []
pregunta = ''

print("")
while i <= jugadas:
    i += 1
    dado = random.randint(1, 6)
    pregunta = 'Quiere seguir jugando'
    if dado == 1:
        print("Fallaste, salio el numero",dado,"Juego terminado por reglamento")
        lista.append(dado)
        break
    else:
        lista.append(dado)        

if 1 not in lista:
    print("El juego fue terminado exitosamente")
    print("\nEl puntaje obtenido es ",sum(lista))
print("\nLos resultados obtenidos fueron ",lista)    
print("")
