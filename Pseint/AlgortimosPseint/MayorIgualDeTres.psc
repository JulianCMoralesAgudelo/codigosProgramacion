Algoritmo MayorIgualDeTres
	// Definicion de datos e inicializacion de variables.
	Definir  a,b,c Como Entero;
	// Lectura de datos.
	Escribir "Por favor ingrese el numero a:";
	Leer a;
	Escribir "Por favor ingrese el numero b:";
	Leer b;
	Escribir "Por favor ingrese el numero b:";
	Leer c;
	// Manipulacion de datos y Presentacion de datos.
	Si (a>b&a>c&b>c) Entonces
		Escribir "Los numeros de ordenados son :",a,",",b,",",c;
	FinSi
	Si (a>b&a>c&c>b) Entonces
		Escribir "Los numeros de ordenados son :",a,",",c,",",b;
	FinSi
	Si (b>a&b>c&a>c) Entonces
		Escribir "Los numeros de ordenados son :",b,",",a,",",c;
	FinSi
	Si (b>a&b>c&c>a) Entonces
		Escribir "Los numeros de ordenados son :",b,",",c,",",a;
	FinSi
	Si (c>a&c>b&a>b) Entonces
		Escribir "Los numeros de ordenados son :",c,",",a,",",b;
	FinSi
	Si (c>a&c>b&b>a) Entonces
		Escribir "Los numeros de ordenados son :",c,",",b,",",a;			
	FinSi
	
	Si (a=b|a=c|b=c) Entonces
		Escribir "Los numeros son iguales o almenos dos de ellos :",a,",",b,",",c;
	FinSi
	
FinAlgoritmo
