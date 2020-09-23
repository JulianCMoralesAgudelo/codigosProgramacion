Algoritmo tableroCuatroxCuatro
	// Definicion y declaracion de variables.
	Definir tablero Como Entero;
	Dimension tablero[4,4];
	Definir i, j Como Entero;
	
	// Inicializa el tablero
	// Inicializa la tabla
	Para i <- 0 Hasta 3 Hacer		
		Para j <- 0 Hasta 3 Hacer
			tablero[i, j] <- i + j;
		FinPara
	FinPara
	
	// Pinta el tablero. Las filas se muestran en orden inverso	
	Para i <- 0 Hasta 3 Con Paso 1 Hacer
		Para j <- 0 Hasta 3 Con Paso 1 Hacer
			Escribir tablero[i,j]," ", Sin Saltar;
		FinPara
		Escribir "";
	FinPara
	
	
	
FinAlgoritmo
