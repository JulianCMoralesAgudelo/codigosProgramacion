Algoritmo Piramide
	// Definicion y declaracion de variables.
	Definir letra,espacio Como Caracter;
	Definir filas,columnas,i,j Como Entero;	
	i=0; j=i; filas=0; columnas=filas; letra="#"; espacio='';
	// Lectura de datos.
	Escribir "Digite el numero de niveles para la piramide :";
	Leer  filas;
	// Manupulacion de datos.
	Para i<-1 Hasta filas Con Paso 1 Hacer
		Para j<-1 Hasta i Con Paso 1 Hacer
			Escribir letra;
		Fin Para		
	Fin Para
	// Presentacion de datos.
	
FinAlgoritmo
