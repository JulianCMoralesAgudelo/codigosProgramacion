Algoritmo ForDiezNumeros
	
	// Definicion de datos e inicializacion de variables.
	Definir a,p,n,c,i,cp,cn,cc Como Entero;
	a=0;p=0;n=0;c=0;i=0;
	cp=0;cn=0;cc=0;
	// Lectura de datos y Manipulacion de datos.
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Escribir "Por favor ingresa un numero :";
		Leer a;
		Si (a>0) Entonces
			p=p+a;		
			cp=cp+1;
		FinSi
		Si (a=0) Entonces
			c=c+a;
			cc=cc+1;
		FinSi
		Si (a<0) Entonces
			n=n+a;
			cn=cn+1;
		FinSi
	FinPara	
	// Presentacion de datos.
	Escribir "La cantidad de numeros positivos ingresados fueron ", cp;
	Escribir "La media de los numeros positivos ingresados es ", (p/cp);
	Escribir "La cantidad de ceros ingresados fueron ", cc, " y su media es cero.";
	Escribir "La cantidad de numeros negativos ingresados fueron ", cn;
	Escribir "La media de los numeros negativos ingresados es ", ((n/cn)*(-1));
	
	
FinAlgoritmo
