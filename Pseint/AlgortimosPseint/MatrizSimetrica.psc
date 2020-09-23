Subproceso Matriz(filas,columnas)
	Dimension A[filas,columnas];
	Definir A,i,j Como Entero;
	Si (filas=columnas) Entonces
		Escribir "Los datos ingresados son validos para una matriz cuadrada ";
		Para i<-0 Hasta filas-1 Con Paso 1 Hacer
			Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
				Escribir "Ingrese el dato i = ",i," j = ",j;
				leer A[i,j];
			FinPara
			Escribir "Fin fila ";
		Fin Para		
	SiNo
		Escribir "Los datos ingresados no son validos para una matriz cuadrada ";
		
		Para i<-0 Hasta filas-1 Con Paso 1 Hacer
			Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
				Escribir "Ingrese el dato i = ",i," j = ",j;
				leer A[i,j];
			FinPara
			Escribir "Fin fila ";
		Fin Para		
	Fin Si
	
	Escribir "Esta es la matriz ingresada ";
		
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer			
			Escribir 'i = ',i,', j = ',j,' = ' A[i,j];
		FinPara		
	Fin Para
	
	Escribir "La transpuesta de una matriz es cambiar filas por columnas ";
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer			
			Escribir 'i = ',i,', j = ',j,' = ' A[i,j];
		FinPara		
	Fin Para
	
FinSubProceso
//************************************************************************************************
Algoritmo MatrizSimetrica
	// Definicion y declaracion de variables.	
	Definir filas, columnas como Entero;
	
	// Lectura de datos.
	Escribir "Ingrese los datos para crear la matriz :";
	Escribir "Ingrese la cantidad de filas :";
	leer filas;
	Escribir "Ingrese la cantidad de columnas :";
	leer columnas;	
	Matriz(filas,columnas);	
FinAlgoritmo
