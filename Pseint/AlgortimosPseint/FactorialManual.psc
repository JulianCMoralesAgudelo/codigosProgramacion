Algoritmo FactorialManual
	
	// Definicion de datos e inicializacion de variables.
	Definir a,b,c,d,e,f,g,h,i Como Entero;
	// Lectura de datos.
	Repetir
		Escribir "Ingrese el numero a:";
		leer a;
		Si a<=1 Entonces
			Escribir "El numero debe ser mayor a 1";		
		FinSi
	Hasta Que a>1;
	
	Repetir
		Escribir "Ingrese el numero b:";
		leer b;
		Si b<=1 Entonces
			Escribir "El numero debe ser mayor a 1";		
		FinSi
	Hasta Que b>1;
	
	Repetir
		Escribir "Ingrese el numero c:";
		leer c;
		Si c<=1 Entonces
			Escribir "El numero debe ser mayor a 1";		
		FinSi
	Hasta Que c>1;
	
	// Manipulacion de datos.
	
	f=1;
	Para i=1 Hasta a Con Paso 1 Hacer
		f=f*i;
	FinPara
	
	g=1;
	Para i=1 Hasta b Con Paso 1 Hacer
		g=g*i;
	FinPara
	
	h=1;
	Para i=1 Hasta c Con Paso 1 Hacer
		h=h*i;
	FinPara	
	d=f*g/h;
	e=d*a;
	// Presentacion de datos.
	Escribir "Factorial de = ",a,", = ",f;
	Escribir "Factorial de = ",b,", = ",g;
	Escribir "Factorial de = ",c,", = ",h;
	Escribir "Numero d = ",d,", y el numero e= ",e;
	
FinAlgoritmo
