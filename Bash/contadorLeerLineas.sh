#!/bin/bash

# Crear un archivo de ejemplo
echo -e "Línea 1\nLínea 2\nLínea 3" > ejemplo.txt

# Bucle while para leer un archivo línea por línea
echo "Leyendo el archivo ejemplo.txt línea por línea:"
while IFS= read -r linea; do
    echo "$linea"
done < ejemplo.txt

# Eliminar el archivo de ejemplo
rm ejemplo.txt
