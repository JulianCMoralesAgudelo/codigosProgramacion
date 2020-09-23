Algoritmo ArraysInsertarDato
	
	Definir array, d, i, m, n Como Entero;	
	Definir res Como Caracter;
	Escribir "Ingrese la cantidad del arreglo";
	Leer n;
	Dimension array[n];	
	d = 0;
	i = 0;
	m = 0;
	
	
	Para i <- 0 Hasta n-1 Con Paso 1 Hacer
		Escribir "ingrese un numero";
		Leer array[i];		
	Fin Para
	
	Escribir "ingrese dato a insertar";
	leer d;
	
	i = buscarPos(array,m,d);
	
	Escribir i;
	
	// Array = array
	// Numero de posiciones ocupadas en el vector = m
	// Tamaño del vector = n;
	// Posicion donde insertar el adato = i
	// Dato a insertar = d;
	
	//insertarDato(array,m,n,i,d);
	
	Escribir "[" Sin Saltar;
	Para i<-0 Hasta m Con Paso 1 Hacer
			Escribir array[i],"|" Sin Saltar;
	Fin Para
	Escribir "]" Sin Saltar;
	Escribir "";
	
FinAlgoritmo

SubProceso pos <- buscarPos(array, m, d)
	Definir i, pos Como Entero;
	i = 0;
	//pos = -1;	
	Mientras i <= m - 1 && array[i] <> d Hacer
		i = i + 1;		
	Fin Mientras	
	pos = i;	
FinSubProceso


SubProceso insertarDato(array Por Referencia,m Por Referencia,n,i,d)
	Definir j Como Entero;
	j = 0;	
	Si m==n Entonces
		Escribir "Array llleno";
	SiNo
		Para j <- m Hasta i Con Paso -1 Hacer
			array[j+1] = array[j];
		Fin Para
		array[i] = d;
		m = m + 1;
	Fin Si
FinSubProceso
