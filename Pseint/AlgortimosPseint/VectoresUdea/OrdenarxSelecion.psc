SubProceso  ordenxSeleccion (v Por Referencia,m Por Referencia)
	// i posicion de la cual faltan datos por ordenar.
	// j variable que determina el menor dato.
	// k variable almacena el menor dato de los que faltan por ordenar.
	// m = numero de posiciones que usa el vector
	Definir i,j,k Como Entero;	
	i=1;	
	Para i=0 Hasta m-1 Con Paso 1 Hacer
		k=i;	
		Para j=i+1 Hasta m-1 Con Paso 1 Hacer
			Si v[j] < v[k] Entonces
				k =j;
			FinSi
		FinPara
		swap(v,i,k);
	FinPara
	
FinSubProceso

SubProceso swap(V Por Referencia,i,j)
	Definir aux Como Entero;		
	aux=V[i];
	V[i]=V[j];
	V[j]=aux;	
FinSubProceso

Algoritmo OrdenarxSelecion
	// Definicion e inicializacion de variables
	Definir arreglo,dato,m,i,resultado Como Entero;
	// Lectura y definicion de informacion		
	Dimension arreglo[8];
	m = 7;
	// m = numero de posiciones que usa el vector
	// i = posicion donde insertar.
	// d = el dato a insertar.
	arreglo[0]=3;
	arreglo[1]=1;
	arreglo[2]=6;
	arreglo[3]=2;
	arreglo[4]=8;
	arreglo[5]=9;
	arreglo[6]=4;

	// Presentacion de datos	
	Escribir "Arreglo inicial";
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Escribir arreglo[i], " ", Sin Saltar;
	FinPara	
	Escribir "";
	//Escribir "Ingrese el dato a buscar :";	
	//leer dato;
	ordenxSeleccion(arreglo,m);
	
	Escribir "Arreglo final";
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Escribir arreglo[i], " ", Sin Saltar;
	FinPara	
	Escribir "";
	
FinAlgoritmo
