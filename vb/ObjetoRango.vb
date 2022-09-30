Sub pruebasBasicas()
'Pega porciones de código aqui para probarlos'

'El objeto "Range" (Rango)'

'Selecciona la celda nombrada entr comillas'
Range("A5").Select

'Selecciona un rango simple de celdas mencionadas'
Range("A5:A14").Select

'Selecciona celdas individuales no contiguas mencionadas'
Range("A5,B7,C9").Select

'Selecciona un rango formado por subrangos de celdas'
Range("A5:B5,A7:C7,A9:C10").Select

End Sub