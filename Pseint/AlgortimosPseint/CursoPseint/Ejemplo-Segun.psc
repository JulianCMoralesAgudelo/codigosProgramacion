Proceso sin_titulo
	Definir NumeroA, NumeroB, Operacion como Numericos;
	
	Escribir Sin Saltar "Escribe el número A";
	Leer NumeroA;
	
	Escribir Sin Saltar "Escribe el número B";
	Leer NumeroB;
	
	Escribir "Operaciones Disponibles";
	Escribir "1: Suma";
	Escribir "2: Resta";
	Escribir "3: Multiplicación";
	
	Escribir Sin Saltar "¿Qué operación queres ejecutar?";
	Escribir Sin Saltar "Escribe la letra en mayúscula o mínuscula";
	
	Leer Operacion;
	
	Segun Operacion Hacer
		1:
			// aqui la suma
			Escribir "Has elegido la suma";
			Escribir NumeroA, '+', NumeroB;
			Escribir NumeroA+NumeroB;
		2:
			// aqui la resta
			Escribir "Has elegido la resta";
			Escribir NumeroA, '-', NumeroB;
			Escribir NumeroA-NumeroB;
		3:
			// aqui la multiplicacion
			Escribir "Has elegido la multiplicación";
			Escribir NumeroA, '*', NumeroB;
			Escribir NumeroA*NumeroB;
		De Otro Modo:
			Escribir "No has elegido la operación correcta";
	FinSegun
	
FinProceso
