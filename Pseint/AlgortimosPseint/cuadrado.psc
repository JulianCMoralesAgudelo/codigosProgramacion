Algoritmo cuadrado
	Definir opcion Como Caracter;
	Definir num Como Entero;
	Repetir
		Escribir "Introduce un número";
		Leer num;
		Escribir "El cuadrado de ", num, " es ", num ^ 2;
		Escribir "¿Desea continuar?";
		Leer opcion;
	Hasta Que opcion = "n" O opcion = "N";
FinAlgoritmo