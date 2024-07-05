#!/bin/bash

# Definir dos cadenas para comparar
cadena1="hola"
cadena2="mundo"

# Comparar si las cadenas son iguales
if [ "$cadena1" = "$cadena2" ]; then
    echo "Las cadenas son iguales."
else
    echo "Las cadenas son diferentes."
fi

# Comparar si las cadenas son diferentes
if [ "$cadena1" != "$cadena2" ]; then
    echo "Las cadenas son diferentes."
else
    echo "Las cadenas son iguales."
fi

# Comparar si una cadena es mayor que otra (orden lexicográfico)
if [[ "$cadena1" > "$cadena2" ]]; then
    echo "\"$cadena1\" es mayor que \"$cadena2\"."
elif [[ "$cadena1" < "$cadena2" ]]; then
    echo "\"$cadena1\" es menor que \"$cadena2\"."
else
    echo "\"$cadena1\" y \"$cadena2\" son iguales."
fi

# Comprobar si una cadena está vacía
cadena_vacia=""
if [ -z "$cadena_vacia" ]; then
    echo "La cadena está vacía."
else
    echo "La cadena no está vacía."
fi

# Comprobar si una cadena no está vacía
if [ -n "$cadena1" ]; then
    echo "La cadena \"$cadena1\" no está vacía."
else
    echo "La cadena está vacía."
fi

