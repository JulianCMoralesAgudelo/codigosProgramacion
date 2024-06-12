#!/bin/bash

# Inicializar la variable contador
contador=1

# Bucle until para imprimir números del 1 al 5
echo "Imprimiendo números del 1 al 5:"
until [ $contador -gt 5 ]; do
    echo "$contador"
    contador=$((contador + 1))
done

# -eq: Igual a (equal to).
# -ne: No igual a (not equal to).
# -lt: Menor que (less than).
# -le: Menor o igual a (less than or equal to).
# -gt: Mayor que (greater than).
# -ge: Mayor o igual a (greater than or equal to).


