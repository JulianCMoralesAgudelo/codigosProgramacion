#!/usr/bin/env python3
# -*- coding: utf-8 -*-
### ESCRIBA SU CÓDIGO A PARTIR DE AQUÍ ### (~ 18 líneas de código)
# Entrada del programa (~ 2 líneas).
num = int(input())
intentos = int(input())
# Ciclo (~ 11 líneas).
while intentos > 0:     
    ## Mensaje inicial y entrada (~ 2 líneas).
    print(f"Intentos restantes: {intentos}.")
    dato = int(input())
    ## Caso para respuesta correcta (~ 3 líneas).
    if dato == num:
        print('¡Felicidades! El número ingresado es correcto.')
        break
    ## Caso para respuesta incorrecta (~ 6 líneas).
    ### Caso usuario con intentos (~ 2 líneas)
    elif dato != num:
        ### Caso usuario sin intentos (~ 2 líneas)
        if intentos <= 1:
            print(f"Se acabaron los intentos. El número correcto era {num}.")
            break
        print('Respuesta incorrecta. Intente de nuevo.')
        intentos -= 1
# Mensaje final (~ 1 línea).
print("Fin del juego. ¡Gracias por participar!")