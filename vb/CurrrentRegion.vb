Sub pruebasBasicas()

'La propiedad CURRENT REGION (region actual)'

'Selecciona el rango actual alrededor de la celda elegida'
Range("A5").CurrentRegion.Select
'Procedimiento similar con CELLS'
Cells(5, 1).CurrentRegion.Select
'Procedimiento similar con celda activa'
ActiveCell.CurrentRegion.Select

End Sub
