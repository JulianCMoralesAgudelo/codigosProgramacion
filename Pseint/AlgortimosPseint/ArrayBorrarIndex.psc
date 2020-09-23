SubProceso i <- buscarPosicion (v Por Referencia,m Por Referencia,d Por Valor)
	Definir i,k,indice Como Entero;
	Para i =0 hasta m-1 Con Paso 1 hacer
		Si v[i] = d Entonces
			indice=i;
			Para k =0 hasta m-1 Con Paso 1 hacer
				v[k-1]=v[k];
				k=k+1;
				m=m-1;
			FinPara
		FinSi
		i=i+1;
	FinPara	
FinSubProceso


SubProceso borrarPosicion (v Por Referencia,m Por Referencia,i Por Valor)
	Definir j Como Entero;
	j=i+1;
	Mientras j<= m Hacer
		v[j-1]=v[j];
		j=j+1;
	FinMientras	
	m=m-1;	
FinSubProceso
	
Algoritmo ArrayBorrarIndex
		// Definicion e inicializacion de variables
		Definir arreglo,dato,m,d,i Como Entero;
		// Lectura y definicion de informacion		
		Dimension arreglo[7];
		m=6;
		// m = numero de posiciones que usa el vector
		// i = posicion donde insertar.
		// d = el dato a insertar.
		arreglo[0]=3;
		arreglo[1]=5;
		arreglo[2]=7;
		arreglo[3]=11;
		arreglo[4]=25;
		arreglo[5]=36;
		arreglo[6]=48;
		
		// Presentacion de datos
		Escribir "Arreglo inicial";
		Para i<-0 Hasta 6 Con Paso 1 Hacer
			Escribir arreglo[i];
		FinPara	
		
		Escribir "Ingrese el dato a borrar ";	
		leer d;		
		dato=buscarPosicion(arreglo,m,d);
		Escribir "La posicion donde esta el dato a borrar es la numero ",dato;
		//borrarPosicion(arreglo,m,dato);
		Escribir "Arreglo ordenado";
		Para i<-0 Hasta 6 Con Paso 1 Hacer
			Escribir arreglo[i];
		FinPara	
		
FinAlgoritmo
