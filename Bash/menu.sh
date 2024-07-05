#!/bin/bash

# Función para mostrar el menú
mostrar_menu() {
    echo "====================="
    echo "   Menú Principal"
    echo "====================="
    echo "1. Decir Hola"
    echo "2. Mostrar Fecha y Hora"
    echo "3. Listar Archivos en el Directorio Actual"
    echo "4. Mostrar Espacio en Disco"
    echo "5. Salir"
    echo "====================="
    echo "Por favor, selecciona una opción [1-5]:"
}

# Función para decir Hola
decir_hola() {
    echo "Hola, ¿cómo estás?"
}

# Función para mostrar la fecha y hora actual
mostrar_fecha_hora() {
    echo "Fecha y Hora actual: $(date)"
}

# Función para listar archivos en el directorio actual
listar_archivos() {
    echo "Archivos en el directorio actual:"
    ls -l
}

# Función para mostrar el espacio en disco
mostrar_espacio_disco() {
    echo "Espacio en disco:"
    df -h
}

# Función principal
menu_principal() {
    while true; do
        mostrar_menu
        read -r opcion
        case $opcion in
            1)
                decir_hola
                ;;
            2)
                mostrar_fecha_hora
                ;;
            3)
                listar_archivos
                ;;
            4)
                mostrar_espacio_disco
                ;;
            5)
                echo "Saliendo del menú. ¡Adiós!"
                exit 0
                ;;
            *)
                echo "Opción no válida. Por favor selecciona una opción entre 1 y 5."
                ;;
        esac
        echo "Presiona Enter para continuar..."
        read -r # Pausa para que el usuario pueda leer la salida
    done
}

# Ejecutar el menú principal
menu_principal


