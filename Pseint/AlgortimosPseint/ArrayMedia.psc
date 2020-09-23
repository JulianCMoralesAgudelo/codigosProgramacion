Algoritmo ArrayMedia
	// Definicion y declaracion de variables.
	Definir i,cantidad,entrada,datos Como Entero;	
	Definir media,total Como Real;
	i = 0;	
	media=0;
	// Lectura de datos.
	Escribir "Por favor ingrese la cantidad de numeros";
	Leer entrada;
	cantidad=entrada;
	Dimension datos[entrada];
	// Manupulacion de datos.
	Para i=0 hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero ",(i+1);
		leer datos[i];
		media=media+datos[i];
	FinPara
	media=media/cantidad;
	// Presentacion de datos.
	Escribir "El promedio de los datos ingresados es ", media;
FinAlgoritmo
