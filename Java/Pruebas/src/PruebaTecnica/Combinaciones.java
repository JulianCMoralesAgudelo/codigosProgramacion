package PruebaTecnica;

import java.util.Scanner;

/* Calcula combinaciones sin repeticion */
public class Combinaciones {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		System.out.println("Combinaciones");

		// Lee repetitivamente el total de elementos hasta que se provea un entero
		// positivo
		System.out.println("Subconjunto a combinar (n): ");
		int n = leer.nextInt();

		// Lee repetitivamente un entero entre 1 y n
		System.out.println("Subconjunto a combinar (r): ");
		int r = leer.nextInt();

		// Calcula e imprime las combinaciones con los valores dados por el usuario
		System.out.println("C(" + n + ", " + r + ") = " + combinaciones(n, r));
	}

	public static long factorial(long n) {
		long resultado = 1;
		for (long i = 2; i <= n; ++i)
			resultado *= i;

		return resultado;
	}

	public static long combinaciones(long n, long r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}
}