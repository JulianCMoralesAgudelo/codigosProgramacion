#!/bin/bash

# Función para mostrar el menú
mostrar_menu() {
    echo "--------------------"
    echo "  Calculadora Bash"
    echo "--------------------"
    echo "Seleccione una operación:"
    echo "1. Suma"
    echo "2. Resta"
    echo "3. Multiplicación"
    echo "4. División"
    echo "5. Salir"
    echo "--------------------"
}

# Función para leer dos números
leer_numeros() {
    echo "Introduce el primer número: "
    read -r numero1
    echo "Introduce el segundo número: "
    read -r numero2
}

# Bucle principal
while true; do
    mostrar_menu
    read -rp "Seleccione una opción [1-5]: " opcion
    
    case $opcion in
        1)
            leer_numeros
            resultado=$(echo "$numero1 + $numero2" | bc)
            echo "El resultado de $numero1 + $numero2 es: $resultado"
            ;;
        2)
            leer_numeros
            resultado=$(echo "$numero1 - $numero2" | bc)
            echo "El resultado de $numero1 - $numero2 es: $resultado"
            ;;
        3)
            leer_numeros
            resultado=$(echo "$numero1 * $numero2" | bc)
            echo "El resultado de $numero1 * $numero2 es: $resultado"
            ;;
        4)
            leer_numeros
            if [ "$numero2" -eq 0 ]; then
                echo "Error: División por cero no permitida."
            else
                resultado=$(echo "scale=2; $numero1 / $numero2" | bc)
                echo "El resultado de $numero1 / $numero2 es: $resultado"
            fi
            ;;
        5)
            echo "Saliendo de la calculadora. ¡Hasta luego!"
            break
            ;;
        *)
            echo "Opción no válida, por favor seleccione una opción entre 1 y 5."
            ;;
    esac
done

