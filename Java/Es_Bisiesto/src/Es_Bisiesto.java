import java.util.Scanner;


public class Es_Bisiesto {

	/**
	Un año es bisiesto en el calendario Gregoriano, si es divisible entre 4 y no divisible entre 100, y también si es divisible entre 400.
	En programación, el algoritmo para calcular si un año es bisiesto es un algoritmo útil para la realización de calendarios.
	Considérese las siguientes proposiciones o enunciados lógicos:

	    p: Es divisible entre 4
	    ¬q: No es divisible entre 100
	    r: Es divisible entre 400

	La fórmula lógica que se suele usar para establecer si un año es bisiesto sería cuando [p y ¬q] ó [r] es verdadera,
	pero esta otra p y [¬q ó r] sería más eficiente. 
	*/

	public static boolean es_bisiesto(int year) {
	    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	
	public static void main(String[] args) {
		// Inicio
		
		Scanner in = new Scanner (System.in);
		System.out.println("Por favor ingrese el año actual : ");
		int añoA=in.nextInt();
		System.out.println("Por favor ingrese el año final : ");
		int añoF=in.nextInt();
		int c=0;
		
		for (int i = añoA; i<=añoF; i++) {
			   if(es_bisiesto(i)){
				   c++;
			   }
			}
		System.out.println("La cantidad de años bisiestos desde " + añoA + " hasta " + añoF + " en total son " + c );

	}

}
