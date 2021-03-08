# Cifrado César

'''
Solo acepta letras latinas (nota: los romanos no usaban espacios en blanco ni dígitos).
Todas las letras del mensaje están en mayúsculas (nota: los romanos solo conocían las mayúsculas).


    La línea 02: pide al usuario que ingrese un mensaje (sin cifrar) de una línea.
    La línea 03: prepara una cadena para el mensaje cifrado (esta vacía por ahora).
    La línea 04: inicia la iteración a través del mensaje.
    La línea 05: si el caracter actual no es alfabético...
    La línea 06: ...ignoralo.
    La línea 07: convierta la letra a mayúsculas (es preferible hacerlo a ciegas, en lugar de verificar si es necesario o no).
    La línea 08: obtén el código de la letra e increméntalo en uno.
    La línea 09: si el código resultante ha "dejado" el alfabeto latino (si es mayor que el código de la Z)...
    La línea 10: ... cámbialo al código de la A.
    La línea 11: agrega el carácter recibido al final del mensaje cifrado.
    La línea 13: imprime el cifrado.



'''

text = input("Ingresa tu mensaje: ")

cifrado = ''

for char in text:

    if not char.isalpha():

        continue

    char = char.upper()

    code = ord(char) + 1

    if code > ord('Z'):

        code = ord('A')

    cifrado += chr(code)



print(cifrado)