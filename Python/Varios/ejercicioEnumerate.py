'''
Función enumerate
En este ejercicio se te va a facilitar una variable iniciales que contiene una lista con un número indeterminado de cadenas de texto.

Tu objetivo es modificar las cadenas de esa lista por la letra inicial de cada cadena en la lista utilizando, si lo requieres, la función enumerate.

Supongamos que iniciales tiene el siguiente valor ["Hola", "Mundo"], tu objetivo sería transformar esos valores a ["H", "M"].

Notas:

Recuerda que para modificar los valores en una lista necesitas hacerlo mediante el índice de cada elemento:
'''

# Lista original de cadenas
iniciales = ['H', 'M', 't', 'p', 'P', 'L', 'a']

# Optimizar el bucle para modificar cada cadena a su letra inicial en mayúscula
for i, e in enumerate(iniciales):
    iniciales[i] = e[0].upper()

# Imprimir la lista modificada
print(iniciales)
