#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : notasCategoria.py
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2021-05-04
Documentación   :
Descripcion     : 
'''
import random

# Declaracion e inicializacion de variables y lectura de datos

n1 = random.randint(1, 10)
n2 = random.randint(1, 10)
n3 = random.randint(1, 10)
n4 = random.randint(1, 10)
n5 = random.randint(1, 10)

definitiva = n1 + n2 + n3 + n4 + n5
definitiva /= 5

print()

# Presentacion de datos.

if n1 <= 5 and n2 <= 5 and n3 <= 5 and n4 <= 5 and n5 <= 5:
    if definitiva > 1 and definitiva <= 1.9:
        print("Perverso con notas:", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
              "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
    elif definitiva > 1.9 and definitiva <= 2.9:
        print("Malo con notas:", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
              "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
    elif definitiva > 2.9 and definitiva <= 3.4:
        print("Regular con notas:", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
              "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
    elif definitiva > 3.4 and definitiva <= 4.4:
        print("Bueno con notas:", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
              "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
    elif definitiva > 4.4 and definitiva <= 5:
        print("Excelente con notas:", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
              "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
    else:
        print("Expulsado con notas:", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
              "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
else:
    print("Datos invalidos", "\nn1:", n1, "\nn2:", n2, "\nn3:", n3,
          "\nn4:", n4, "\nn5:", n5, "\nnota definitiva:", definitiva)
print()
