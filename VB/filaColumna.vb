'
'**************************************************************************************************************************************************************

'Script          : filaColumna.vb
'Fecha           : 01/10/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Obtener el numero de fila y columna de la celda activa.

'**************************************************************************************************************************************************************

Sub filaColumna()

'Propiedad ROW (Fila)

'Obtener el numero de fila de la celda activa
numeroFila = ActiveCell.Row

'Obtener el ultimo numero de la ultima fila de un rango, moviendo hacia abajo.
ultimaFila = Range("a2").End(xlDown).Row

'Propiedad COLUMM (Columna)

'Obtener el numero de fila de la celda activa
numeroColumna = ActiveCell.Column

'Obtener el ultimo numero de la ultima fila de un rango, moviendo hacia abajo.
ultimaColumna = Range("a1").End(xlToRight).Column

End Sub


