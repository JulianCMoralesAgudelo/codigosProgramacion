Algoritmo Factorial
	
	// Deficion de datos e inicializacion de variables.
	Definir  n,i,f Como Entero;
	// Lectura de datos.
	Repetir
		Escribir "Ingrese el numero a evaluar";
		leer n;
		Si n<=1 Entonces
			Escribir "El numero debe ser mayor a 1";		
		FinSi
	Hasta Que n>1;
	
	// Manipulacion de datos.
	f=1;
	Para i=1 Hasta n Con Paso 1 Hacer
		f=f*i;
	FinPara	
	// Presentacion de datos.
	Escribir " El factorial del numero ",n," es = ",f;
	
FinAlgoritmo
