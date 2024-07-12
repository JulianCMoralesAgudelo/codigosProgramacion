def esMinuscula(c):
    """
    Función que verifica si un carácter es una letra minúscula.

    Args:
    c (str): El carácter a verificar.

    Returns:
    bool: True si el carácter es una letra minúscula, False en caso contrario.
    """
    return 'a' <= c <= 'z'

# Ejemplo de uso
caracter = 'a'
print(esMinuscula(caracter))  # True, 'a' es una letra minúscula

caracter = 'A'
print(esMinuscula(caracter))  # False, 'A' no es una letra minúscula
