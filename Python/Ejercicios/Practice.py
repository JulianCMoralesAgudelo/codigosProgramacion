lista = [1, 2, 3, 4, 5, 6, 7]
lista2 = lista

print(lista)
print(lista2)

lista[0] = 100

print(lista)
print(lista2)

lista2 = lista.copy()

lista[0] = 1

print(lista)
print(lista2)


mi_diccionario ={}
