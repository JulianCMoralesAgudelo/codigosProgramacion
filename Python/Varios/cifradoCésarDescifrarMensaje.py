# Cifrado César - descifrar un mensaje

cifrado = input('Ingresa tu criptograma: ')

text = ''

for char in cifrado:

    if not char.isalpha():

        continue

    char = char.upper()

    code = ord(char) - 1

    if code < ord('A'):

        code = ord('Z')

    text += chr(code)



print(text)