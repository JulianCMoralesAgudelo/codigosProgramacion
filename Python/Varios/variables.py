#!/usr/bin/env python3
# -*- coding: UTF-8 -*-
# Declaracion e inicializacion de variables
a = 1
b = 3
c = 2
x = a + b - c
y = (x+3)/(a-2)

print("Antes del if")
print("x = ", x)
print("y = ", y)

# Manipulacion de datos
if(a < c):
    a = a + 2
    b = b + 3
    c = c + 1
else:
    a = a + 1
    b = a
    c = c - 1

x = x + a
y = y - c
z = y + b

# Presentacion de datos.
print("Despues del if")
print("a = ", a)
print("b = ", b)
print("c = ", c)
print("x = ", x)
print("y = ", y)
print("z = ", z)
