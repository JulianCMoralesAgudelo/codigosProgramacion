SubProceso buscarNumeroenArray(b Por Referencia,long)	
	Definir dato,i como Entero;
	Definir ok Como Logico;
	ok = Falso;	
	Escribir "Introduce un numero a buscar en el arreglo";
	leer dato;
	Para i<-0 Hasta long-1 Con Paso 1 Hacer			
		Si dato==b[i] Entonces
			ok = Verdadero;
		Fin Si
	Fin Para			
	
	Si ok Entonces
		Escribir "El numero ",dato," Esta dentro del arreglo";
	SiNo
		Escribir "El numero ",dato," No esta dentro del arreglo";
	FinSi
	
	Para i<-0 Hasta long-1 Con Paso 1 Hacer			
		Escribir b[i] , " ", Sin Saltar;		
	Fin Para
	
FinSubProceso


Algoritmo Funciones_8	
	Definir a,b,i,long Como Entero;
	Dimension b[20];
	Escribir "Ingrese la longitud del arreglo a crear";
	leer long;
	Para i<-0 Hasta long-1 Con Paso 1 Hacer
		b[i]=Azar(long);
	Fin Para
	buscarNumeroenArray(b,long);
FinAlgoritmo
