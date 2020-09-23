Algoritmo Contacor
	// Definicion y declaracion de variables.
	Definir dato,contador Como Entero;	
	contador =0;
	// Lectura de datos y Manupulacion de datos.
	Mientras (dato!=-1) Hacer
		Escribir "Ingresa un numero o -1 para salir:";
		Leer dato;
		contador=contador+1;		
	Fin Mientras
	// Presentacion de datos.
	Escribir "La cantidad de numeros ingresados fueron ", contador;
FinAlgoritmo
