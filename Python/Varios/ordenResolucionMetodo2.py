# Definición de las clases A, B, C y D

# Clase A
class A:
    def b(self):
        return "Función dentro de A"

# Clase B
class B:
    def b(self):
        return "Función dentro de B"

# Clase C hereda de A y luego de B
class C(A, B):
    def b(self):
        return "Función dentro de C"

# Clase D hereda de C
class D(C):
    pass

# Creación de instancia de D y llamada al método 'b'
d = D()
print(d.b())

"""
Explicación:

1. Se define la clase A con un método 'b' que devuelve "Función dentro de A".
2. Se define la clase B con un método 'b' que devuelve "Función dentro de B".
3. Se define la clase C que hereda de A y luego de B ('C(A, B)'). Esto significa que si un método no se encuentra en C, se buscará primero en A y luego en B.
4. La clase C redefine el método 'b' para devolver "Función dentro de C".
5. Se define la clase D que hereda de C ('D(C)'). Esto implica que D hereda el método 'b' de C, que a su vez lo hereda de A y B, pero C lo redefine.
6. Al crear una instancia 'd' de la clase D y llamar a 'd.b()', se invoca el método 'b' definido en C, que devuelve "Función dentro de C".
7. Por lo tanto, la salida será "Función dentro de C".

Orden de resolución de métodos (MRO):
- En este caso, el orden de resolución de métodos (MRO) para D sería [D, C, A, B, object].
- Python utiliza el algoritmo C3 Linearization (C3) para determinar el orden en el que se buscarán los métodos en la herencia múltiple.
- Cuando se llama a 'd.b()', se busca primero en D, luego en C, luego en A, luego en B, y finalmente en object (la clase base de todas las clases en Python).
- Debido a que C redefine el método 'b', este es el que se llama y devuelve "Función dentro de C".
"""
