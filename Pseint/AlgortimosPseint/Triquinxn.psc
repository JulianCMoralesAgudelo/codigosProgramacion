Algoritmo TriquiNxN
	
	// Definicion y declaracion de variables.
	Definir matriz Como Entero;
	Definir i, j,n Como Entero;	
	Escribir "Ingrese la cantidad de la matriz";
	Leer n;
	Dimension matriz[n,n];
	
	// Llenar la matriz
	Para i <- 0 Hasta n-1 Hacer		
		Para j <- 0 Hasta n-1 Hacer
			matriz[i, j] <- i + j;
		FinPara
	FinPara
	
	// Presentacion de datos.
	Para i <- 0 Hasta n-1 Con Paso 1 Hacer
		Para j <- 0 Hasta n-1 Hacer
			Si (i=j) Entonces
				Escribir "X" "|", Sin Saltar;;
			SiNo
				Escribir " " "|", Sin Saltar;;
			Fin Si			
		FinPara
		Escribir "";
	FinPara
	
FinAlgoritmo
	