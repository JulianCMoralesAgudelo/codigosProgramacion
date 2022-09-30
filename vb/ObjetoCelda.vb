Sub pruebasBasicas()
'Pega porciones de código aqui para probarlos'

'El objeto "Cells" (Celda)'
'Selecciona la fila donde coincide la fila 1 y la columna 1'
Cells(1, 1).Select

'Selecciona la fila donde coincide la fila 5 y la columna 1'
Cells(5, 1).Select

'Selecciona A1:A14 usando el objeto Cells (celda)'
Range(Cells(5, 1), Cells(14, 1)).Select

End Sub

