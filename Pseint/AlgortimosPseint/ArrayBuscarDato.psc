SubProceso 	total <- suma(cantidad)
	Definir arreglo,i,dato,total Como Entero;
	Dimension arreglo[cantidad];		
	Escribir "";
	Para i=0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero ", (i+1);
		leer arreglo[i];		
	FinPara	
	total=buscar(arreglo,cantidad);
FinSubProceso

SubProceso 	total <-buscar(arreglo Por Referencia,cantidad)
	Definir array,i,dato,total,elementos Como Entero;	
	elementos=0;
	total=0;
	Escribir "";
	Escribir  "¿ Ingrese el dato que desea buscar ?";
	leer dato;	
	Para i=0 Hasta cantidad-1 Con Paso 1 Hacer
		Si arreglo[i]=dato Entonces			
			Escribir "El numero ",dato, " esta en la posicion ",(i+1);
			elementos=elementos+1;	
		FinSi		
	FinPara		
	total=elementos;	
FinSubProceso

Algoritmo ArrayBuscarDato
	// Definicion de variables
	Definir entrada,total Como Entero;
	Escribir  "¿ Por favor ingrese la cantidad de numeros ?";
	leer entrada;
	total=0;
	
	// Presenyacion de datos.
	total=suma(entrada);
	
	Si total>0 Entonces
		Escribir "El numero repiticiones del numero buscado en el arreglo es = ",total;
	SiNo
		Escribir "El numero repiticiones del numero buscado en el arreglo es = ",total;
	FinSi
FinAlgoritmo
