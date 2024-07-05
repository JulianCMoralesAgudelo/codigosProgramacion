# Definición de las clases A, B y C

# Clase A
class A:
   def a(self):
       return "Función dentro de A"

# Clase B
class B:
    def a(self):
        return "Función dentro de B"

# Clase C hereda de B y luego de A
class C(B, A):
    pass

# Código de prueba
c = C()
print(c.a())

"""
Explicación:

1. Se define la clase A con un método 'a' que devuelve "Función dentro de A".
2. Se define la clase B con un método 'a' que devuelve "Función dentro de B".
3. Se define la clase C que hereda de B y luego de A ('C(B, A)'). Esto significa que si un método no se encuentra en C, se buscará primero en B y luego en A.
4. Al crear una instancia 'c' de la clase C y llamar a 'c.a()', se invoca el método 'a' de la clase B porque B aparece antes que A en la lista de herencia de C.
5. Por lo tanto, la salida será "Función dentro de B".

Orden de resolución de métodos (MRO):
- En la herencia múltiple como la de C(B, A), Python utiliza el algoritmo C3 Linearization (C3) para determinar el orden en el que se buscarán los métodos.
- En este caso, el orden de resolución de métodos (MRO) para C sería [C, B, A, object].
- Por lo tanto, cuando se llama a 'c.a()', se busca primero en C, luego en B, y finalmente en A.
- Debido a que B tiene definido el método 'a', este es el que se llama y devuelve "Función dentro de B".
"""
