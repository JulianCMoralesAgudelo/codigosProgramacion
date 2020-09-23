Algoritmo ArrayImparIndex
	// Definicion de variables
	Definir arreglo,dato,i,pares,impares Como Entero;	
	Escribir "¿Ingrese la cantidad de componentes del arreglo o longitud de estas?";
	Leer dato;
	Dimension arreglo[dato];
	Dimension pares[dato];
	Dimension impares[dato];
	
	
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer	
		pares[i]=0;
		impares[i]=0;
	FinPara
	
	// Lectura de datos
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir "Ingrese el dato numero ",i;
		Leer arreglo[i];
	FinPara
	
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer		
		Si arreglo[i]%2==0 Entonces
			pares[i]=arreglo[i];			
		SiNo
			impares[i]=arreglo[i];
		FinSi
	FinPara
	
	// Presentacion de datos.	
	Escribir "Los numeros pares son :";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer		
		Si arreglo[i]=0 o pares[i]>0  Entonces
			Escribir pares[i];		
		FinSi		
	FinPara
	
	Escribir "Los numeros impares son :";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer		
		Si impares[i]>0 Entonces
			Escribir impares[i];		
		FinSi		
	FinPara
	
FinAlgoritmo
