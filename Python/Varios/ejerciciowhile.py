# Completa el ejercicio
# Simulación de un bucle do-while
while True:
    try:
        # Solicitar al usuario que ingrese un número entero
        numero = int(input("Introduce un número multiplo de 5: "))
        
        # Condición de salida
        if numero % 5 == 0:
            break
        
    except ValueError:
        # Manejar el error si la entrada no es un número entero
        print("Eso no es un número entero. Por favor, intenta de nuevo.")



