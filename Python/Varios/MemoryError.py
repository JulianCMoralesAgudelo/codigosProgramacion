# este código causa la excepción MemoryError
# advertencia: ejecutar este código puede ser crucial
# para tu sistema operativo
# ¡no lo ejecutes en entornos de producción!

string = 'x'
try:
    while True:
        string = string + string
        print(len(string))
except MemoryError:
    print('¡Esto no es gracioso!')