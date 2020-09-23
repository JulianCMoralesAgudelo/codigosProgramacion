SubAlgoritmo insercion(arreglo Por Referencia,dato)
	Definir aux,i,k Como Entero;
	// Definir las variables auxiliares para el intercambio.
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		// Auxiliar = a la primera posicion del arreglo
		aux = arreglo[i];
		// Auxiliar2 = a la posicion  anterior a la primera del arreglo
		k=i-1;		
		// Minentras auxilia2 sea mayor a cero y la posicion del arreglo en el indice auxiliar2 sea mayor a auxiliar1 haga
		Mientras k>=0 y arreglo[k] > aux Hacer
			arreglo[k+1] = arreglo[k];
			// La posicion siguente a auxiliar2 copia la informacion de la posicion actual.
			k=k-1;
			// auxiliar dos va disminuyendo hasta encontrar el numero a quedar en la posicion correcta.
		FinMientras
		arreglo[k+1]=aux;
		// El arreglo en la posicion delantera a auxiliar2 toma el valor del auxiliar y se repite la busqueda.
		// https://www.youtube.com/watch?v=C-fPGWgeYzY
	FinPara		
FinSubAlgoritmo

Algoritmo OrdenPorInsercion
	// Definicion e inicializacion de variables
	Definir arreglo, dato, i Como Entero;
	Escribir "Ingrese la cantidad de elementos de la lista ";
	
	// Lectura y definicion de informacion
	leer dato;
	Dimension arreglo[dato];
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir "Ingrese el dato numero ", (i+1);
		leer arreglo[i];
	FinPara	
	
	// Manipulacion de datos y Presentacion de datos
	Escribir "Arreglo inicial";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir arreglo[i];
	FinPara	
	insercion(arreglo,dato);	
	
	Escribir "Arreglo ordenado";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir arreglo[i];
	FinPara	
FinAlgoritmo
