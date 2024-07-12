def cuentaLetras(cadena, letra):
    """
    Función que cuenta cuántas veces aparece una letra específica en una cadena.

    Args:
    cadena (str): La cadena en la que se buscará la letra.
    letra (str): La letra a buscar en la cadena.

    Returns:
    None: Imprime la cantidad de veces que la letra aparece en la cadena.
    """
    cuenta = 0
    for car in cadena:
        if car == letra:
            cuenta += 1
    print("La letra buscada aparece: " + str(cuenta) + " veces en la palabra enviada")

# Solicitar la palabra y la letra al usuario
palabra = input("Por favor ingrese una palabra: ")
letra = input("Por favor ingrese una letra a buscar en la palabra: ")

# Llamar a la función cuentaLetras con los inputs del usuario
cuentaLetras(palabra, letra)
