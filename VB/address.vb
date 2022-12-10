'
'**************************************************************************************************************************************************************

'Script          : address.vb
'Fecha           : 29/09/2022
'Autor:          : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com>
'Actulizacion    :
'Versión         : 1.0
'Modificado      :
'Descripcion     : Propiedades de ubicacion de una celda o rango.

'**************************************************************************************************************************************************************

Sub address()

'Propiedad Address (Ubicaccion)

'Obtener la ubicacion de la celda activa
ubicacionCeldaActiva = ActiveCell.Address

'Obtener la ubicacion de la ultima celda del rango debajo de A5
ubicacionUltimaFila = Range("A5").End(xlDown).Address

'Obtener la ubicacion de la ultima celda en el rango a la derecha de A5
ubicacionUltimaColumna = Range("A5").End(xlToRight).Address

'Obtener la ubicacion de la ultima celda en el rango a la derecha de A5
ubicacionUltimaFila = Range("A1048576").End(xlUp).Address

'Obtener la ubicacion de la primera fila vacia DESPUES de la última fila
primeraUbicacionVacia = Range("A1048576").End(xlUp).Offset(1, 0).Address


End Sub