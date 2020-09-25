"""
La ley de Ohm establece una relación entre la intensidad de corriente (I) que circula por un circuito, la 
diferencia de potencial (V) y la resistencia (R) del mismo mediante la siguiente fórmula: I =V / R

Hacer un algoritmo que solicite la opción a calcular: 1 para calcular I, 2 para calcular V o 3 para calcular
R Utilizando un diccionario en Python; asi como tres variables I, V y R donde aquella a calcular sea 0.

El codigo debe mostrar el resultado. Ojo: Se debe validar que los datos suministrados deben ser mayores 
que cero excepto para la variable a calcular, de lo contrario retornar "Error en los numeros"
"""

opcion : int = int(input())
I : float = float(input())
V : float =  float(input())
R : float =  float(input())
if (opcion == 1) #calcular I = V/R
    if (V > 0 and R > 0)
        I = V / R
        print(str(I))
    else
        print("Error en los numeros")
elif (opcion == 2) #calcular V = I*R
    if (I > 0 and R > 0)
        V = I * R
        print(str(V))
    else
        print("Error en los numeros")
else #calcular R = V/I
    if (V > 0 and R > 0)
        R = V / I
        print(str(R))
    else
        print("Error en los numeros")