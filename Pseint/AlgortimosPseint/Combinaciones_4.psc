Algoritmo Combinaciones_4	
	// Declaracion de varibales
	Definir n,r,fn,fr,fnr,tc,i Como Entero;
	Definir nombre Como Caracter;	
	// Lectura de datos
	Escribir "Por favor ingrese la variables n, cantidad de elementos:";
	Leer n;
	Escribir "Por favor ingrese la variables r, parejas de combinaciones:";
	Leer r;
	Escribir "Escriba el nombre del algoritmo:";
	Leer nombre;
	// Manipulacion de datos
	fn=1;	
	Para i=1 Hasta n Con Paso 1 Hacer
		fn=fn*i;
	FinPara
	fr=1;
	Para i=1 Hasta r Con Paso 1 Hacer
		fr=fr*i;
	FinPara
	fnr=1;
	Para i=1 Hasta n-r Con Paso 1 Hacer
		fnr=fnr*i;
	FinPara
	tc=fn/(fr*fnr);	
	// Presentacion de datos
	Escribir "UNIVERSIDAD DE LA VIDA";
	Escribir "FACULTAD DE INGENIERIA";
	Escribir "DEPARTAMENTO DE INGENIERIA TELEMATICA";
	Escribir "PROGRAMA JUL1@N MOR@L3S";
	Escribir "ALGORITMO ",nombre;	
	Escribir "n = ",n,", r = ",r,", numero de combinaciones = ",tc;	
FinAlgoritmo
