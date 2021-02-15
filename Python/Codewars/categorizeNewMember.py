#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : categorizeNewMember.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-11
Documentación   : https://www.codewars.com/kata/5502c9e7b3216ec63c0001aa/train/python
Descripcion     : 

El Club de Croquet de Western Suburbs tiene dos categorías de membresía, Senior y Open. Les gustaría su ayuda con un formulario de solicitud que les dirá a los posibles miembros en qué categoría se ubicarán.

Para ser senior, un socio debe tener al menos 55 años y tener un hándicap superior a 7. 

En este club de croquet, los hándicaps van de -2 a +26; cuanto mejor sea el jugador, menor será la desventaja.

entrada

La entrada consistirá en una lista de listas que contienen dos elementos cada una. Cada lista contiene información de un único miembro potencial. La información consiste en un número entero para la edad de la persona y un número entero para el hándicap de la persona.

Nota para F #: La entrada será de (int list list) que es una List <List>

Example Input

[[18, 20],[45, 2],[61, 12],[37, 6],[21, 21],[78, 9]]

Output

Output will consist of a list of string values (in Haskell: Open or Senior) stating whether the respective member is to be placed in the senior or open category.

Example Output
["Open", "Open", "Senior", "Open", "Open", "Senior"]

1) Leer lista 
2) Separar los primeros datos de las listas
3) Validar
 
'''


def open_or_senior(data):

    for i in data:
        print(i)

    return 


print([(45, 12), (55, 21), (19, -2), (104, 20)])
print([(16, 23), (73, 1), (56, 20), (1, -1)])
