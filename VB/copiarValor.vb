'
'**************************************************************************************************************************************************************

'Script          : copiarValor.vb
'Fecha           : 29/09/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : pasa el valor de una celda a otra

'**************************************************************************************************************************************************************

Sub copiarValor()

'Escribir el valor de una celda a otra
Range("B1").Value = Range("A1").Value

'Escribir el valor de un rango a otro rango
Range("B2:B5").Value = Range("A1:A5").Value

'Escribir el valor de una variable en una celda
'la variable contendra el valor de la celda activa
miSegundaVariable = ActiveCell.Value
'Asignar el valor de la variable a una celda G18
Range("G18").Value = miSegundaVariable

End Sub