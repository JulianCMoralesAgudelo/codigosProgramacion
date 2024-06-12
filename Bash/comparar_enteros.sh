#!/bin/bash

# -eq: Igual a (equal to).
# -ne: No igual a (not equal to).
# -lt: Menor que (less than).
# -le: Menor o igual a (less than or equal to).
# -gt: Mayor que (greater than).
# -ge: Mayor o igual a (greater than or equal to).


# Definir dos enteros para comparar
num1=5
num2=10

# Comparar si los enteros son iguales
if [ "$num1" -eq "$num2" ]; then
    echo "Los números son iguales."
else
    echo "Los números son diferentes."
fi

# Comparar si los enteros son diferentes
if [ "$num1" -ne "$num2" ]; then
    echo "Los números son diferentes."
else
    echo "Los números son iguales."
fi

# Comparar si un entero es menor que otro
if [ "$num1" -lt "$num2" ]; then
    echo "$num1 es menor que $num2."
else
    echo "$num1 no es menor que $num2."
fi

# Comparar si un entero es menor o igual que otro
if [ "$num1" -le "$num2" ]; then
    echo "$num1 es menor o igual que $num2."
else
    echo "$num1 no es menor ni igual que $num2."
fi

# Comparar si un entero es mayor que otro
if [ "$num1" -gt "$num2" ]; then
    echo "$num1 es mayor que $num2."
else
    echo "$num1 no es mayor que $num2."
fi

# Comparar si un entero es mayor o igual que otro
if [ "$num1" -ge "$num2" ]; then
    echo "$num1 es mayor o igual que $num2."
else
    echo "$num1 no es mayor ni igual que $num2."
fi

