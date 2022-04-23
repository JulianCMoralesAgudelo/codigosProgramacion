#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Script          : operadorTernario.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 07-04-2022
Documentación   : https://developer.mozilla.org/es/docs/Learn/JavaScript/Building_blocks/conditionals
Descripcion     : 
'''
# Importar librerias


# Funciones

# Funcion que Devuelve el menor de los dos argumentos que recibe.
def min(num1, num2):
    return num2 if num1 > num2 else (num1 if num1 < num2 else 'Iguales')


# Llamar la funcion y se envian dos parametros
print(min(1, 1))
# 1

# Llamar la funcion y se envian dos parametros
print(min(10, 5))
# 5

# Llamar la funcion y se envian dos parametros
print(min(5, 5))
# 'equal'
