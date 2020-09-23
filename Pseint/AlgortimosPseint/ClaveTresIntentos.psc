Algoritmo ClaveTresIntentos
	// Definicion y declaracion de variables.
	Definir dato,intentos Como Entero;
	intentos=0;
	// Lectura de datos Manupulacion de datos.
	Repetir 
		intentos=intentos+1;
		Escribir "Ingresa tu clave:";
		Leer dato;	
	Hasta Que (dato == 321) O (dato == 567) O (intentos == 3);
	// Presentacion de datos.
	SI ((intentos == 3) O (dato == 352) O (dato == 569)) Entonces
		ESCRIBIR("Demasiados intentos");
	SINO
		ESCRIBIR("Clave correcta");
	FIN SI 

FinAlgoritmo
