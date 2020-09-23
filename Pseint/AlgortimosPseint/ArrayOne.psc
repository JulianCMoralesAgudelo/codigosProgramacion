Algoritmo ArrayOne
	// Definicion y declaracion de variables.
	Definir cantidad,arreglo,i Como Entero;
	i <- 0;
	cantidad<- 0;
	// Lectura de datos.
	Escribir "Por favor ingrese la cantidad cantidad", cantidad;
	leer cantidad;
	Dimension arreglo[cantidad];;
	
	Para i<-0 Hasta (cantidad-1) Con Paso 1 Hacer
		Escribir "Por favor ingrese un numero";
		Leer arreglo[i];
	FinPara	
	// Presentacion de datos.
	Para i<-0 Hasta (cantidad-1) Con Paso 1 Hacer
		Escribir "Dato ", arreglo[i] ;		
	FinPara	
	
FinAlgoritmo
