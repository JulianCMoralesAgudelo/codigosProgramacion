package amazonviewer;

import java.util.Scanner;

public class Metodos {

	// Leer respuesta del usuario
	public static int validateUserResponseMenu(int min, int max) {
		// Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);

		// Validar respuesta int
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opci�n v�lida1");
			System.out.println("Intenta otra vez1");
		}

		int response = sc.nextInt();

		// Validar rango de respuesta
		while (response < min || response > max) {
			// Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opci�n v�lida");
			System.out.println("Intenta otra vez");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opci�n v�lida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

}
