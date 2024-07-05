try:
    # Código que puede causar un error
    number = int(input("Introduce un número: "))
    result = 10 / number
except ZeroDivisionError:
    # Código que se ejecuta si ocurre una ZeroDivisionError
    print("Error: No se puede dividir por cero.")
except ValueError:
    # Código que se ejecuta si ocurre una ValueError
    print("Error: Debes introducir un número entero.")
else:
    # Código que se ejecuta si no ocurre ninguna excepción
    print(f"El resultado es {result}")
finally:
    # Código que se ejecuta siempre, ocurra o no una excepción
    print("Operación completada.")
