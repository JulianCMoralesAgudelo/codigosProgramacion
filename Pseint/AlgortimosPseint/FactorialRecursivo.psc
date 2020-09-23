// Un algoritmo recursivo es aquel que posee una funcion que soluciona  
// el problema y este se llama varias veces hasta llegar a la solucion.

Subproceso resultado<-Factorial(num)
	Definir resultado Como Entero;
	Si (num <= 1) Entonces
		resultado <- 1;
	Sino 
		resultado <- num * Factorial(num-1);
	FinSi
	
	Escribir num , "*Factorial(", num-1 ,") = ",resultado; 	
	
FinSubProceso

Proceso FactorialRecursivo
	Escribir Factorial(7);
FinProceso
