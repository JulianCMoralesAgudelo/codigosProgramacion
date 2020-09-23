Algoritmo Arrays_Insercion
	Definir array , d, i, m, n, pos Como Entero;
	Dimension array[10];
	array[0] = 3;
	array[1] = 5;
	array[2] = 7;
	array[3] = 11;
	array[4] = 25;
	array[5] = 36;
	array[6] = 48;
	
	m = 7;
	d = 9;
	n =10;
	
	Escribir "Lista de datos";
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta m-1 Con Paso 1 Hacer		
		Escribir array[i] Sin Saltar;
		Si i<m-1 Entonces
			Escribir  " ," Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";
	
	pos = buscarPos(array,m,d);
	Escribir "";
	Escribir "El dato se debe insertar en la posicion : ",pos;
	insertarDatoArray(array,n,m,pos,d);
	
	Escribir "Lista de datos";
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta m-1 Con Paso 1 Hacer		
		Escribir array[i] Sin Saltar;
		Si i<m-1 Entonces
			Escribir  " ," Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";
	
	
FinAlgoritmo

// array = vector a trabajar
// m = numero de posiciones que ocupa el vector
// d = dato a insertar

SubProceso pos <- buscarPos(array, m, d)
	Definir i, pos Como Entero;
	i = 0;
	
	Mientras i <= m && array[i] < d Hacer
		i = i + 1;		
	Fin Mientras	
	
	pos = i;
	
FinSubProceso

// array = vector a trabajar Por Referencia
// n = tamaño del vector
// m = numero de posiciones que ocupa el vector Por Referencia
// pos = Posicion donde insertar el dato
// d = dato a insertar

SubProceso insertarDatoArray(array Por Referencia,n,m Por Referencia,i,d)
	
	// Inicialmente verificar que el vector no este lleno.
	Definir j Como Entero;
	
	Si m == n Entonces
		Escribir "Vector lleno";		
	SiNo
		Para j<-m-1 Hasta i Con Paso -1 Hacer
			array[j+1] = array[j];
		Fin Para
		array[i]=d;
		m = m + 1;
	Fin Si	
	
FinSubProceso
