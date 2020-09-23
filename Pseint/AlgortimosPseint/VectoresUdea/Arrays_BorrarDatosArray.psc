// Buscar posicion del dato a borrar
// Borrar

// array = vector a trabajar Por Referencia
// n = tamaño del vector
// m = numero de posiciones ocupadas del vector, Por Referencia
// pos = Posicion donde insertar el dato
// d = dato a insertar

Algoritmo Arrays_BorrarDatosArray
	
	Definir array , d, i, m, n, pos Como Entero;
	Dimension array[10];
	array[0] = 3;
	array[1] = 1;
	array[2] = 6;
	array[3] = 2;
	array[4] = 8;
	array[5] = 9;
	array[6] = 4;
	
	m = 7;
	d = 2;
	n =10;
	pos = -1;
	
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
	
	// array = vector a trabajar
	// m = numero de posiciones que ocupa el vector
	// d = dato a buscar
	
	Escribir "";
	Escribir "El dato se debe insertar en la posicion : ",pos;	
	
	borrarDatoVal(array, m, pos);
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
	
	borrarDatoRef(array, m, pos);
	// array = vector a trabajar
	// m = numero de posiciones que ocupa el vector
	// pos = posicion a borrar
	
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
// d = dato a buscar

SubProceso pos <- buscarPos(array, m, d)
	Definir i, pos Como Entero;
	i = 0;
	//pos = -1;
	
	Mientras i <= m-1 && array[i] <> d Hacer
		i = i + 1;		
	Fin Mientras	
	
	pos = i;
	
FinSubProceso

// array = vector a trabajar
// m = numero de posiciones que ocupa el vector
// pos = posicion a borrar

SubProceso borrarDatoRef(array Por Referencia, m  Por Referencia, pos)
	
	Definir j Como Entero;
	
	Escribir "Por referencia, " Sin Saltar;
	
	Si pos = m + 1 Entonces
		Escribir "Dato no exixte";
	SiNo
		j = pos + 1;
		Mientras j <= m-1 Hacer
			array[j-1]=array[j];
			j = j + 1;
		Fin Mientras
		
	Fin Si
	

FinSubProceso


SubProceso borrarDatoVal(array , m , pos)
	
	Definir j Como Entero;
	
	Escribir "Por valor, " Sin Saltar;
	
	Si pos = m + 1 Entonces
		Escribir "Dato no exixte";
	SiNo
		j = pos + 1;
		Mientras j <= m-1 Hacer
			array[j-1]=array[j];
			j = j + 1;
		Fin Mientras
		
	Fin Si	
	
FinSubProceso

