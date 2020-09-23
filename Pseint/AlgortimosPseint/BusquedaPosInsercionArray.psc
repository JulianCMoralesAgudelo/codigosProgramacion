SubProceso i <- buscarPosicion (v Por Referencia,m Por Valor,d Por Valor)
	Definir i Como Entero;
	i=1;
	Mientras i<= m y v[i]<d Hacer
		i=i+1;		
	FinMientras		
FinSubProceso

Algoritmo BusquedaPosInsercionArray
	
	// Definicion e inicializacion de variables
	Definir arreglo, dato, i,m,d Como Entero;
	// Lectura y definicion de informacion
	Escribir "Ingrese el tamaño del vector ";	
	leer dato;	
	Dimension arreglo[dato];
	
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir "Ingrese el dato numero ", (i+1);
		leer arreglo[i];
	FinPara
	
	Escribir "Ingrese el indice del arreglo en el cual insertar el dato ";
	Leer m;	
	Escribir "Ingrese el dato a insertar";	
	leer d;	
	// Mostar datos
	Escribir "Arreglo inicial ";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir arreglo[i];
	FinPara
	d=buscarPosicion(arreglo,m,d);
	Escribir "La posicion a ingresar el dato es en la posicion = ",d;
	
		
FinAlgoritmo
