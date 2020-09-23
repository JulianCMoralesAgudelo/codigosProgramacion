SubProceso mayorDe(a,b,c)
	Definir i Como Entero;
	Si( a>b y b>c) Entonces
		Escribir "El numero mayor es a =",a;
	SiNo
		Si( b>a y b>c) Entonces
			Escribir "El numero mayor es b = ",b;
		SiNo	
			Si( c>a y c>b) Entonces
				Escribir "El numero mayor es c = ",c;
			SiNo
				Escribir "Los numeros son iguales ";
			FinSi
		FinSi
	FinSi
FinSubProceso


Algoritmo Funciones_3
	
	Definir a,b,c Como Entero;
	Escribir "Por favor ingrese un numero";
	leer a;	
	Escribir "Por favor ingrese un numero";
	leer b;	
	Escribir "Por favor ingrese un numero";
	leer c;	
	mayorDe(a,b,c);
	
FinAlgoritmo
