#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : listHackerRank
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-01-21
Documentación   :
Descripcion     : 
'''

# lectura de datos

entrada = "12 insert 0 5 insert 1 10 insert 0 6 print remove 6 append 9 append 1 sort print pop reverse print"
lista = entrada.split()
cantidad = lista.pop(0)

for i in range(len(lista)):
    if (lista[i] == 'insert'):
        a = lista[i+1]
        b = lista[i+2]
        lista.insert(a, b)
    '''elif (lista[i] == 'print'):
        print(lista)
    elif (lista[i] == 'remove'):
        a = lista[i+1]
        lista.remove(a)
    elif (lista[i] == 'append'):
        a = lista[i+1]
        lista.append(a)
    elif (lista[i] == 'sort'):
        lista.sort()
    elif (lista[i] == 'pop'):
        lista.pop()
    elif (lista[i] == 'reverse'):
        lista.reverse()'''
