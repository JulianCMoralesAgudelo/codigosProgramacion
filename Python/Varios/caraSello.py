#!/usr/bin/env python3
# -*- coding: utf-8 -*-

'''
Script          : caraSello.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-03
Documentación   : https://www.comfenalcoantioquia.edu.co/
Descripcion     : Tirar tres monedas y 

1) Si caen tres m1 = m2 = m3 el premio es 20000$
2) Si m1 = m2 != m3 o m1 = m3 != m2 o m1 != m2 = m3 12000
'''

import random

print()
m1 = int(random.randint(1, 2))
m2 = int(random.randint(1, 2))
m3 = int(random.randint(1, 2))

if (m1 + m2 + m3 == 3 or m1 + m2 + m3 == 6):
    print("Gana el premio mayor por valor de ", 20000)
    print("\nMonedas \nMoneda # 1 =", m1,
          "\nMoneda # 2 =", m2, "\nMoneda # 3 =", m3)
elif (m1 == m2 or m1 == m3 or m2 == m3):
    print("Gana el premio segundo mayor por valor de ", 12000)
    print("\nMonedas \nMoneda # 1 =", m1,
          "\nMoneda # 2 =", m2, "\nMoneda # 3 =", m3)
else:
    print("No que que hiciste")
print()
