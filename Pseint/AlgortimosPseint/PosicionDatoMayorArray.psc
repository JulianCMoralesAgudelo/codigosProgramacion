Algoritmo PosicionDatoMayorArray
	// Definicion y declaracion de variables.
	Definir cantidad,i,posicion,v,mayor Como Entero;	
	// Lectura de datos.
	Escribir "Ingrese la cantidad de numeros del arreglo";
	Leer cantidad;	
	mayor=0;
	Dimension v[cantidad];
	// Manupulacion de datos.
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Escriba un numero ";
		Leer v[i];
	Fin Para
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Si v[i] > mayor Entonces
			mayor=v[i];	
			posicion=i;
		FinSi
	Fin Para
	// Presentacion de datos.	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir v[i];		
	Fin Para
	
	Escribir "El numero mayor es ", mayor;	
	Escribir "El numero esta en la posicion ", posicion;	
	
FinAlgoritmo
