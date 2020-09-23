Algoritmo OcurrenciasArray
	
	// Recorrer el vector y econtrar las ocurrencias y su posicion
	Definir array, d, cantidad, i, res Como Entero;
	Escribir "Ingrese la cantidad del arreglo";
	Leer cantidad;
	Dimension array[cantidad];
	
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer		
		array[i] = azar(99);
	Fin Para	
	
	ordenaArray(array,cantidad);
	print(cantidad, array);
	
	Escribir "Ingrese el dato a buscar";
	leer d;	
	buscarLineal(array,cantidad,d);	
	print(cantidad, array);
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


SubProceso print(cantidad, array Por Referencia)
	Definir i como Entero;
	Escribir "Lista de datos";
	Escribir "[" Sin Saltar;;
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer		
		Escribir array[i] Sin Saltar;
		Si i < cantidad-1 Entonces
			Escribir  " ," Sin Saltar;
		SiNo
			Escribir "]" Sin Saltar;
		Fin Si
	Fin Para
	Escribir "";	
	
FinSubProceso

SubProceso buscarLineal(array Por Referencia,cantidad Por Referencia,dato)	
	
	Definir i,contador Como Entero;
	Definir encontrado Como logico;	
	
	encontrado = Falso;	
	contador = 0;
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		
		Si dato == array[i] Entonces			
			borrarDatoVal(array,cantidad,i,dato);
		Fin Si
		
	FinPara		
	
	
FinSubProceso

SubProceso borrarDatoVal(array Por Referencia,cantidad Por Referencia , pos,dato)
	
	Definir j Como Entero;	
	
	Si pos = cantidad + 1 Entonces
		Escribir "Dato no exixte";
	SiNo
		j = pos + 1;
		Mientras j <= cantidad - 1 Hacer
			array[j-1]=array[j];
			j = j + 1;
		Fin Mientras		
	Fin Si	
	cantidad = cantidad - 1;
	buscarLineal(array,cantidad,dato);
FinSubProceso

