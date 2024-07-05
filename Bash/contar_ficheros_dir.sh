#!/bin/bash

# Script para contar ficheros y directorios

echo 'Contar Ficheros y Directorios'
echo '-----------------------------'

# Contar el número de ficheros en el directorio actual
num_ficheros=$(find . -maxdepth 1 -type f | wc -l)

# Contar el número de directorios en el directorio actual (excluyendo el directorio actual '.')
num_directorios=$(find . -maxdepth 1 -type d ! -name . | wc -l)

# Obtener el directorio actual
directorio=$(pwd)

# Mostrar el resultado
echo "En el directorio $directorio hay:"
echo "  $num_ficheros ficheros"
echo "  $num_directorios directorios"

