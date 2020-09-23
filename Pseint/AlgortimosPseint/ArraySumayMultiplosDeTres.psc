SubProceso 	total <- suma(cantidad)
	Definir arreglo,i,dato,multiplos,total Como Entero;
	Dimension arreglo[cantidad];
	multiplos=0;
	total=0;
	Para i=0 Hasta cantidad-1 Con Paso 1 Hacer
		arreglo[i]=0;
	FinPara	
	
	Para i=0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Ingrese un numero entero positivo";
		leer dato;
		Si dato%3==0 Entonces
			arreglo[i]=dato;
			total=total+arreglo[i];
			multiplos=multiplos+1;
			Escribir "El numero ",dato,"/3 = ",(dato/3);
			Escribir "El total acumulado = ", total;			
		FinSi		
		
	FinPara
	
	Escribir "Los multiplos son ";	
	Para i=0 Hasta multiplos-1 Con Paso 1 Hacer
		Si arreglo[i]>0 Entonces
			Escribir arreglo[i];		
		FinSi		
	FinPara
	
FinSubProceso

Algoritmo ArraySumayMultiplosDeTres
	
	// Definicion de variables
	Definir entrada,total Como Entero;
	Escribir  "¿ Por favor ingrese la cantidad de numeros ?";
	leer entrada;
	total=0;
	
	// Presenyacion de datos.
	total=suma(entrada);
	Escribir "La suma de los multiplos de tres en el arreglo es = ",total;
	
FinAlgoritmo
