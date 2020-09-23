Algoritmo OrdenArray
	//Definicion de variables
	Definir arreglo,aux,i,j,k,numero,entrada,nComparaciones Como Real;
	Escribir "El la cantidad de numeros a ingresar :";
	Leer  entrada;	
	//Inicializacion de variables	
	aux=0;
	nComparaciones=0;
	numero=entrada;	
	Dimension arreglo[numero];			
	//Recorrido eel arreglo.
	nComparaciones= ((numero*numero)+numero)/4;
	Escribir "Numero de comparaciones a realizar ",nComparaciones;
	
	Para i<-0 Hasta numero-1 Con Paso 1 Hacer
		Leer arreglo[i];
	Fin Para
	// Manupulacion de datos.
	Para i<-0 Hasta numero-1 Con Paso 1 Hacer
		Para j<-(i+1) Hasta numero-1 Con Paso 1 Hacer		
			Si arreglo[i]>arreglo[j] Entonces
				//Intercambiamos valores
				aux=arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j]=aux;
			FinSi
		Fin Para
	Fin Para	
	
	// Presentacion de datos.
	Para i<-0 Hasta numero-1 Con Paso 1 Hacer
	Escribir arreglo[i];
	Fin Para
	
FinAlgoritmo
