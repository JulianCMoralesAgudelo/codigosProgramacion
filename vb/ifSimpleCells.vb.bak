Dim x As Integer
Dim miUltimaFila As Integer

Sub logica1A()

'Selecciona la hoja correcta (por el nombre vb)'
ShPruebalogica.Select

'Limpia datos anteriores de la columna G'
Range("G:G").ClearContents

'Selecciona el comienzo del rango (La columna b contirene el genero)'
Range("B2").Select

'Mientras que la celda activa bi este vacia ...'
While ActiveCell.Value <> ""
    'Prueba logica...'
    'Si el valor de la celda activa es 'Masculino", va a escribir "Es hombre" en la columna G'
    If ActiveCell.Value = "Masculino" Then ActiveCell.Offset(0, 5).Value = "Hombre"
    'Se desplaza una celda hacia abajo'
    ActiveCell.Offset(1, 0).Select
    
    'Fin del loop'
    Wend

End Sub
