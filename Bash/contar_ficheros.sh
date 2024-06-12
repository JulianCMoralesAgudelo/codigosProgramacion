#!/bin/bash

# Script para contar ficheros

echo 'Contar Ficheros'
echo '--------------'

# Contar el número de ficheros en el directorio actual
num_ficheros=$(find . -maxdepth 1 -type f | wc -l)

# Obtener el directorio actual
directorio=$(pwd)

# Mostrar el resultado
echo "En el directorio $directorio hay $num_ficheros ficheros"


