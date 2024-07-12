# Se obtiene la longitud de cada cadena
len_1 = len(cadena_1)
len_2 = len(cadena_2)

# Variable para almacenar el resultado de la comparación de longitudes
resultado = 0

# Compara las longitudes de las cadenas
if len_1 > len_2:
    resultado = 1  # Si cadena_1 es más larga, resultado es 1
elif len_2 > len_1:
    resultado = 2  # Si cadena_2 es más larga, resultado es 2

# No es necesario el caso else, ya que resultado ya está inicializado en 0
