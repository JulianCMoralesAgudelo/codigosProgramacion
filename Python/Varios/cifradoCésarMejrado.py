# Cifrado César Mejrado
import string
text = input("Ingresa tu mensaje: ")
vc = int(input("Ingresa un valor de cambio: "))
mayu = string.ascii_uppercase
minu = string.ascii_lowercase
out = ''
text = list(text)


for i in range(len(text)):
    if (text[i] in mayu) or (text[i] in minu) :
        letr=str(ord(i)+vc)
        out += text[int(letr)]
print(out)
