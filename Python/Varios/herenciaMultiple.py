class A:
    a = 1  # Atributo de clase en A

class B:
    b = 2  # Atributo de clase en B

class C(A, B):
    pass  # Hereda de A y B

c = C()
print(c.a, c.b)  # Imprime los atributos heredados de A y B
