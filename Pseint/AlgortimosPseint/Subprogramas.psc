Funcion k <- Misterio ( a,b Por Referencia )
	Definir k Como Entero;
	Escribir "Se recibe el numero a= ",a," por valor.";
	Escribir "Se recibe el numero b= ",b," por referencia.";
	k=a*20;
	Escribir "Se multiplica a= ",a," por 20 y se almacena en k =",k;
	Escribir "Se multiplica b= ",b," por 10";
	b=b*10;
	Escribir "Se almacena en a= ",a;
	Escribir "Se retorna k= ",k;
FinFuncion


Algoritmo Subprogramas
	
	// Definicion de datos e inicializacion de variables.
	Definir a,b Como Entero;
	// Lectura de datos.
	Escribir "Ingrese el numero a:";
	Leer a;
	Escribir "Este pasa por valor:";
	Escribir "Ingrese el numero b:";
	Leer b;
	Escribir "Este pasa por referencia:";
	// Manipulacion de datos.
	Escribir "";
	b=misterio(a,b);
	
	// Presentacion de datos.
	Escribir "El valor de a= ",a;
	Escribir "El valor de b= ",b;
	
FinAlgoritmo
