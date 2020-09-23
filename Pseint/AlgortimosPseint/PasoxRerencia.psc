Subproceso PasoxRerenciaFuncion(dato Por Referencia)		
	Escribir "La funcion recibe el numero :", dato;
	dato=dato*5;	
	Escribir "numero modificado = ", dato;
FinSubProceso

Algoritmo PasoxRerencia
	// Definicion y declaracion de variables.
	Definir dato Como Entero;
	// Lectura de datos.
	Escribir "Ingrese un numero:";
	leer dato;	
	// Manupulacion de datos.	
	Escribir "el numero ",dato," se envia a una funcion.";	
	PasoxRerenciaFuncion(dato);
	// Presentacion de datos.		
	Escribir "el numero original cambia = ",dato;
FinAlgoritmo
