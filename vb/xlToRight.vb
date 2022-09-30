Sub pruebasBasicas()
'Pega porciones de código aqui para probarlos'

'MOVERSE A DERECHA'

'Moverse hasta el final del rango'
Range("A5").End(xlToRight).Select
'La misma orden con ActiveCell
ActiveCell.End(xlToRight).Select

End Sub

