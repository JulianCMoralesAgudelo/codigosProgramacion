#!/bin/bash

# Función para comprobar si una entrada es un número
es_numero() {
    re='^[0-9]+$'
    if [[ $1 =~ $re ]]; then
        return 0
    else
        return 1
    fi
}

# Pedir al usuario que introduzca su edad
echo "Por favor, introduce tu edad:"

# Leer la entrada del usuario y almacenarla en la variable 'edad'
read edad

# Validar si la entrada es un número
if es_numero "$edad"; then
    echo "Tienes $edad años."
else
    echo "La entrada no es un número válido."
fi

