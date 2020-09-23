SubProceso mayor<-mayorDato(cantidad,V Por Referencia)
	Definir mayor,i,mayorLocal Como Entero;
	mayor=2;
	mayorLocal=1;
	
	Escribir "La cantidad de numeros del arreglo es ",cantidad;
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer		
		Si V[i] > V[mayor] Entonces
			Escribir " i = ",i," V[i] = [",V[i],"] > V[mayor] = [",V[mayor],"]";
			mayor=i;
			mayorLocal=V[i];
		FinSi
	FinPara
	Escribir "";
	
	Escribir "Los numeros son :";
	
	Para i<-0 Hasta cantidad-1 Con Paso 1 Hacer
		Escribir "Numero [",V[i],"]";
	FinPara
	
	Escribir "";
	Escribir "El numero mayor del arreglo es ",mayorLocal;
	
FinSubProceso

Algoritmo ArrayMayor
	// Definicion y declaracion de datos.
	Definir arreglo,dato,i Como Entero;
	Escribir "Ingrese cuantos numeros va a contener el arreglo :";
	Leer dato;
	Dimension arreglo[dato];
	
	Escribir "La cantidad de numeros ingresados es ",dato;
	// lectura de datos.
	Para i<-0 Hasta dato-1 Con Paso 1 Hacer
		Escribir "Ingrese un numero";
		leer arreglo[i];
	FinPara
	
	// Presentacion de datos.
	
	dato=mayorDato(dato,arreglo);
	
	Escribir "El numero mayor del arreglo esta en la posicion ",dato;
	
FinAlgoritmo
