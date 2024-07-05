palabra = input("Ingrese una palabra por favor")

if palabra < "banana":
    print("Tu palabra, " + palabra + ", va antes de banana.")
elif palabra > "banana":
    print("Tu palabra, " + palabra + ", va después de banana.")
else:
    print("Sí, no tenemos bananas!")
