Dim x As Integer
Dim miUltimaFila As Integer

Sub logica1A()

'Variables locales
'miUltimaFila = ActiveSheet.UsedRange.SpecialCells(xlCellTypeLastCell).Row - 1

miUltimaFila = Range("B100000").End(xlUp).Row - 1

'Edad
Dim miEdad As Integer

'Selecciona la hoja correcta (por el nombre vb)'
ShPruebalogica.Select

'Limpia datos anteriores de la columna G'
Range("G2:G" & miUltimaFila).ClearContents

'Selecciona el comienzo del rango (La columna b contirene el genero)'
Range("A2").Select

For x = 1 To miUltimaFila
    'Obtener el vaklor de la columna D (se dezplaza 3 columnas desde la A)
    miEdad = ActiveCell.Offset(0, 3).Value
    
    'Comerzar la seleccion de casos
    Select Case miEdad
    
        Case Is < 20
            ActiveCell.Offset(0, 6).Value = "Adolescente"
        Case Is < 30
            ActiveCell.Offset(0, 6).Value = "Veinteañero"
        Case Is < 40
            ActiveCell.Offset(0, 6).Value = "Treintañero"
        Case Is < 50
            ActiveCell.Offset(0, 6).Value = "En los mejores"
        Case Is >= 50
            ActiveCell.Offset(0, 6).Value = "Esa platica se perdio"
        ' Finaliza la seleccion de casos
    End Select
    
    'Desplazamiento hacia abajo
    ActiveCell.Offset(1, 0).Select
    
'Fin del loop'
Next

'Selecciona el comienzo del rango (La columna b contirene el genero)'
Range("A2").Select
    
End Sub