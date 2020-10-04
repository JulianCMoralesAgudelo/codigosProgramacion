
#!/usr/bin/env python
# -*- coding: UTF-8 -*-
print("Por favor ingrese un numero entero :", end="")
numero = int(input())
contador = 0
while numero >= 1:
    numero /= 10
    contador += 1

print("El numero tiene:", contador, "digitos")
