Sub pruebasBasicas()
'Pega porciones de código aqui para probarlos'

'Seleccion de rango dinamico'
'Seleccion celda en especifico'
Range("A5").Select
'Ir al final de la derecha'
Range(Selection, Selection.End(xlToRight)).Select
'Ir al final del rango'
Range(Selection, Selection.End(xlDown)).Select
'Seleccion celda en especifico'
Range("A5").Select
'Version activeCell'
Range(ActiveCell, ActiveCell.End(xlDown)).Select

End Sub

