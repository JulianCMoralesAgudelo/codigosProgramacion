Algoritmo OrdenarArreglos
	
	Definir arreglo, i, j, NumIn, minimo, aux como entero;
	
	Escribir "Ingrese la cantidad de datos que va a igresar";	
    Leer NumIn;	
    dimension arreglo[NumIn];	
    
	Escribir "Este es el vector original:";    
	// Inicializar el array con datos aleatorios entre 0 y 100.
	Para i <- 0 hasta NumIn-1 con paso 1 Hacer
        arreglo[i] <- azar(100);
        Escribir arreglo[i] ,"  ", Sin Saltar;
    FinPara
	
    Para i <- 0 hasta NumIn-1 con paso 1 Hacer		
        minimo <- i;		
        Para j<-i+1 Hasta NumIn-1 Con Paso 1 Hacer			
            Si arreglo[j] < arreglo[minimo] Entonces    //con < ordena ascendente, con > ordena descendente				
                minimo <- j;				
            FinSi
		FinPara       		
        aux <- arreglo[i];		
        arreglo[i] <- arreglo[minimo];		
        arreglo[minimo] <- aux;		
    FinPara
	Escribir "";	
    
	Escribir "Este es el vector ordenado:";	    		
    para i <- 0 hasta NumIn-1 con paso 1 Hacer		
        Escribir arreglo[i] ,"  ", Sin Saltar;		
    FinPara	
	Escribir "";
	
FinAlgoritmo



