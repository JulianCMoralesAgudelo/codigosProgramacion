#!/bin/bash

# Mostrar el uso del script si no se pasan parámetros
if [ $# -eq 0 ]; then
    echo "Uso: $0 parametro1 parametro2 ... parametroN"
    exit 1
fi

# Mostrar todos los parámetros
echo "Todos los parámetros: $@"

# Mostrar cada parámetro por separado usando un bucle for
contador=1
for parametro in "$@"; do
    echo "Parámetro $contador: $parametro"
    contador=$((contador + 1))
done

