#!/bin/bash

# Ejemplo de operadores lógicos AND (&&) y OR (||)

# Definir dos enteros para las comparaciones
num1=10
num2=20

# Usar operador lógico AND (&&)
if [ "$num1" -lt "$num2" ] && [ "$num1" -gt 5 ]; then
    echo "Ambas condiciones son verdaderas: $num1 es menor que $num2 y $num1 es mayor que 5."
else
    echo "Una o ambas condiciones son falsas."
fi

# Usar operador lógico OR (||)
if [ "$num1" -lt 5 ] || [ "$num2" -gt 15 ]; then
    echo "Al menos una de las condiciones es verdadera: $num1 es menor que 5 o $num2 es mayor que 15."
else
    echo "Ambas condiciones son falsas."
fi

# Combinando AND y OR
if { [ "$num1" -lt "$num2" ] && [ "$num1" -gt 5 ]; } || [ "$num2" -lt 15 ]; then
    echo "La combinación de condiciones es verdadera."
else
    echo "La combinación de condiciones es falsa."
fi

# Negación con operador lógico NOT (!)
if ! [ "$num1" -eq "$num2" ]; then
    echo "$num1 no es igual a $num2."
else
    echo "$num1 es igual a $num2."
fi

