' Establecer inicio de variables del array
Option Base 1

Sub ArrayOne()

' Array simple, estatico y unidimensional


' Declarar variables
' Nota: EL numero indicado no es el numero de elementos , es el liminte superior

Dim miArray(7) As String    ' Se declara el arreglo
Dim miContador As Integer   ' Contador del sistema

' Se selecciona la hoja correcta
' Nota: No es necesario seleccionar el comienzo del rango

Hoja1.Select

' Limpiar columna D
Range("D:D").ClearContents

' Loop para llenar el array
For miContador = 1 To 7
    'Cargar los datos (Se incrementa cada vez que avanza el loop)
    miArray(miContador) = Cells(miContador, 1).Value
Next

' Loop para escribir datos
For miContador = 1 To 7
    'Cargar los datos (Se incrementa cada vez que avanza el loop)
    Cells(miContador, 4) = miArray(miContador)
Next

End Sub