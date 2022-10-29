Option Explicit

Sub LoopDoLoop()

'Seleccionar la primera celda del rango
Range("A1").Select

Do While ActiveCell.Value <> ""

    ActiveCell.Offset(1, 0).Select

Loop


End Sub