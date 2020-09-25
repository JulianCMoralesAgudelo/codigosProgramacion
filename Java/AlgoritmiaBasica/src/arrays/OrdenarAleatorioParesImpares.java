package arrays;

import java.util.ArrayList;
import java.util.Random;

public class OrdebarAleatorioParesImpares {

	public static void main(String[] args) {

		// Declaracion e incio de variables
		int[] array = new int[50];
		Random r = new Random();
		int pares = 0;
		int impares = 0;

		// Lectura y manejo de informacion
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
			if (array[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		// Imprimir Array
		System.out.println("Array creado");
		imprimir(array);
		ordIntercambio(array);
		System.out.println();
		System.out.println("Array ordenado");
		imprimir(array);
		System.out.println();

		System.out.println("Pares");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println();
		System.out.println("Impares");
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % 2 != 0)) {
				System.out.print(array[i] + " ");
			}
		}

	}

	// Ordenar Array.
	public static void ordIntercambio(int a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					intercambiar(a, i, j);
				}
	}

	// Intercambia datos.
	public static void intercambiar(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	// Busca dato.

	// Imprime Array
	public static void imprimir(int array[]) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length) {
				System.out.print("|");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}

}
