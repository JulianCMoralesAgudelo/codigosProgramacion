#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : apruebaExamen.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-01
Documentación   : https://www.comfenalcoantioquia.edu.co/
Descripcion     : Determinar si un alumno aprueba o reprueba un diplomado, sabiendo que aprobara si su
promedio de cinco calificaciones es mayor o igual a 4; reprueba en caso contrario.
'''

# Declaracion e inicializacion de variables


# lectura de datos
print("")
nombre = input("Por favor ingrese su nombre: ")
apellido = input("Por favor ingrese su apellido: ")
nota = 0.0
promedio = 0.0
# Se crea una lista vacia para almacenar las notas 
notas = []

# Manipulacion de datos y presentacion de datos.
print("")
print("Por favor ingrese sus notas para este periodo academico.")
print("")
for i in range(5):
    print("Por favor ingrese sus nota #", (i+1), end=": ")
    # Se simula un ciclo do while para leer las notas.
    while True:
        nota = float(input())
        if not(nota < 0 and nota > 5):
           print("Ingrese un numero mayor o igual a cero 0 o menor o igual a cinco 5") 
        else:
            notas.append(nota)
            break;
# El promedio es la suma de las notas divido la cantidad de notas.
promedio = sum(notas)/len(notas)

if promedio >= 4:
    print("El estudiante",nombre,apellido," ha aprobado con una nora de ",promedio)
else:
    print("El estudiante",nombre,apellido," ha reprobado con una nora de ",promedio)