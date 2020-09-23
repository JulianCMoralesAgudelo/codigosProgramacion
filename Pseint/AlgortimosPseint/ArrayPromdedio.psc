SubProceso 	total <- suma(cantidad)
	Definir arreglo,i,dato,total,elementos Como Entero;
	Dimension arreglo[cantidad];
	elementos=0;
	total=0;
	Para i=0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Ingrese un numero entero positivo :";
		leer arreglo[i];
		total=total+arreglo[i];
		elementos=elementos+1;
	FinPara		
	
	Escribir "Los elementos del arreglo son ";	
	Para i=0 Hasta cantidad-1 Con Paso 1 Hacer
		Si arreglo[i]>0 Entonces
			Escribir  "[",arreglo[i],"]";		
		FinSi		
	FinPara
	Escribir "La suma total de los n elementos es = ",total; 
	total=total/elementos;
FinSubProceso

Algoritmo ArrayPromedio
	
	// Definicion de variables
	Definir entrada,total Como Entero;
	Escribir  "¿ Por favor ingrese la cantidad de numeros ?";
	leer entrada;
	total=0;
	
	// Presenyacion de datos.
	total=suma(entrada);
	Escribir "El promedio de los n elementos es = ",total;
	
FinAlgoritmo