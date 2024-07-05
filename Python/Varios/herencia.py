class A:
    def __init__(self, c):
        print("---------Inside class A----------")
        self.c = c  # Inicializa el atributo c
    print("Print inside A.")  # Esto se imprime al definir la clase

    def alpha(self):
        c = self.c + 1  # Incrementa el valor de c
        return c  # Devuelve el valor incrementado

print(dir(A))  # Muestra los atributos y métodos de la clase A
print("Instantiating A..")  # Indica que se va a crear una instancia de A
a = A(1)  # Crea una instancia de A con c=1
print(a.alpha())  # Llama al método alpha y muestra el resultado

class B:
    def __init__(self, a):
        print("---------Inside class B----------")
        self.a = a  # Inicializa el atributo a con una instancia de A

    print(a.alpha())  # Llama a alpha del objeto a y lo imprime
    d = 5  # Define un atributo de clase d con valor 5
    print(d)  # Imprime el valor de d
    print(a)  # Imprime la representación del objeto a

print("Instantiating B..")  # Indica que se va a crear una instancia de B
b = B(a)  # Crea una instancia de B pasando el objeto a
print(a)  # Imprime la representación del objeto a
