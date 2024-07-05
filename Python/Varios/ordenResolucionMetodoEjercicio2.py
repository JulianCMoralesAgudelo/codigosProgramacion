# Definición de la clase A con un método 'c' que devuelve un mensaje específico.
class A:
    def c(self):
        return "Función dentro de A"

# Definición de la clase B que hereda de A. 
# Tiene su propio método 'c', que sobrescribe el método 'c' de A con un mensaje diferente.
class B(A):
    def c(self):
        return "Función dentro de B"

# Definición de la clase C que hereda tanto de A como de B.
# Esto plantea un problema ya que A y B son clases base directas de C, lo que puede causar una inconsistencia.
class C(A, B):
    pass

# Definición de la clase D que hereda de C.
class D(C):
    pass

# Creación de una instancia de D
d = D()

# Intento de imprimir 'a' en la instancia 'd'. 
# Esto debería resultar en un AttributeError ya que 'a' no está definido ni en D ni en sus clases base.
print(d.a)
