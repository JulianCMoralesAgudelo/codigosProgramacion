Proceso Funciones
	
FinProceso

SubProceso resultado <- Factorial(num)
	Definir resultado Como Entero;
	Si(num == 0) Entonces
		resultado = 1;
	SiNo
		resultado = num * Factorial( num-1);
	FinSi	
FinSubProceso

SubProceso resultado <- CantidadCombinaciones(length,num)
	Definir resultado, df, m, n Como Entero;
	// La formula de las combinaciones sin repeticion es
	// m donde m es la cantidad de numeros en el conjunto
	// n es el numero de combinaciones a realizar con los numeros del conjunto m
	// (m!*(m-n)!)/n!	
	m  = length;
	n  = num;
	df = m-n;
	m = Factorial(m);
	n = Factorial(n);
	df= Factorial(df);	
	resultado = m/(n*df);	
FinSubProceso

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


SubProceso borrarDatoVal(array , m , pos)
	
	Definir j Como Entero;
	
	Escribir "Por valor, " Sin Saltar;
	
	Si pos = m + 1 Entonces
		Escribir "Dato no exixte";
	SiNo
		j = pos + 1;
		Mientras j <= m-1 Hacer
			array[j-1]=array[j];
			j = j + 1;
		Fin Mientras
		
	Fin Si	
	
FinSubProceso
