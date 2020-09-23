SubProceso mayorDe(n,m)
	Definir i Como Entero;
	Si (n>m) Entonces
		Escribir "El numero n = ",n,", es mayor que m = ",m;
	FinSi
	Si (n<m) Entonces
		Escribir "El numero n = ",n,", es menor que m = ",m;
	FinSi
	Si (n==m) Entonces
		Escribir "El numero n = ",n,", es igual que m = ",m;
	FinSi
FinSubProceso


Algoritmo Funciones_2
	Definir n,m Como Entero;
	Escribir "Por favor ingrese un numero";
	leer n;	
	Escribir "Por favor ingrese un numero";
	leer m;	
	mayorDe(n,m);
	
FinAlgoritmo
