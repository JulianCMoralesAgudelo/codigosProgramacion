Algoritmo OrdenListas
	// Definicion y declaracion de variables.
	Definir i,j,cantidad,lista1,lista2 Como Entero;
	// Lectura de datos.	
	Escribir "Por favor ingrese la cantidad de las listas";
	Leer cantidad;	
	Dimension lista1[cantidad],lista2[cantidad];
	// Manupulacion de datos.
	Escribir "Ingrese los numeros de la primera lista ";
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Escriba un numero ";
		Leer lista1[i];
	Fin Para
	
	Escribir "Ingrese los numeros de la segunda lista ";
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Escriba un numero ";
		Leer lista2[i];
	Fin Para
	// Presentacion de datos.
	Si (lista1[0] < lista2[0]) Entonces
		Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
			Escribir lista1[i];		
		Fin Para
		Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
			Escribir lista2[i];		
		Fin Para
	SiNo		
		Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
			Escribir lista2[i];		
		Fin Para
		Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
			Escribir lista1[i];		
		Fin Para
	FinSi	
	
FinAlgoritmo
