Algoritmo ArrayBusquedaBinaria
	
	Definir array, num, cantidad, i, res Como Entero;
	Escribir "Ingrese la cantidad del arreglo";
	Leer cantidad;
	Dimension array[cantidad];	
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer		
		array[i] = azar(99);
	Fin Para
	
	print(cantidad, array);
	ordenaArray(array,cantidad);
	print(cantidad, array);
	
	Escribir "Ingrese el dato a buscar";
	leer num;	
	res = buscarBin(array, cantidad, num);
	//Escribir "El numero buscado esta en la posicion: ",res;
	print(cantidad, array);
	
FinAlgoritmo


SubProceso print(cantidad, array Por Referencia)
	Definir i como Entero;
	Escribir "Lista de datos";
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer		
		Escribir array[i] Sin Saltar;
		Si i < cantidad-1 Entonces
			Escribir  "|" Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";
	
	Escribir "Posicion datos";
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer		
		Escribir i," " Sin Saltar;
		Si i < cantidad-1 Entonces
			Escribir  "|" Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";
	
FinSubProceso

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
