Algoritmo Notas
	
	// Definicion de datos e inicializacion de variables.
	Definir nota Como Entero;	
	// Lectura de datos.	
	Repetir
		Escribir "Por favor ingreses la nota dsel alumno:";
		Leer nota;
	Hasta Que (nota>0 Y nota<=10);
	// Manipulacion de datos y Presentacion de datos.
	Si (nota<5) Entonces
		Escribir "Suspendido";
	FinSi
	Si (nota=5) Entonces
		Escribir "Suficiente con nota =",nota;
	FinSi
	Si (nota=6) Entonces
		Escribir "Bien con nota =",nota;
	FinSi
	Si (nota=7 O nota=8) Entonces
		Escribir "Notable con nota =",nota;
	FinSi
	Si (nota=9) Entonces
		Escribir "Sobresaliente con nota =",nota;
	FinSi
	Si (nota=10) Entonces
		Escribir "Matricula con nota =",nota;
	FinSi	
FinAlgoritmo
