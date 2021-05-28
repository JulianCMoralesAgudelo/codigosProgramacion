#!/usr/bin/env python3
# -*- coding: utf-8 -*-

'''
Script          : LanzarDados.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-03
Documentación   : https://www.comfenalcoantioquia.edu.co/
Descripcion     : Leer tres dados
'''

import random


print()
d1 = int(random.randint(1, 6))
d2 = int(random.randint(1, 6))
d3 = int(random.randint(1, 6))

if (d1+d2+d3) == 18:
    print("Puntaje excelente D1 =", d1, "D2 =", d2, "D3 =", d3,)
elif (d1 + d2 == 12) or (d1 + d3 == 12) or (d2 + d3 == 12):
    print("Puntaje bueno D1 =", d1, "D2 =", d2, "D3 =", d3,)
elif (d1 + d2 == 6) or (d1 + d3 == 6) or (d2 + d3 == 6):
    print("Puntaje regular D1 =", d1, "D2 =", d2, "D3 =", d3,)
else:
    print("Puntaje pesimo D1 =", d1, "D2 =", d2, "D3 =", d3,)

print()
