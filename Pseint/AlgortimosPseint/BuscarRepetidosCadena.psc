Funcion veces <- buscaCaracteres(cadena,letra)
	Definir i,veces Como Entero;
	veces=0;
	Para i=0 hasta Longitud(cadena) Con Paso 1 Hacer
		Si (Subcadena(cadena,i,i)=letra) Entonces
			veces=veces+1;
		FinSi
	FinPara	
FinFuncion

Funcion separarLetras(cadena)
	Definir i,size,veces Como Entero;
	size=Longitud(cadena);
	Para i=0 hasta size-1 Con Paso 1 Hacer
		veces=buscaCaracteres(cadena,Subcadena(cadena,i,i));
		Escribir "La letra ", Subcadena(cadena,i,i), " esta ",veces," veces en la palabra ",cadena;
	FinPara
FinFuncion

Algoritmo BuscarRepetidosCadena
	// Definir  datos.
	Definir cadena Como Caracter;
	Escribir "Digite una palabra:";
	// Leer datos.
	//separarLetras("AAAA");
	//separarLetras("BBBBB");
	separarLetras("ABABABAB");
	//separarLetras("BABABA");
	//separarLetras("AAABBB");
	
FinAlgoritmo
