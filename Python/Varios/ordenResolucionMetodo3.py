# Definición de las clases A, B, C y D

# Clase A
class A:
    def c(self):
        return "Función dentro de A"

# Clase B
class B:
    def c(self):
        return "Función dentro de B"

# Clase C hereda de A y luego de B
class C(A, B):
    def c(self):
        return "Función dentro de C"

# Clase D hereda de A y luego de C
class D(A, C):
    pass

# Creación de instancia de D y llamada al método 'c'
d = D()
print(d.c())

"""
Explicación:

1. Se define la clase A con un método 'c' que devuelve "Función dentro de A".
2. Se define la clase B con un método 'c' que devuelve "Función dentro de B".
3. Se define la clase C que hereda de A y luego de B ('C(A, B)'). Esto significa que si un método no se encuentra en C, se buscará primero en A y luego en B.
4. La clase C redefine el método 'c' para devolver "Función dentro de C".
5. Se define la clase D que hereda de A y luego de C ('D(A, C)'). Esto implica que D hereda el método 'c' de A y luego de C.
6. Al crear una instancia 'd' de la clase D y llamar a 'd.c()', se invoca el método 'c' definido en C, que devuelve "Función dentro de C".
7. Por lo tanto, la salida será "Función dentro de C".

Orden de resolución de métodos (MRO):
- En este caso, el orden de resolución de métodos (MRO) para D sería [D, A, C, B, object].
- Python utiliza el algoritmo C3 Linearization (C3) para determinar el orden en el que se buscarán los métodos en la herencia múltiple.
- Cuando se llama a 'd.c()', se busca primero en D, luego en A, luego en C, luego en B, y finalmente en object (la clase base de todas las clases en Python).
- Debido a que C redefine el método 'c', este es el que se llama y devuelve "Función dentro de C".
"""
