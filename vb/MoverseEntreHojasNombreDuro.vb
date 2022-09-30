Sub pruebasBasicas()

'Moverse entre hojas'

'Mover de ctiva a la siguiente hoja a la derecha'
ActiveSheet.Next.Select
'Mover de ctiva a la siguiente hoja a la izquierda'
ActiveSheet.Previous.Select

'Seleccionar la hoja nombrada en vb como Hoja1 nombreDuro'
Hoja1.Select

Range("A1").Select

End Sub
