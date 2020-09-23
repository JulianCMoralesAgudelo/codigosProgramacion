Algoritmo Arrays_OrdenamientoPorSeleccion	
	Definir array , d, dato, i, m, n Como Entero;
	Dimension array[16];
	array[0] = 3;
	array[1] = 5;
	array[2] = 7;
	array[3] = 9;
	array[4] = 15;
	array[5] = 21;
	array[6] = 28;
	array[7] = 33;
	array[8] = 39;
	array[9] = 42;
	array[10] = 51;
	array[11] = 67;
	array[12] = 69;
	array[13] = 73;
	array[14] = 84;	
	
	m = 15;	
	n =10;	
	dato = 0;
	
	ordenaArray(array,m);
	print(m,array);
	
	Escribir "Ingrese dato a buscar";
	leer d;
	dato = buscarBin(array, m,d);	
	
	print(m,array);
	
FinAlgoritmo

SubProceso ordenaArray(array Por Referencia,cantidad)
	
	Definir arreglo, i, j, minimo, aux como entero;
	
	Para i <- 0 hasta cantidad-1 con paso 1 Hacer		
        minimo <- i;		
        Para j<-i+1 Hasta cantidad-1 Con Paso 1 Hacer			
            Si array[j] < array[minimo] Entonces    //con < ordena ascendente, con > ordena descendente				
                minimo <- j;				
            FinSi
		FinPara       		
        aux <- array[i];		
        array[i] <- array[minimo];		
        array[minimo] <- aux;		
    FinPara
	Escribir "";
FinSubProceso

SubProceso dato <- buscarBin(array, cantidad, num)
	
	// array = vector a trabajar
	//cantidad = numero de posiciones que ocupa el vector
	// num = numero a buscar
	
	Definir dato, inf, sup, mitad Como Entero;	
	
	inf = 0;
	sup = cantidad - 1;
	
	Repetir		
		mitad = trunc((inf+sup)/2);
		Si array[mitad] < num  Entonces
			inf <- mitad + 1;		
		Fin Si
		Si array[mitad] > num  Entonces
			sup <- mitad - 1;		
		Fin Si		
	Hasta Que inf > sup | array[mitad] = num;
	
	Si array[mitad] = num Entonces
		Escribir "El numero: ",num," se encuentra en la posicion: ",mitad;
	SiNo
		Escribir "El numero: ",num," no se encuentra en la lista: ";
	Fin Si	
	
FinSubProceso

SubProceso print(m, array Por Referencia)
	Definir i como Entero;
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
	
FinSubProceso
