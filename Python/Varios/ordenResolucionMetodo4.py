# Definición de las clases A, B, C, D, E y F

# Clase A
class A:
    def d(self):
        return "Función dentro de A"

# Clase B
class B:
    def d(self):
        return "Función dentro de B"

# Clase C
class C:
    def d(self):
        return "Función dentro de C"

# Clase D hereda de A y luego de B
class D(A, B):
    def d(self):
        return "Función dentro de D"

# Clase E hereda de B y luego de C
class E(B, C):
    def d(self):
        return "Función dentro de E"

# Clase F hereda de E, luego de D y luego de C
class F(E, D, C):
    pass

# Creación de instancia de F y llamada al método 'd'
f = F()
print(f.d())

# Imprime el Orden de Resolución de Métodos (MRO) de la clase F
print(F.mro())

"""
Explicación:

1. Se define la clase A con un método 'd' que devuelve "Función dentro de A".
2. Se define la clase B con un método 'd' que devuelve "Función dentro de B".
3. Se define la clase C con un método 'd' que devuelve "Función dentro de C".
4. La clase D hereda de A y luego de B ('D(A, B)'). Si un método no se encuentra en D, se buscará primero en A y luego en B.
5. La clase D redefine el método 'd' para devolver "Función dentro de D".
6. La clase E hereda de B y luego de C ('E(B, C)'). Si un método no se encuentra en E, se buscará primero en B y luego en C.
7. La clase E redefine el método 'd' para devolver "Función dentro de E".
8. La clase F hereda de E, luego de D y luego de C ('F(E, D, C)'). Esto implica que F hereda el método 'd' de E, luego de D y luego de C.
9. La clase F no redefine el método 'd', por lo que hereda el método 'd' de E.
10. Al crear una instancia 'f' de la clase F y llamar a 'f.d()', se invoca el método 'd' definido en E, que devuelve "Función dentro de E".
11. Por lo tanto, la salida será "Función dentro de E".

Orden de resolución de métodos (MRO):
- En este caso, el orden de resolución de métodos (MRO) para F será [F, E, D, A, B, C, object].
- Python utiliza el algoritmo C3 Linearization (C3) para determinar el orden en el que se buscarán los métodos en la herencia múltiple.
- Cuando se llama a 'f.d()', se busca primero en F, luego en E, luego en D, luego en A, luego en B, luego en C, y finalmente en object (la clase base de todas las clases en Python).
- Como E redefine el método 'd', este es el que se llama y devuelve "Función dentro de E".
- El método 'print(F.mro())' imprime el orden de resolución de métodos para la clase F.
"""
