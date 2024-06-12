#!/bin/bash

# Inicializar la variable contador
contador=1

# Bucle while para imprimir números del 1 al 5
echo "Imprimiendo números del 1 al 5:"
while [ $contador -le 5 ]; do
    echo "$contador"
    contador=$((contador + 1))
done
