Proceso Condicionales_E3
	
	//Definicion y declaracion de variables	
	Definir dia,mes,anio,anioActual,diasmes Como entero;
	Definir dato,bis Como Logico;;
	dia=0;mes=0;anio=0;
	diasmes=0;
	
	dato=Falso;
	bis=Falso;
	
	Repetir		
		//Lectura de datos.
		Escribir "Ingrese el año actual:";
		Leer anioActual;
		Repetir
			Escribir "Ingrese el dia de nacimiento:";
			Leer dia;			
			Si (dia<1 O dia >31)  Entonces// un día fuera del rango 1..31 no tiene sentido
				Escribir "Dia incorrecto";
				dato=Falso;
			FinSi			
			Si (dia>=1 O dia <=31) Entonces
				Escribir "Dia correcto";
				dato=Verdadero;
			FinSi
		Hasta Que dato;
		
		Repetir
			Escribir "Ingrese el mes de nacimiento:";
			Leer mes;
			dato=Falso;
			Si (mes<1 Y mes >12) Entonces// un mes fuera del rango 1..12 no tiene sentido
				Escribir "Mes incorrecto";
				dato=Falso;
			FinSi			
			Si(mes>=1 Y mes <=12) Entonces
				Escribir "Mes correcto";
				dato=Verdadero;
			FinSi			
		Hasta Que dato;
		
		Repetir
			Escribir "Ingrese el año dia de nacimiento:";
			Leer anio;
			dato=Falso;
			Si (anio==0)  Entonces// el único año que no existe es el 0
				Escribir "Año incorrecto";
				dato=Falso;
			FinSi
			Si(anio>=1) Entonces
				Escribir "Año correcto";
				dato=Verdadero;
				//Un año es bisiesto en el calendario Gregoriano, si es divisible entre 4 y no divisible entre 100, y también si es divisible entre 400.
				Si ((anio % 4 == 0) Y ((anio % 100 <> 0) Y (anio % 400 == 0))) Entonces
					bis=Verdadero;
				FinSi
			FinSi
		Hasta Que dato;
				
	Hasta Que dato;
	
	// verificar meses Año bisciesto.
	Si (bis) Entonces
		Si (mes==2) Entonces
			diasmes=29;
		FinSi
		
		Si (mes==4 O mes==6 O mes==9 O mes==11) Entonces
			diasmes=30;
		FinSi
		
		Si (mes==1 O mes==3 O mes==5 O mes==7 O mes==8 O mes==10 O mes==12) Entonces
			diasmes=31;
		FinSi
		
		Si (dia>diasmes) Entonces
			Escribir "Fecha incorrecta";
			dato=Falso;
		FinSi
		
		Si (dato y (anioActual-anio>=18)) Entonces
			Escribir "Persona mayor de edad";
			Escribir "Fecha ingresada y año bisiesto";
			Escribir "Dia ",dia," Mes ", mes, " Año ",anio;
		SiNo
			Escribir "Persona menor de edad";
			Escribir "Fecha ingresada y año bisiesto";
			Escribir "Dia ",dia," Mes ", mes, " Año ",anio;			
		FinSi		
		
	FinSi
	
	Si (mes==2) Entonces
		diasmes=28;
	FinSi
	
	Si (mes==4 O mes==6 O mes==9 O mes==11) Entonces
		diasmes=30;
	FinSi
	
	Si (mes==1 O mes==3 O mes==5 O mes==7 O mes==8 O mes==10 O mes==12) Entonces
		diasmes=31;
	FinSi
	
	Si (dia>diasmes) Entonces
		Escribir "Fecha incorrecta";
		dato=Falso;
	FinSi
	
	Si (dato y (anioActual-anio>=18)) Entonces
		Escribir "Persona mayor de edad";
		Escribir "Fecha ingresada y año no bisiesto";
		Escribir "Dia ",dia," Mes ", mes, " Año ",anio;
	SiNo
		Escribir "Persona menor de edad";
		Escribir "Fecha ingresada y año no bisiesto";
		Escribir "Dia ",dia," Mes ", mes, " Año ",anio;
	FinSi	
FinProceso
