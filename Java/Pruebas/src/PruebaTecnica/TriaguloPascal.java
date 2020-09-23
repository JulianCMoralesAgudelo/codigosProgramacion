package PruebaTecnica;

import java.util.Scanner;

public class TriaguloPascal {

	public static void espacios(int veces, int j) {

		for (int i = 1; i <= veces; i++) {
			System.out.print(" ");
		}
		numeral(j);
		System.out.println();
	}

	public static void numeral(int veces) {

		for (int i = 1; i <= veces; i++) {
			System.out.print("#");
		}

	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de niveles por favor :");
		int niveles = leer.nextInt();
		char caracter = '#';
		for (int i = 1; i <= niveles; i++) {
			espacios((niveles - i), i);
		}

	}

}
