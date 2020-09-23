Algoritmo MaxMin
	Definir arreglo, i, max, min Como Entero;
	Dimension arreglo[6];
	arreglo[0]=1;
	arreglo[1]=3;
	arreglo[2]=0;
	arreglo[3]=-1;
	arreglo[4]=12;
	arreglo[5]=3;
	
	max=arreglo[0];
	min=max;
	
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Si(arreglo[i]>max) Entonces
			max=arreglo[i];
		FinSi		
		Si(arreglo[i]<min) Entonces
			min=arreglo[i];
		FinSi
	FinPara
	Escribir max;
	Escribir min;	
	
FinAlgoritmo
