Sub pruebasBasicas()
'Pega porciones de código aqui para probarlos'

'El desplazamientoi offset'

'Detenrminael desplazamiento desde una celda a otra en particular'
'Los numeros negativos son desplazamiento hacia arriba para filas o izquierda para columnas'
Range("A5").Offset(1, 0).Select

'Tambien aplica en la celda activa'
ActiveCell.Offset(0, 1).Select

End Sub

