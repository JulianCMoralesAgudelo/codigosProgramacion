# Definición de la función encuentra
def encuentra(cad, c):
    """
    Función que busca un carácter en una cadena y devuelve su índice si lo encuentra,
    de lo contrario, devuelve -1.

    Args:
    cad (str): La cadena en la que se buscará el carácter.
    c (str): El carácter a buscar en la cadena.

    Returns:
    int: El índice del primer carácter encontrado, o -1 si no se encuentra.
    """
    indice = 0
    while indice < len(cad):
        if cad[indice] == c:  # Compara cada carácter en la cadena con el carácter 'c' proporcionado
            return indice
        indice = indice + 1
    return -1

# Llamada a la función
cadena = "banana"
caracter = 'a'
indice = encuentra(cadena, caracter)

# Imprimir el resultado
print(f"El índice del carácter '{caracter}' en la cadena '{cadena}' es: {indice}")
