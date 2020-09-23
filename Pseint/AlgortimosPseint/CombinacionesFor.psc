Algoritmo Combinaciones
	
	Definir  i, j, k, cont, num Como Entero;
	
	Dimension num[3];
	num[0] = 0;
	num[1] = 1;
	num[2] = 2;
	cont = 0;
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Para k<-0 Hasta 2 Con Paso 1 Hacer
				Si num[i] <> num[j] && num[i] <> num[k] && num[j] <> num[k] Entonces
					cont = cont +1;
					Escribir num[i],num[j],num[k];
				Fin Si
			Fin Para
		Fin Para
	Fin Para
	
FinAlgoritmo
