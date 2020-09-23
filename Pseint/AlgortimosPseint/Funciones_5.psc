SubProceso hastaN(a)
	
	Definir i Como Entero;
	Para i <- 0 Hasta a Con Paso 1 Hacer
		Si i % 3==0 Entonces
			Escribir i ," ", Sin Saltar;
		FinSi
		
	Fin Para		
FinSubProceso


Algoritmo Funciones_5
	Definir a Como Entero;
	Repetir
		Escribir "Introduce un numero";
		Leer a;		
	Hasta Que (a>0);	
	hastaN(a);	
FinAlgoritmo
