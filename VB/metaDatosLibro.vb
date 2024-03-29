'
'**************************************************************************************************************************************************************

'Script          : metaDatosLibro.vb
'Fecha           : 01/10/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Obtener metadados del libro abierto

'**************************************************************************************************************************************************************

Sub metaDatosLibro()

'Obtener nombre de la aplicacion
nombreAplicacion = ActiveWorkbook.BuiltinDocumentProperties("Application Name")

'Obtener autor
autorAplicacion = ActiveWorkbook.BuiltinDocumentProperties("Author")

'Obtener ultimo autor
autorAplicacion = ActiveWorkbook.BuiltinDocumentProperties("Last Author")

'Obtener compañia
companyAplicacion = ActiveWorkbook.BuiltinDocumentProperties("Company")

'Fecha de creacion documento
fechaCreacionAplicacion = ActiveWorkbook.BuiltinDocumentProperties("Creation Date")

'Ultima fecha de grabacion
fechaCreacionAplicacion = ActiveWorkbook.BuiltinDocumentProperties("Last Save Time")

'Obtener el conteo total de hojas del libro
cantidadHojasLibro = ActiveWorkbook.Sheets.Count

'Obtener indice hoja actual
numeroHoja = ActiveSheet.Index

'Obtener el conteo total de libros abiertos
cantidadLibrosAbiertos = Application.Workbooks.Count

End Sub