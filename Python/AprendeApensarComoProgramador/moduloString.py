'''
El método find puede tomar hasta tres argumentos:

Subcadena a buscar: La cadena que deseas encontrar.
Índice inicial (opcional): El índice desde el cual comenzar la búsqueda.
Índice final (opcional): El índice en el cual terminar la búsqueda (sin incluir este índice).

string.find(subcadena, inicio, fin)
'''

fruta = "banana"
indice = fruta.find("a")
print(indice)
print("banana".find("na"))
print("banana".find("na",3))

cadena = "sushi"
resultado = cadena.find("s", 1, 2)
print(resultado)  # Salida: -1

cadena = "sushi"
print(cadena.find("s", 0, 3))  # Salida: 0 (la primera "s" está en el índice 0)
print(cadena.find("s", 1, 4))  # Salida: 3 (la segunda "s" está en el índice 3)
print(cadena.find("s", 1, 2))  # Salida: -1 (no hay "s" entre el índice 1 y 2)
