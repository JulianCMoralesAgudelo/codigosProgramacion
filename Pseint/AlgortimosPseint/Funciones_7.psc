SubProceso adivina()	
	Definir a,num Como Entero;		
	num = Azar(20);	
	//Escribir num;
	Repetir
		Escribir "Introduce un numero :";
		Leer a;
		Si a>num Entonces
			Escribir "El numero es menor que ",a;
		Fin Si
		Si num>a Entonces
			Escribir "El numero es mayor que ",a;
		Fin Si		
	Hasta Que (a=num);
	Escribir "Numero correcto, ganaste con el numero : ",a;
FinSubProceso

Algoritmo Funciones_7		
	adivina();	
FinAlgoritmo
