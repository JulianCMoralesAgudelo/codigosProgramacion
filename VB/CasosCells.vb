Dim x As Integer
Dim miUltimaFila As Integer

Sub logica1A()

'Variables locales
miUltimaFila = ActiveSheet.UsedRange.SpecialCells(xlCellTypeLastCell).Row - 1

'miUltimaFila = Range("B100000").End(xlUp).Row - 1

'Variable auxiliar
Dim celda As Integer
celda = 2

'Edad
Dim miEdad As Integer

'Selecciona la hoja correcta (por el nombre vb)'
ShPruebalogica.Select

'Limpia datos anteriores de la columna G'
Range("G2:G" & miUltimaFila).ClearContents

'Selecciona el comienzo del rango (La columna b contirene el genero)'
Cells(celda, 1).Select

For x = 1 To miUltimaFila
    
    'Obtener el valor de la columna D (se dezplaza 3 columnas desde la A)
    miEdad = Cells(celda, 4).Value
    
    'Comerzar la seleccion de casos
    Select Case miEdad
    
        Case Is < 20
            Cells(celda, 7).Value = "Adolescente"
        Case Is < 30
            Cells(celda, 7).Value = "Veinteañero"
        Case Is < 40
            Cells(celda, 7).Value = "Treintañero"
        Case Is < 50
            Cells(celda, 7).Value = "En los mejores"
        Case Is >= 50
            Cells(celda, 7).Value = "Esa platica se perdio"
        ' Finaliza la seleccion de casos
    End Select
    
    celda = celda + 1
    
    'Desplazamiento hacia abajo
    Cells(celda, 1).Select
    
'Fin del loop'
Next

'Selecciona el comienzo del rango (La columna b contirene el genero)'
Range("A2").Select
    
End Sub