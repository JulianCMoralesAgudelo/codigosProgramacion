Algoritmo ArrayOrdenInverso
	// Definicion y declaracion de variables.
	Definir i,cantidad,entrada,datos,disminuye Como Entero;	
	i = 0;
	// Lectura de datos.
	Escribir "Por favor ingrese la cantidad de numeros";
	Leer entrada;
	cantidad=entrada;
	Dimension datos[entrada];
	// Manupulacion de datos.
	Para i=0 hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero ",(i+1);
		leer datos[i];
	FinPara
	// Presentacion de datos.
	Para i=0 hasta cantidad-1 Con Paso 1 Hacer
		disminuye= cantidad-1-i;
		Escribir  datos[disminuye];
	FinPara
FinAlgoritmo
