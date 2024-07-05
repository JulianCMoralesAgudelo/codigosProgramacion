#!/bin/bash

# Función de ayuda
mostrar_ayuda() {
    echo "Uso: $0 [-a] [-b valor] [-c]"
    echo "    -a          Activar opción a"
    echo "    -b valor    Especificar un valor para la opción b"
    echo "    -c          Activar opción c"
    exit 1
}

# Inicializar variables
opcion_a=0
opcion_b=""
opcion_c=0

# Procesar las opciones
while getopts "ab:c" opt; do
    case ${opt} in
        a )
            opcion_a=1
            ;;
        b )
            opcion_b=$OPTARG
            ;;
        c )
            opcion_c=1
            ;;
        * )
            mostrar_ayuda
            ;;
    esac
done

# Mostrar las opciones seleccionadas
echo "Opción a: $opcion_a"
echo "Opción b: $opcion_b"
echo "Opción c: $opcion_c"

