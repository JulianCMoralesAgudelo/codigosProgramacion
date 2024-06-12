#!/bin/bash

# Inicializar las variables
a=1
b=10

# Bucle while con una condición compuesta
echo "Imprimiendo valores de a y b mientras a sea menor que 5 y b sea mayor que 5:"
while [ $a -lt 5 ] && [ $b -gt 5 ]; do
    echo "a: $a, b: $b"
    a=$((a + 1))
    b=$((b - 1))
done
