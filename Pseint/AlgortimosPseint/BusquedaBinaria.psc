SubProceso  dato <- busquedaBin (v Por Referencia,m Por Referencia,d Por Valor)
	Definir i,j,dato Como Entero;
	Definir mitad Como Real;
	i=1;
	j=m;		
	Mientras i<=j Hacer
		mitad= (i+j)/2;
		mitad=trunc(mitad);
		Si v[mitad]=d Entonces
			dato=mitad;
		FinSi
		Si v[mitad] < d Entonces
			i= mitad+1;
		SiNo
			j=mitad-1;
		FinSi		
	FinMientras		
FinSubProceso

Algoritmo BusquedaBinaria 
	// Definicion e inicializacion de variables
	Definir arreglo,dato,m,i,resultado Como Entero;
	// Lectura y definicion de informacion		
	Dimension arreglo[15];
	m=14;
	// m = numero de posiciones que usa el vector
	// i = posicion donde insertar.
	// d = el dato a insertar.
	arreglo[0]=3;
	arreglo[1]=5;
	arreglo[2]=7;
	arreglo[3]=9;
	arreglo[4]=15;
	arreglo[5]=23;
	arreglo[6]=28;
	arreglo[7]=33;
	arreglo[8]=39;
	arreglo[9]=42;
	arreglo[10]=51;
	arreglo[11]=67;
	arreglo[12]=69;
	arreglo[13]=73;
	arreglo[14]=84;	
	// Presentacion de datos	
	Escribir "Arreglo inicial";
	Para i<-0 Hasta m Con Paso 1 Hacer
		Escribir arreglo[i], " ", Sin Saltar;
	FinPara	
	Escribir "";
	Escribir "Ingrese el dato a buscar :";	
	leer dato;	
	
	resultado=busquedaBin(arreglo,m,dato);
	Escribir "EL numero buscado esta en la posicion numero  ",resultado;
FinAlgoritmo
