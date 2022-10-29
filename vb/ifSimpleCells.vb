Dim x As Integer
Dim miUltimaFila As Integer

Sub logica1A()

'Selecciona la hoja correcta (por el nombre vb)'
ShPruebalogica.Select

'Limpia datos anteriores de la columna G'
Range("G:G").ClearContents

'Mientras que la celda activa bi este vacia ...'
For x = 1 To 50
    If Cells(x + 1, 2).Value = "Masculino" Then Cells(x + 1, 7) = "Hombre"
    'Fin del loop'
    Next
End Sub
