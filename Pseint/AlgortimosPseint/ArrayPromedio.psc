Algoritmo ArrayPromedio
	//Definicion de variables
	Definir arreglo,i,numero,entrada,cero,positivos,negativos,c,n,p,mc,mn,mp Como Real;
	Escribir "El la cantidad de numeros a promediar";
	Leer  entrada;	
	//Inicializacion de variables
	i=0;cero=0;positivos=0;negativos=0;mc=0;mn=0;mp=0;c=0;n=0;p=0;
	numero=entrada;
	Dimension arreglo[numero];		
	Escribir "Cantidad a recorrer es = ",numero;
	//Recorrido eel arreglo.	
	Para i<-0 Hasta numero-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero ",(i+1);  
		leer arreglo[i];
	Fin Para
	
	Para i<-0 Hasta numero-1 Con Paso 1 Hacer
		Si  arreglo[i]<0 Entonces
			negativos=negativos+arreglo[i];			
			n=n+1;
		Fin Si
		Si arreglo[i]=0 Entonces
			cero=cero+arreglo[i];
			c=c+1;
		Fin Si
		Si arreglo[i]>0 Entonces
			positivos=positivos+arreglo[i];
			p=p+1;
		Fin Si
		
	Fin Para
	//Presentacion de datos
	Si n>0 Entonces
		mn=negativos/n;
		Si mn<0 Entonces
			mn=mn*(-1);
		FinSi
	Fin Si
	Si c>0 Entonces
		mc=cero/c;	
	Fin Si
	Si p>0 Entonces
		mp=positivos/p;	
	Fin Si
	
	Escribir "La cantidad de numeros menores a cero son : ",n ," y su media es ",mn;
	Escribir "La cantidad de numeros iguales a cero son : ",c ," y su media es ",mc;
	Escribir "La cantidad de numeros mayores a cero son : ",p ," y su media es ",mp;

FinAlgoritmo

