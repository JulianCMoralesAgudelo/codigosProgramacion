
'Como buena practica las variables se declaran indicando el tipo de dato en su nombre'
Dim intContador As Integer

Sub forNext()

'Seleccionar la primera celda del rango
Range("A1").Select

For intContador = 1 To 10
    
    ActiveCell.Offset(1, 0).Select

Next

End Sub