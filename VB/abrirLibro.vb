
'**************************************************************************************************************************************************************

'Script          : abrirlibro.vb
'Fecha           : 01/10/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Obtener datos importantes del sistema, ruta del libro o celdas.

'**************************************************************************************************************************************************************

Sub abrirlibro()

'Abrir libro
Workbooks.Open Filename:="C:\Users\julian\Downloads\Libro1.xlsx"

'Abrir libro solo lectura
Workbooks.Open Filename:= _
    "C:\Users\julian\Downloads\Libro1.xlsx", ReadOnly:=True
    
'Abrir libro protegido por contraseña
Workbooks.Open Filename:= _
    "C:\Users\julian\Downloads\LibroProtegido.xlsx", Password:="graciasSeñor"
    
'UpdateLinks:=0 No actulizar enlaces externos
'UpdateLinks:=0 Si actulizar enlaces externos

'Notify:=True  Si esta protegido lo abre como solo lectura y notifica
'Notify:=False evita lo anterior

'AddtoMRU:=True 'Agrega el archivo a la lista de los recientemente usados

End Sub
