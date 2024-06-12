#!/bin/bash

# -eq: Igual a (equal to).
# -ne: No igual a (not equal to).
# -lt: Menor que (less than).
# -le: Menor o igual a (less than or equal to).
# -gt: Mayor que (greater than).
# -ge: Mayor o igual a (greater than or equal to).

# Bucle while para pedir al usuario que introduzca un número positivo
numero=-1

echo "Introduce un número positivo:"
while [ $numero -lt 0 ]; do
    read -r numero
    if [ $numero -lt 0 ]; then
        echo "El número no es positivo. Inténtalo de nuevo:"
    fi
done

echo "Número positivo introducido: $numero"