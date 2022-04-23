#!/usr/bin/env python3
# -*- coding: utf-8 -*-
'''
Script          : Adivina numero
Autor           : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
Versión         : 1.0
Modificado      : 2022-03-10
Documentación   : https://www.geeksforgeeks.org/number-guessing-game-in-python/
Descripcion     : 
'''

### ESCRIBA SU CÓDIGO A PARTIR DE AQUÍ ### (~ 18 líneas de código)
# Entrada del programa (~ 2 líneas).
numero_secreto = int(input('Ingrese un numero entero como numero secreto: '))
intentos = int(input('Ingrese un numero entero como cantidad de intentos: '))
maximo = int(input('Ingrese un numero entero como numero maximo: '))
minimo = int(input('Ingrese un numero entero como numero minimo: '))

# Ciclo (~ 11 líneas).
## Mensaje inicial y entrada (~ 2 líneas).
while intentos > 0:
    print(f"Intentos restantes: {intentos}.")
    dato = int(input('Ingrese un numero entero como intento: '))
    ## Caso para respuesta correcta (~ 3 líneas).
    if dato == numero_secreto:
        print('¡Felicidades! El número ingresado es correcto.')        
        break
    ## Caso para respuesta incorrecta (~ 6 líneas).
    elif dato < minimo or dato > minimo:
        print('Respuesta incorrecta. Intente de nuevo.')
        intentos -= 1
    ### Caso usuario con intentos (~ 2 líneas)
    elif dato < numero_secreto:
        print('Respuesta incorrecta. Intente de nuevo.')
        intentos -= 1

### Caso usuario sin intentos (~ 2 líneas)
if intentos == 0:
    print(f"Se acabaron los intentos. El número correcto era {numero_secreto}.");

# Mensaje final (~ 1 línea).
print('Fin del juego. ¡Gracias por participar!')