SubProceso swap(V Por Referencia,i,j)
	Definir aux Como Entero;		
	aux=V[i];
	V[i]=V[j];
	V[j]=aux;	
FinSubProceso

Algoritmo ArraySwap
	// Definicion y declaracion de datos.
	Definir arreglo,dato,i Como Entero;
	Escribir "Ingrese cuantos numeros va a contener el arreglo :";
	Leer dato;
	Dimension arreglo[dato];
	
	Escribir "La cantidad de numeros ingresados es ",dato;
	// lectura de datos.
	Para i<-1 Hasta dato Con Paso 1 Hacer
		Escribir "Ingrese un numero";
		leer arreglo[i];
	FinPara
	
	// Presentacion de datos.
	Escribir "Array original";
	Escribir "[ "  Sin Saltar;
	Para i<-1 Hasta dato Con Paso 1 Hacer		
		Escribir arreglo[i]," " Sin Saltar;
	FinPara
	Escribir "]" Sin Saltar;
	
	swap(arreglo,1,2);
	swap(arreglo,3,4);
	swap(arreglo,5,2);
	
	// Presentacion de datos.
	Escribir "";
	Escribir "Array modificado";
	Escribir "[ " Sin Saltar;
	Para i<-1 Hasta dato Con Paso 1 Hacer		
		Escribir arreglo[i]," " Sin Saltar;
	FinPara
	Escribir "]" Sin Saltar;
	Escribir "";
	
FinAlgoritmo
