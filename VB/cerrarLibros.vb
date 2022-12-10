
'**************************************************************************************************************************************************************

'Script          : cerrarLibros.vb
'Fecha           : 01/10/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Abrir y cerrar libros desde vba

'**************************************************************************************************************************************************************

Sub pruebasBasicas()

'Cerrar libro
ActiveWorkbook.Close

'Cerrar libros segun indice de apertura
Workbooks(1).Close

'Cerrar libro activo y guardar cambios
ActiveWorkbook.Close savechanges:=True

'Cerrar libro activo y no guardar cambios
ActiveWorkbook.Close savechanges:=False

End Sub