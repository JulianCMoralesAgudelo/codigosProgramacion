print("Ingrese el número de bloques:",end="")
bloques = int(input())

#
# Escribe tu código aquí.
#
altura = 0
bloques_nivel = 0

while bloques >= bloques_nivel + 1:
    altura += 1
    bloques_nivel +=1
    bloques -= bloques_nivel

print("La altura de la pirámide:", altura)