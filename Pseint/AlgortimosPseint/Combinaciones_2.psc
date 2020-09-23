Subproceso resultado<-Factorial(num)
	Definir resultado Como Entero;
	Si (num <= 1) Entonces
		resultado <- 1;
	Sino 
		resultado <- num * Factorial(num-1);
	FinSi	
FinSubProceso


Algoritmo Combinaciones_2
	
	// Deficion de datos e inicializacion de variables.
	Definir n,r,fn,fr,fnr,tc,i Como Entero;
	// Lectura de datos.
	Escribir "Por favor ingrese la variables n, cantidad de elementos";
	Leer n;
	Escribir "Por favor ingrese la variables r, parejas de combinaciones";
	Leer r;
	// Manipulacion de datos.
	fn=Factorial(n);
	fr=Factorial(r);
	fnr=Factorial(n-r);
	tc=fn/fr/fnr;
	// Presentacion de datos.
	Escribir "n = ",n,", r = ",r,", numero de combinaciones = ",tc;
	
FinAlgoritmo
