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
Do While ActiveCell.Value <> ""
    'Prueba logica...'
    'Si el valor de la celda activa es 'Masculino", va a escribir "Es hombre" en la columna G'
    If ActiveCell.Value = "Masculino" Then
        'Se escribe resultado
        ActiveCell.Offset(0, 5).Value = "Hombre"
    Else
        'Se escribe resultado
        ActiveCell.Offset(0, 5).Value = "Mujer"
    'Fin del if'
    End If
    
    'Desplazamiento hacia abajo
    ActiveCell.Offset(1, 0).Select

    'Fin del loop'
    Loop

End Sub

