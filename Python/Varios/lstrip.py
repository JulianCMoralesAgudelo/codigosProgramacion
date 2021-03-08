# Demostración del método the lstrip()
# Método lstrip Python () se utiliza para cortar espacios o una cadena de caracteres especificada a la izquierda.

print("[" + " tau ".lstrip() + "]")

# El método con un parámetro lstrip() hace lo mismo que su versión sin parámetros, pero elimina todos los caracteres incluidos

# en el argumento (una cadena), no solo espacios en blanco:

print("www.cisco.com".lstrip("w."))

print("pythoninstitute.org".lstrip(".org"))

print("orgpythoninstitute.org".lstrip(".org"))

str = "     this is string example....wow!!!     "
print(str.lstrip())
str = "88888888this is string example....wow!!!8888888"
print(str.lstrip('8'))
