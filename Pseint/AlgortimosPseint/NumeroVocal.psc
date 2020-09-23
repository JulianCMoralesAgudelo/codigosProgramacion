Algoritmo NumeroVocal
	
	// Definicion de datos e inicializacion de variables.
	Definir numero Como Entero;	
	// Lectura de datos.	
	Repetir
		Escribir "Por favor ingrese un numero de uno a cinco:";
		Leer numero;
	Hasta Que (numero>0 Y numero<=5);	
	// Manipulacion de datos.
	Segun numero Hacer
		1:
			Escribir numero," -> A";
		2:
			Escribir numero," -> B";
		3:
			Escribir numero," -> C";
		4:
			Escribir numero," -> D";
		5:
			Escribir numero," ->E";
		De Otro Modo:
			Escribir "Valor invalido";
	FinSegun	
	// Presentacion de datos.	
FinAlgoritmo
