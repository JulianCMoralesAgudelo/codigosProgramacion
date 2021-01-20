package arrays;

import java.util.Scanner;

public class ArrayBusquedaBinaria {

	// Crear y llenar Array
	// Ordenar Array
	// Preguntar dato a buscar
	// Buscar dato.
	// Imprimir dato

	// Metodos

	// Ordenar Array.
	public static void ordIntercambio(int a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			// sit�a m�nimo de a[i+1]...a[n-1] en a[i]
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
	public static void imprimir(int a[]) {

		System.out.println("Posiciones");
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i);
			if (i < 9) {
				System.out.print(" ");
			}
			if (i < a.length) {
				System.out.print("|");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();

		System.out.println("Informacion");
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {			
			System.out.print(a[i]);
			if (i < a.length) {
				System.out.print("|");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();

	}

	// Busqueda Binaria
	public static int busquedaBinaria(int vector[], int n, int dato) {
		int centro, inf = 0, sup = n - 1;
		while (inf <= sup) {
			centro = ((sup - inf) / 2) + inf;
			if (vector[centro] == dato)
				return centro;
			else if (dato < vector[centro])
				sup = centro - 1;
			else
				inf = centro + 1;
		}
		return -1;
	}

	public static void main(String[] args) {

		// Crear array
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de datos :");
		int n = in.nextInt();
		int[] array = new int[n];

		// Llenar Array
		for (int i = 0; i < n; i++) {
			array[i] = ((int) (Math.random() * 100 + 1));
		}

		// Imprimir Array
		System.out.println("Array creado");
		imprimir(array);
		ordIntercambio(array);
		System.out.println("Array ordenado");
		imprimir(array);

		// Busqueda del dato
		System.out.println("Ingrese el numero a buscar :");
		n = in.nextInt();

		int out = busquedaBinaria(array, array.length, n);

		if (out == -1) {
			System.out.println("El dato no fue hallado");
		} else {
			System.out.println("el dato se hallo en la posicion: " + out);
		}

	}

}
