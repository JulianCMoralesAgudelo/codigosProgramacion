# Definición de la función encuentra
def encuentra(cad, c, ind=0):
    """
    Función que busca un carácter en una cadena a partir de un índice dado y devuelve su índice si lo encuentra,
    de lo contrario, devuelve -1.

    Args:
    cad (str): La cadena en la que se buscará el carácter.
    c (str): El carácter a buscar en la cadena.
    ind (int, optional): El índice inicial desde donde comenzar la búsqueda. Por defecto es 0.

    Returns:
    int: El índice del primer carácter encontrado, o -1 si no se encuentra.
    """
    if ind >= 0 and ind < len(cad):
        indice = ind
        while indice < len(cad):
            if cad[indice] == c:  # Compara cada carácter en la cadena con el carácter 'c' proporcionado
                return indice
            indice = indice + 1
    return -1        

# Llamada a la función
cadena = "banana"
caracter = 'a'
indice_inicial = 2  # Índice desde donde comenzar la búsqueda
indice = encuentra(cadena, caracter, indice_inicial)

# Imprimir el resultado
print(f"El índice del carácter '{caracter}' en la cadena '{cadena}' a partir del índice {indice_inicial} esta en el indice: {indice}")
