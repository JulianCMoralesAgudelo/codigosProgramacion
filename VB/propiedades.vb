'
'**************************************************************************************************************************************************************

'Script          : propiedades.vb
'Fecha           : 29/09/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Propiedades especiales del sistema.

'**************************************************************************************************************************************************************

Sub propiedades()

'Establecer la fuente de A1 con negrita
Range("A1").Font.Bold = True

'Establecer la fuente de A1 sin negrita
Range("A1").Font.Bold = False

'Establecer la fuente de A1 con negrita mediante atributos
Range("A1").Font.FontStyle = "Bold"

'Establecer la fuente de A1 regular mediante atributos
Range("A1").Font.FontStyle = "Regular"

'Establecer la fuente de A1 italic mediante atributos
Range("A1").Font.FontStyle = "Bold italic"

'Establecer color con la propiedad interior
Range("A1").Interior.Color = vbRed

'Establecer color de la fuente
Range("A1").Font.Color = vbWhite

End Sub