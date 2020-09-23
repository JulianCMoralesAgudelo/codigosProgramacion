Algoritmo ArrayintercambiaPosiciones
	
	// Recorrer array en orden ascendente y desentente e intercambiar posiciones.
	Definir array, d, dato, i, j, n Como Entero;
	Dimension array[15];
	array[0] = 0;
	array[1] = 1;
	array[2] = 2;
	array[3] = 3;
	array[4] = 4;
	array[5] = 5;
	array[6] = 6;
	array[7] = 7;
	
	n = 7;
	
	print(n,array);
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Si i % 2 == 0 Entonces
			swap(array,i,n-1);			
		SiNo			
			swap(array,i,n-2);			
		Fin Si
	Fin Para
	
	print(n,array);
	
	
FinAlgoritmo

SubProceso swap(V Por Referencia,i,j)
	Definir aux Como Entero;		
	aux=V[i];
	V[i]=V[j];
	V[j]=aux;	
FinSubProceso

SubProceso print(n, array Por Referencia)
	Definir i como Entero;
	Escribir "Lista de datos : " Sin Saltar;
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta n-1 Con Paso 1 Hacer		
		Escribir array[i] Sin Saltar;
		Si i < n-1 Entonces
			Escribir  " ," Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";	
	
FinSubProceso
