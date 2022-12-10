Sub pruebasBasicas()

'Moverse entre hojas'

'Mover de ctiva a la siguiente hoja a la derecha'
ActiveSheet.Next.Select
'Mover de ctiva a la siguiente hoja a la izquierda'
ActiveSheet.Previous.Select

'Seleccionar una hoja usando su nombre de pestaña'
Sheets("Cero").Select

Range("A1").Select

End Sub
