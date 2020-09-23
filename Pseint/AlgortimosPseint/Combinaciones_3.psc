Subproceso resultado<-Factorial(num)
	Definir resultado Como Entero;
	Si (num <= 1) Entonces
		resultado <- 1;
	Sino 
		resultado <- num * Factorial(num-1);
	FinSi	
FinSubProceso


Subproceso titulos(nombre)
	Escribir "UNIVERSIDAD DE LA VIDA";
	Escribir "FACULTAD DE INGENIERIA";
	Escribir "DEPARTAMENTO DE INGENIERIA TELEMATICA";
	Escribir "PROGRAMA JUL1@N MOR@L3S";
	Escribir "ALGORITMO ",nombre;
FinSubProceso


Algoritmo Combinaciones_3
	
	// Definicion de datos e inicializacion de variables.
	Definir n,r,fn,fr,fnr,tc,i Como Entero;
	// Lectura de datos.
	Escribir "Por favor ingrese la variables n, cantidad de elementos:";
	Leer n;
	Escribir "Por favor ingrese la variables r, parejas de combinaciones:";
	Leer r;
	// Manipulacion de datos.
	titulos("combiaciones");
	fn=Factorial(n);
	fr=Factorial(r);
	fnr=Factorial(n-r);
	tc=fn/fr/fnr;
	// Presentacion de datos.
	Escribir "n = ",n,", r = ",r,", total combinaciones = ",tc;
	
FinAlgoritmo
