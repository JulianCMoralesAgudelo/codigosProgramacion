package PruebaTecnica;

import java.util.Scanner;

public class Piramide {
	public static void main(String[] args) {
		// Declaracion y definicion de variables
		Scanner leer = new Scanner(System.in);
		int i = 0;
		int j = i;
		boolean ok = false;

		System.out.println("Por davor ingrese los niveles de la piramide:");

		do {
			try {
				System.out.print("ingrese el numero de filas : ");
				i = leer.nextInt();
				ok = true;
			} catch (Exception e) {
				System.out.print("Error");
			}

		} while (!ok);

		char[][] matriz = new char[i][j];

		for (i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[0].length; k++) {
				if (i == j) {
					matriz[i][j] = '#';
				} else {
					matriz[i][j] = ' ';
				}
			}
			System.out.println();
		}

		for (i = 0; i < matriz.length; i++) {
			for (int k = 0; k < matriz[0].length; k++) {
				if (i == j) {
					System.out.println(matriz[i][j]);
				} else {
					System.out.println(matriz[i][j]);
				}
			}
			System.out.println();
		}

	}

}
