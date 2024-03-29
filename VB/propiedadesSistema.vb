'**************************************************************************************************************************************************************

'Script          : propiedadesSistema.vb
'Fecha           : 01/10/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Obtener datos importantes del sistema, ruta del libro o celdas.

'**************************************************************************************************************************************************************

Sub propiedadesSistema()

' Propiedades importantes del sistema ruta o libro

' Obtener el usuario activo en excel
miNombreUsuario = Application.UserName

' Obtener nombre libro activo
nombreLibroActivo = ActiveWorkbook.Name

' Obtener nombre libro
nombreLibro = ThisWorkbook.Name

' Obtener ruta libro
rutaLibroActivo = ActiveWorkbook.Path

' Obtener ruta libro
rutaLibro = ThisWorkbook.Path

' Obtener nombre hoja
nombreHoja = ActiveSheet.Name

' Obtener nombre celda activa
nombreHoja = ActiveCell.addres

End Sub