#!/bin/bash

####################### Calculadora
###### Uso:
###### calculadora.sh 4 + 2
###### calculadora.sh 10 / 4
###### calculadora.sh 4 x 2
###### calculadora.sh 4 - 2

# Verificar que se han pasado exactamente tres argumentos
if [ $# -ne 3 ]; then
    echo "Uso: $0 numero1 operador numero2"
    exit 1
fi

# Inicializar el resultado
resultado=0

# Evaluar el operador
case $2 in
     +)
        resultado=$(($1 + $3))
        ;;
     -)
        resultado=$(($1 - $3))
        ;;
     x)
        resultado=$(($1 * $3))
        ;;
     /)
        if [ $3 -eq 0 ]; then
            echo "Error: División por cero no permitida"
            exit 1
        fi
        resultado=$(($1 / $3))
        ;;
     *)
        echo 'Operador no válido, intente nuevamente su operación'
        exit 1
        ;;
esac

# Mostrar el resultado
echo 'El resultado es: '$resultado

