// Escribir un algoritmo que, dada una lista de números ordenados un número N,
// te devuelva VERDADERO si alguna combinación de dos números cualesquiera suman N,
// y devuelva FALSO si ninguna combinación de dos números sumados da como resultado el 
// número N.
// Por Ejemplo:
// En este caso, la lista es [1,2,3,4] y el segundo número (N) es 10:
// [1 ,2, 3, 4] y 10. Quieres saber si alguna combinación de esos cuatro números de
// la lista suman 10.
// en Este caso es FALSO, porque ninguna combinación de dos números suma diez.

Algoritmo ParEnListaSumaIgualNumero
	// Definicion e inicializacion de variables
	Definir arreglo, grupos, dato, i, j, length, suma, resultado Como Entero;
	suma = 0;
	resultado = 0;
	// Lectura de datos
	Escribir "Ingrese la cantidad de datos de la lista";
	Leer dato;	
	// La longitud de la lista esta definida por el usuario.
	Escribir "Ingrese una lista de numeros ";
	Dimension arreglo[dato];
	length=dato;
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer		
		Escribir "Ingrese un numero";
		Leer arreglo[i];
	FinPara	
	
	OrdenaArreglo(arreglo,dato);	
	
	// Se ingresa el numero a buscar.
	Escribir "Ingrese numero que desea encontrar como suma de las combinaciones";	
	leer dato;	
	
	Para i<-0 Hasta length-1 Con Paso 1 Hacer		
		Para j<-0 Hasta length-1 Con Paso 1 Hacer			
			suma = arreglo[i] + arreglo[j];
			Si suma == dato Entonces				
				Escribir arreglo[i]," + ",arreglo[j]," = ",suma;
				resultado = resultado + 1;
			FinSi	
		FinPara		
	FinPara
	
	Si resultado > 0  Entonces
			Escribir  Verdadero;
		SiNo
			Escribir  Falso;
	FinSi
FinAlgoritmo

SubProceso OrdenaArreglo(arreglo Por Referencia,dato)
	Definir aux, i, j Como Entero;
	
	Para i<-0 Hasta dato-2 Con Paso 1 Hacer
		Para j<-i+1 Hasta dato-1 Con Paso 1 Hacer	
			Si arreglo[i] > arreglo[j] Entonces
					aux = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = aux;
			FinSi			
		FinPara
	FinPara		
	Escribir "Lista ordenada ";
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir arreglo[i];
	FinPara	
	
FinSubProceso






