lista = list(range(1, 5))
print(lista)

lista2 = list(range(10))
print(lista2)

lista3 = list(range(1, 10, 2))
print(lista3)

vocabulario = ["mejorar", "castigar", "defenestrar"]
numeros = [17, 123]
vacio = []

print(vocabulario, numeros, vacio)

jinetes = ["guerra", "hambre", "peste", "muerte"]
i = 0
while i < 4:
    print(jinetes[i])
    i = i + 1

listaAnidada= ['spam!', 1, ['Brie', 'Roquefort', 'Pol le Veq'], [1, 2, 3]]
print(listaAnidada)

print()
print("Lista Anidada")

i = 0
while i < len(listaAnidada):
    print(len(str(listaAnidada[i])))
    i = i + 1