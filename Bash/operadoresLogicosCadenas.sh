#!/bin/bash

num1=10
num2=20

# Combinación de condiciones
if [ "$num1" -gt 5 ] && [ "$num2" -lt 25 ]; then
    echo "Ambas condiciones son verdaderas."
else
    echo "Una o ambas condiciones son falsas."
fi

