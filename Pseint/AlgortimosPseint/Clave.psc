Algoritmo clave
	// Definicion y declaracion de variables.
	Definir dato,contador Como Entero;
	contador=0;
	// Lectura de datos Manupulacion de datos.
	Mientras (dato!=321 O dato!=567) Hacer
		Escribir "Por favor ingresa tu clave:";
		Leer dato;		
		Si (dato!=321 O dato!=567) Entonces
			Escribir "Intenta nuevamente";
		FinSi
		contador=contador+1;
	Fin Mientras
	// Presentacion de datos.
	Escribir "Entraste correctamente";
FinAlgoritmo
