
'**************************************************************************************************************************************************************

'Script          : letraColumnaNumeroFilaSplit.vb
'Fecha           : 01/10/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Obtener letra de la columna y numero de fila.

'**************************************************************************************************************************************************************

Sub letraColumnaNumeroFilaSplit()

' Uso del metodo split para dividir la ubicacion de la celda activa mediante su referencia absoluta

'Obtener la letra de la columna activa
letraColumnaActiva = Split(ActiveCell.Address, "$")(1)
'Escribir letra celda activa en la celda contigua a la derecha
ActiveCell.Offset(0, 1) = letraColumnaActiva

'Obtener numero de fila de la celda activa (metodo alternativo)
nuneroFila = Split(ActiveCell.Address, "$")(2)

'Escribir numero celda activa en la segunda celda contigua a la derecha
ActiveCell.Offset(0, 2) = nuneroFila

End Sub