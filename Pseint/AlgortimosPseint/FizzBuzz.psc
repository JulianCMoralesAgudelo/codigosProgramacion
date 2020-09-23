Algoritmo FizzBuzz
	//Escribir un algoritmo que imprima los numeros del 1 al 100, con la condicion que si el numero a imprimir es multiplo de 3, imprima el string 'Fizz', si el numero es multiplo de 5 imprima: 'Buzz', y si es multiplo de ambos imprima: 'FizzBuzz'	
	// Ejemplo de output: // 1 // 2 // Fizz // 4 // Buzz // Fizz // ... // 14 // FizzBuzz // 16
	Definir i como Entero;
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Si(i%5==0 & i%3==0 & i>5) Entonces
			Escribir "FizzBuzz";
		SiNo
			Si(i%5==0) Entonces
				Escribir "Buzz";
			SiNo
				Si(i%3==0) Entonces
					Escribir "Fizz";
				SiNo
					Escribir i;
				FinSi				
			FinSi
		FinSi		
	FinPara
	
FinAlgoritmo
