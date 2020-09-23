Algoritmo ArrayOrdenEntrada
	// Definicion y declaracion de variables.
	Definir i,cantidad,entrada,datos,contador Como Entero;		
	i = 0;	
	contador=0;
	Definir ascendente, descendente Como Logico;
	ascendente <- Falso;
	descendente <- Falso;
	// Lectura de datos.
	Escribir "Por favor ingrese la cantidad de numeros";
	Leer entrada;
	cantidad=entrada;
	Dimension datos[entrada];
	// Manupulacion de datos.
	Para i=0 hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero ",i;
		leer datos[i];		
	FinPara	
	Escribir "Los numeros introducidos son";
	Para i=0 hasta cantidad-1 Con Paso 1 Hacer	
		Escribir datos[i], " ", Sin Saltar;
	FinPara
	
	Para i=0 hasta cantidad-1 Con Paso 1 Hacer	
		Si (datos[i]<datos[i+1]) Entonces			
			contador = 1;
		FinSi
		Si (datos[i]<datos[i+1]) Entonces			
			contador = 2;
		FinSi		
	FinPara
	
	Segun contador Hacer
		0:
			Escribir "Desorden ";
		1:
			Escribir "Orden Ascedente ";
		2:
			Escribir "Orden Descedente ";
		De Otro Modo:
			Escribir "Orden Indetermiado ";
	FinSegun	
	
FinAlgoritmo
