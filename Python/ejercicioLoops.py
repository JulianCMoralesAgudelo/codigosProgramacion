
# Instrucciones
# 1. En num_list cree un bucle "for" nuevo e imprima cada valor de la lista en orden secuencial.
# 2. Dentro del bucle "for", cree una condición que busque todos los números mayores que 45 e imprima solo números que cumplan esa condición.
# 3. Cambie la sentencia "print" a "Más de 45" y agregue una condición "else" con una sentencia "print" de "Menos de 45".
# 4. Actualice el bucle "for" para utilizar la función enumerar y poder obtener y utilizar el índice. Modifique la condición para buscar el número 36 e imprima lo siguiente: "Número encontrado en la posición:", número de índice
# 5. A continuación, cree una nueva variable denominada "count", asígnele el valor 0 y ubíquela fuera del bucle "for".
# 6. Dentro del bucle "for" incremente el contador en 1.
# 7. Agregue una sentencia "print" fuera del bucle "for" para imprimir el valor de la variable "count".
# 8. Por último, agregue una sentencia "break" directamente luego de la sentencia "print" dentro de la condición "if" para encontrar el número. 

# Lista de datos
num_list = [33,42,5,66,77,22,16,79,36,62,78,43,88,39,53,67,89,11]
# Variable para contar el número de elementos iterados
count = 0

# Bucle for con enumerar para obtener el índice
for x,num in enumerate(num_list):
    # Incrementar el contador
    count += 1
        # Condición para números mayores que 45
    if num == 36:
        print('Number found at ', x)
        break

print(count)