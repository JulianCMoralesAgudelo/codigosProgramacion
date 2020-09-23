# ************************* Media, Moda y Promedio *************************

# -*- coding: utf-8 -*-

#Funciónqué será llamada para imprimir un texto y una cantidad 
defimprimir(texto, valor):
    print('{} {}\n'.format(texto, valor))

defpromedio(datos):
    sumatoria = sum(datos)
    imprimir('La sumatoria es: ', sumatoria)

    longitud = float(len(datos))
    imprimir('La longitud es: ', longitud)

    resultado = sumatoria / longitud
    imprimir('El resultado es: ', resultado)

defmoda(datos):
    repeticiones = 0

    for i in datos:
        n = datos.count(i)
        if n > repeticiones:
            repeticiones = n

    moda = [] #Arreglo donde se guardara el o los valores de mayor frecuencia 

    for i in datos:
        n = datos.count(i) # Devuelve el número de veces que x aparece enla lista.
        if n == repeticiones and i not in moda:
            moda.append(i)

    if len(moda) != len(datos):
        imprimir ('Moda: ', moda)
    else:
        print ('No hay moda')

defmedia(datos):
    datos.sort() #.sort Ordena los ítems dela lista

    if len(datos) % 2 == 0:
        n = len(datos)
        mediana = (datos[n / 2 - 1] + datos[n / 2]) / 2
    else:
        mediana = datos[len(datos) / 2]

    imprimir ('Media: ', mediana)

defmain():
    datos = list() #Lista donde cada dato será guardado

    salir = int(raw_input('Cuantos valores quieres ingresar? : '))

    for i inrange(salir):
            number = int(raw_input('Escribe el dato: '))
            datos.append(number) #Agregar un nuevo valor a la lista

    promedio(datos)
    moda(datos)
    media(datos)

if __name__ == '__main__': #Inicio del programa
    main()
