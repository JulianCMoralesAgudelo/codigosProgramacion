Algoritmo OrdenamientoBurbuja
	
	Definir array, aux, i, j, n, dato Como Entero;
	
	Dimension array[10];
	
	array[0] = 3;
	array[1] = 1;
	array[2] = 6;
	array[3] = 2;
	array[4] = 8;
	array[5] = 9;
	array[6] = 4;	
	n = 7;		
	
	print(n,array);	
	
	//dato = minArray(array,m);
	//Escribir "El numero menor es :",dato;
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta n-2 Con Paso 1 Hacer
			Si array[j] > array[j+1] Entonces				
				aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
			Fin Si				
		Fin Para
	Fin Para
	
	print(n,array);	
	
FinAlgoritmo

SubProceso print(n, array Por Referencia)
	
	Definir i como Entero;
	Escribir "Lista de datos : " Sin Saltar;
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta n-1 Con Paso 1 Hacer		
		Escribir array[i] Sin Saltar;
		Si i < n-1 Entonces
			Escribir  "|" Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";	
	
FinSubProceso
