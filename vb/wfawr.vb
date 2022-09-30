Option Explicit

Sub Macro1()
'
'**************************************************************************************************************************************************************

'Script          : wf-wr.vb
'Fecha           : 28/29/2022
'Autor:          : Cristian Rincon ccrincon@emergiacc.com
'Actulizacion    : Julián Camilo Morales Agudelo <juliancmorales10@gmail.com> <julan.morales@emergiacc.com>
'Versión         : 1.0
'Modificado      : 28/29/2022
'Descripcion     : Este archivo sirve para cambiar el formato de descarga de la sabana WF Web-Reporting que debe de estar en la Hoja2 al formato de la saban de la webreport para la macro creada por 
'                  cristian rincon ccrincon@emergiacc.com y sacar la analitica con el la macro de analitica que el creo.

'**************************************************************************************************************************************************************

	'Apagar formulas
	Application.ScreenUpdating = False
	Application.Calculation = xlCalculationManual

'**************************************************************************************************************************************************************

	'Establecer variable
	Dim final As Long
	Dim rango As Range
	Dim id As Range
	Dim fechahoras As Range
	Dim TMO As Range
	Dim login As Range
	Dim tipi As Range
	Dim servicio As Range
	'A Optimizar
	Dim codCarga As Range
	Dim fechaCarga As Range
	Dim nombreCarga As Range
	'
	Dim telefono As Range
	Dim talkTime As Range
	Dim acw As Range

'**************************************************************************************************************************************************************

	'Establecer rangos
	final = Range("E2").End(xlDown).Row
	Set id = Sheets("Hoja2").Range("F2:F" & final)
	Set fechahoras = Sheets("Hoja2").Range("H2:J" & final)
	Set TMO = Sheets("Hoja2").Range("O2:O" & final)
	Set login = Sheets("Hoja2").Range("K2:K" & final)
	Set tipi = Sheets("Hoja2").Range("L2:M" & final)
	Set servicio = Sheets("Hoja2").Range("D2:E" & final)
	'A Optimizar
	Set codCarga = Sheets("Hoja2").Range("C2:C" & final)
	Set fechaCarga = Sheets("Hoja2").Range("A2:A" & final)
	Set nombreCarga = Sheets("Hoja2").Range("B2:B" & final)
	'
	Set telefono = Sheets("Hoja2").Range("N2:N" & final)
	Set talkTime = Sheets("Hoja2").Range("P2:P" & final)
	Set acw = Sheets("Hoja2").Range("Q2:Q" & final)

'**************************************************************************************************************************************************************

    ' Seleccionar de la sabana WF y pegar idunico cliente'
    id.Copy
    Sheets("Hoja1").Select
    Range("A2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    ' Seleccionar de la sabana WF y fecha llamada, hora inicio y hora fin lalamada'
    fechahoras.Copy
    Range("B2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
            :=False, Transpose:=False
            
    ' Seleccionar de la sabana WF y TMO'
    TMO.Copy
    Range("E2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
            :=False, Transpose:=False

    ' Seleccionar de la sabana WF y pegar LOGIN cliente
    login.Copy
    Range("F2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
            :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF y tipificaciones
    tipi.Copy
    Range("H2:I2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF y servicio
    servicio.Copy
    Range("J2:K2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF y pegar codigo carga
    codCarga.Copy
    Range("L2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF y fecha carga
    fechaCarga.Copy
    Range("M2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF y nombre carga
    nombreCarga.Copy
    Range("N2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF telefono
    telefono.Copy
    Range("AF2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    ' Seleccionar de la sabana WF talk time
    talkTime.Copy
    Range("AG2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
     ' Seleccionar de la sabana WF ACW
    acw.Copy
    Range("AH2").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    ' Activar formulas
	Application.ScreenUpdating = True
	Application.Calculation = xlCalculationAutomatic

'**************************************************************************************************************************************************************

End Sub