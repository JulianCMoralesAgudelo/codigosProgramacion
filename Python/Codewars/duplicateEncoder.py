#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : duplicateEncoder.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-02-09
Documentación   : https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/python
Descripcion     : 


El objetivo de este ejercicio es convertir una cadena en una nueva cadena donde cada carácter de la nueva cadena es "(" 
si ese carácter aparece solo una vez en la cadena original, o ")" si ese carácter aparece más de una vez en la cadena original. Ignore las mayúsculas al determinar si un carácter es un duplicado.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 

Notas

Los mensajes de afirmación pueden no estar claros sobre lo que muestran en algunos idiomas. Si lee "... Debería codificar XXX", "XXX" es el resultado esperado, ¡no la entrada!


1) Leer palabra
2) Pasar a minuscula
3) Ordenar palabra
4) Contar repetidos

'''


def duplicate_encode(word):
    # your code here
    result = ''    
    word = word.lower()
    word = list(word)

    for i in word:
        if(word.count(i) == 1):
            result += '('
        else:
            result += ')'
    return result


print(duplicate_encode("din"))
print(duplicate_encode("recede"))
print(duplicate_encode("Success"))
print(duplicate_encode("(( @"))
