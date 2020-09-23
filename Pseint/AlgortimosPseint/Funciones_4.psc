SubProceso rango(a Por Valor,b Por Valor)
	Definir c,d Como Entero;
	c=a;
	d=b;
	Escribir "Entre";
	Si (c > d) Entonces
		Escribir "a > b";
		Para c=a Hasta d Con Paso 1 Hacer
			Escribir c;
		Fin Para	
	Fin Si	
	
	Si (d > c) Entonces
		Para d=b Hasta c Con Paso -1 Hacer
			Escribir d;
		Fin Para
	Fin Si
	Escribir "Sali";
FinSubProceso

Algoritmo Funciones_4
	
	Definir a,b Como Entero;	
	a=5;
	b=3;
	rango(a,b);	
FinAlgoritmo
