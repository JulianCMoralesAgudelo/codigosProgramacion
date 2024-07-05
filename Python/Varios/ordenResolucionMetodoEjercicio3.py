# Definición de la clase A, que no tiene ningún contenido específico.
class A:
    pass

# Definición de la clase B, que hereda de A y tampoco tiene contenido específico.
class B(A):
    pass

# Definición de la clase C, que hereda de B y tampoco tiene contenido específico.
class C(B):
    pass

# Creación de una instancia de C.
c = C()

# Intento de llamar al método 'a()' en la instancia 'c'.
print(c.a())
