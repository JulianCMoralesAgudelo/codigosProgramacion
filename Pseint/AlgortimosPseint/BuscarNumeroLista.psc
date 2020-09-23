Algoritmo BuscarNumeroLista
	
	// Definicion e inicializacion de variables
	Definir arreglo, contador, dato, i, n Como Entero;
	Definir ok Como Logico;
	
	// Lectura de datos
	Escribir "Ingrese la cantidad de datos de la lista";
	Leer dato;	
	// La longitud de la lista esta definida por el usuario.
	Dimension arreglo[dato];
	
	Escribir "Ingrese una lista de numeros ordenados";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer	
		Escribir "Ingrese un numero";
		Leer arreglo[i];
	FinPara		
	
	Escribir "Ingrese un numero a buscar en la lista";
	leer n;
	BúsquedaSecuencial(arreglo,dato,n);	
	
FinAlgoritmo

SubProceso BúsquedaSecuencial(arreglo Por Referencia,dato,n)	
	Definir i, j, encontrado, min, max , pos Como Entero;
	
	encontrado = -1;
	
	min = arreglo[0];
	Para i<-0 Hasta n-1 Con Paso 1 Hacer			
		Si arreglo[i] < min Entonces
			min = arreglo[i];
		FinSi
	FinPara	
	
	Escribir "El numero menor es ", min;
	
	max = arreglo[n-1];
	Para i<-0 Hasta n-1 Con Paso 1 Hacer			
		Si arreglo[i] > max Entonces
			max = arreglo[i];
		FinSi
	FinPara	
	
	Escribir "El numero mayor es ", max;
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer			
		Si arreglo[i] == n Entonces
			encontrado = arreglo[i];
			pos = i;
		FinSi
	FinPara
	
	Si encontrado !=-1 Entonces
		Escribir "El numero ",n ," fue encontrado en la posicion ",pos;
	SiNo
		Escribir "El numero ",n ," no fue encontrado en la lista ";
	Fin Si	
	
FinSubProceso
