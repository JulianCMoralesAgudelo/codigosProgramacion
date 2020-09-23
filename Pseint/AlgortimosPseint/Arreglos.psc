Proceso menorArreglo
	//Definicion de variables
	Definir a,i,may,men,posmin,posmax Como Entero;
	Dimension a[6];	
	
	//Inicializacion de variables
	a[0]=100;
	a[1]=10000;
	a[2]=222;
	a[3]=15;
	a[4]=45;
	a[5]=5;	
	may=a[0];
	men=a[0];
	posmin=0;
	posmax=0;
	
	//Manipulacion de datos
	//Recorro eel arreglo.
	Para i=0 Hasta (6-1) Hacer
		//Escribir a[i];
		Si (may<a[i])
			may=a[i];
			posmax=0;
		FinSi
		Si (men>a[i])
			men=a[i];
			posmin=i;
		FinSi
	FinPara
	
	//Presentacion de datos
	Escribir "El numero menor es: ",men," esta en el indice # ",posmin;
	Escribir "El numero mayor es: ",may," esta en el indice # ",posmax;
		
FinProceso
