#!/usr/bin/env python3
# -*- coding: UTF-8 -*-

'''
Dado un número entero, n realice las siguientes acciones condicionales:

Si n es impar, imprime Extraño.
Si n es par y n esta entre 2 a 5 inclusivo, imprima no es Extraño.
Si n es par y está en el rango inclusivo de 6 a 20, imprima Extraño.
Si n es par y mayor que 20, imprime No es raro
'''


# Declaracion e inicializacion de variables

# lectura de datos
if __name__ == '__main__':
    n = int(input().strip())
    
if(n % 2 != 0) & (n <= 5):
    print("Weird")
else:
    if(n % 2 == 0) & (n >= 6) & (n <= 20):
        print("Weird")
    else:
        if(n % 2 != 0) & (n > 20):
            print("Weird")
        else:
            print("Not Weird")


# Manipulacion de datos


# Presentacion de datos.
'''
if(n & 2 == 0) & (n >= 6) & (n <= 20):
        print("Weird")
        if(n & 2 == 0) & (n < 5):
            print("Not Weird")
        else:
            print("Weird")
    else:
        print("Not Weird")
'''
