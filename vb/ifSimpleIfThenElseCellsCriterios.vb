Dim x As Integer
Dim miUltimaFila As Integer
Sub logica1A()

miUltimaFila = ActiveSheet.UsedRange.SpecialCells(xlCellTypeLastCell).Row - 1

'Selecciona la hoja correcta (por el nombre vb)'
ShPruebalogica.Select

'Limpia datos anteriores de la columna G'
Range("G2:G" & miUltimaFila).ClearContents

'Selecciona el comienzo del rango (La columna b contirene el genero)'
Range("B2").Select

For x = 1 To miUltimaFila
    If Cells(x + 1, 2).Value = "Masculino" And Cells(x + 1, 5).Value = "Marrón" Then
        Cells(x + 1, 7) = "Hombre de cabello " & Cells(x + 1, 5)
    Else
        Cells(x + 1, 7) = "Mujer de cabello " & Cells(x + 1, 5)
    End If
'Fin del loop'
Next
    
End Sub