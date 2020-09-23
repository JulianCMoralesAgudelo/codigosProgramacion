Algoritmo Arrays_Censo_1
	Definir mpio,np,acmed,acbel Como Entero;
	Definir dir, res Como Caracter;
	Definir ok Como Logico;
	acmed = 0;
	acbel = 0;
	ok = Falso;
	
	Mientras !ok Hacer
		Escribir "Ingrese municipio";
		Leer mpio;
		Escribir "Ingrese direccion";
		Leer dir;
		Escribir "Ingrese numero de personas";
		Leer np;		
		Si mpio == 1 Entonces
			acmed = acmed + np;
		SiNo
			acbel = acbel + np;
		Fin Si
		
		Escribir "Desea terminar";
		leer res;
		Si res = "si" Entonces
			ok = Verdadero;
		SiNo
			ok = Falso;
		Fin Si		
	Fin Mientras
	
	Si mpio=1 Entonces
		Escribir "Municipio : Medellin, Direccion : ",dir, ", Numero de personas : ", np;
	SiNo
		Escribir "Municipio : Bello, Direccion : ",dir, ", Numero de personas : ", np;
	Fin Si		
	
FinAlgoritmo
