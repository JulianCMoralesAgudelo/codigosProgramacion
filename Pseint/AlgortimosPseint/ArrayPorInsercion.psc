SubProceso insercion (v Por Referencia,n Por Valor,m Por Referencia,i Por Valor,d Por Valor)
	Definir j Como Entero;
	Si  m=n Entonces
		Escribir "EL vector esta lleno";
	SiNo
		Escribir "EL vector tiene espacio";
		Para j<-m Hasta i Con Paso -1 Hacer
			v[j+1]=v[j];
		FinPara		
	FinSi	
	Mientras i<= m y v[i]<d Hacer
		i=i+1;		
	FinMientras		
FinSubProceso

Algoritmo ArrayPorInsercion
	// Definicion e inicializacion de variables
	Definir arreglo, dato, i,m,d Como Entero;
	// Lectura y definicion de informacion
	Escribir "Ingrese el tamaño del vector ";	
	leer dato;
	Dimension arreglo[dato];
	// m = numero de posiciones que usa el vector
	// i = posicion donde insertar.
	// d = el dato a insertar.
	arreglo[0]=3;
	arreglo[1]=5;
	arreglo[2]=7;
	arreglo[3]=11;
	arreglo[4]=25;
	arreglo[5]=36;
	arreglo[6]=48;
	Escribir "numero de posiciones que usa el vector ";	
	leer m;
	Escribir "Ingrese la posicion donde insertar ";	
	leer i;
	Escribir "Ingrese el dato a insertar ";	
	leer d;
	
	insercion(arreglo,dato,m,i,d);
	Escribir "La posicion a ingresar el dato es en la posicion = ",d;
	
	// Presentacion de datos
	

FinAlgoritmo

