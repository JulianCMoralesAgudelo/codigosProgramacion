Algoritmo Triqui
	// Definicion y declaracion de variables.
	Definir tablero Como Caracter;
	Dimension tablero[5,5];
	Definir i, j Como Entero;
	
	// Inicializa el tablero
	tablero[0,0] <- "X";
	tablero[0,1] <- " ";
	tablero[0,2] <- " ";
	tablero[0,3] <- " ";
	tablero[0,4] <- " ";
	tablero[1,0] <- " ";
	tablero[1,1] <- "X";
	tablero[1,2] <- " ";
	tablero[1,3] <- " ";
	tablero[1,4] <- " ";
	tablero[2,0] <- " ";
	tablero[2,1] <- " ";
	tablero[2,2] <- "X";
	tablero[2,3] <- " ";
	tablero[2,4] <- " ";
	tablero[3,0] <- " ";
	tablero[3,1] <- " ";
	tablero[3,2] <- " ";
	tablero[3,3] <- "X";
	tablero[3,4] <- " ";
	tablero[4,0] <- " ";
	tablero[4,1] <- " ";
	tablero[4,2] <- " ";
	tablero[4,3] <- " ";
	tablero[4,4] <- "X";
	
	// Presentacion de datos.
	
	// Pinta el tablero. Las filas se muestran en orden inverso
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Escribir "|", Sin Saltar;
		Para j <- 0 Hasta 4 Con Paso 1 Hacer
			Escribir tablero[i,j], "|", Sin Saltar;
		FinPara
		Escribir "";
	FinPara
	
FinAlgoritmo
