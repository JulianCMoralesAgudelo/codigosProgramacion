Proceso Edad
	//Definicion de variables
	Definir ano, mes, dia, ano_actual, mes_actual, dia_actual Como Entero;
	//Inicializacion de variables
	ano=0;mes=0;dia=0;
	ano_actual=0; mes_actual=0; dia_actual=0;
	//Lectura de datos
	Escribir "Por favor ingresa tus fecha de nacimiento";
	Escribir "Por favor ingresa el ano en que naciste";
	Leer ano;
	Escribir "Por favor ingresa el mes en que naciste";
	Leer mes;
	Escribir "Por favor ingresa el dia en que naciste";	
	Leer dia;
	Limpiar Pantalla;
	Escribir "Por favor ingresa la fecha actual";
	Escribir "Por favor ingresa el ano actual";
	Leer ano_actual;
	Escribir "Por favor ingresa el mes actual";
	Leer mes_actual;
	Escribir "Por favor ingresa el dia actual";
	Leer dia_actual;
	Limpiar Pantalla;
	//Manipulacion de datos y Presentacion de datos
	Si (((ano_actual-ano)>=18)Y((ano_actual-ano)<=25)) Entonces		
		Escribir "Cumple con la edad requerida";
	Sino
		Escribir "No Cumple con la edad requerida";
		Escribir "Muchas gracias";
	FinSi	
FinProceso
