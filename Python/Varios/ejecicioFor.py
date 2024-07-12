from evaluate import numero

sumatorio = 0

# Completa el ejercicio aquí
for i in range(numero):
    if i % 5 == 0 or i % 7 == 0:
        continue
    else:
        sumatorio += i
