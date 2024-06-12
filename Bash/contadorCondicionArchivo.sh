#!/bin/bash

# Crear un archivo temporal
touch temp_file

# Bucle while para comprobar si el archivo existe
echo "Esperando a que el archivo temp_file sea eliminado..."
while [ -e temp_file ]; do
    sleep 1
done

echo "El archivo temp_file ha sido eliminado."
