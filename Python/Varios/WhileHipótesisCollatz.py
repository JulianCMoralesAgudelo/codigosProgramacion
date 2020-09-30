print("Ingrese un numero mayor a 1:",end="")
num = int(input())

sec = [num]

while num < 1:
    print("Ingrese un numero mayor a 1:",end="")
    num = int(input())

while num > 1:
    if num % 2 == 0:
        num //= 2
    else:
        num = num * 3 + 1
    sec.append(num)

print("Secuencia = ",sec,"Pasos = ",len(sec)-1)

    