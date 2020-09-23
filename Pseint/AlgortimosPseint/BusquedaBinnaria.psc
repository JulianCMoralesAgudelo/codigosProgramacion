Algoritmo BusquedaBinnaria
	
	// Definicion e inicializacion de variables
	Definir arreglo, grupos, dato, i, j, length Como Entero;
	// Lectura de datos
	Escribir "Ingrese la cantidad de datos de la lista";
	Leer dato;	
	// La longitud de la lista esta definida por el usuario.
	length = dato;
	Escribir "Ingrese una lista de numeros ";
	Dimension arreglo[dato];
	length=dato;
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer		
		Escribir "Ingrese un numero";
		Leer arreglo[i];
	FinPara	
	
	// Se ingresa el numero a buscar.
	Escribir "Ingrese la cantidad de grupos que desea crear";	
	leer dato;	
	
FinAlgoritmo

SubProceso BusBin(arreglo Por Referencia,length,dato)
	
	
	
FinSubProceso
