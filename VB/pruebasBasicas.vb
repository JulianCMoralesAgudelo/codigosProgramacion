'
'**************************************************************************************************************************************************************

'Script          : pruebasBasicas.vb
'Fecha           : 29/09/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Prueba del lenguaje visual basic para apliaciones.

'**************************************************************************************************************************************************************

Sub pruebasBasicas()

'Escribir en una celda usando su ubicacion
Range("A1").Value = "Hola Mundo"

'Escribir en un rango usando su ubicacion
Range("B2:G11").Value = "Hola Mundo 2"

'Ingresar datos en uhna celda usnando CELLS
Cells(13, 1).Value = "Esto es A13"

'Ingresar un numero en una celda (No se neceistan las comillas)
Range("A1").Value = 1234

'Escribir en una celda usando el nombre absoluto vba de la hoja y ubicacion
Range("A1").Value = "¡Hice esto desde la hoja 1!"

'Escribir en una celda de otro libro
Workbooks("Libro1.xlsx"). _
    Sheets("Hoja1"). _
        Range("A1").Value = "¡Hice esto desde otro libro!"

'Escribir el valor de una variable en una celda

'Deficion de la variable
miPrimeraVariable = "Es un lindo dia :)"

'Asignar el valor d ela variable a una celda
Range("A2").Value = miPrimeraVariable

End Sub