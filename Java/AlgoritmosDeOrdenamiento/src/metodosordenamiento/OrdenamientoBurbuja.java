package metodosordenamiento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrdenamientoBurbuja {

	// Metodo Burbuja Basico

	public static void metodoBurbujaBasico(int[] array) {
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		System.out.println("Array final Metodo Basico");
		System.out.println(Arrays.toString(array));
	}

	// Metodo Burbuja mejorado
	public static void metodoBurbujaWhile(int[] array) {
		int aux = 0;
		int i = 1;
		int n = array.length;
		boolean ordenado = false;

		while (i < n && !ordenado) {
			i++;
			ordenado = true;
			for (int j = 0; j < n - i; j++) {
				if (array[j] > array[j + 1]) {
					ordenado = false;
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		System.out.println("Array final Metodo While");
		System.out.println(Arrays.toString(array));
	}

	// Metodo Burbuja mejorado
	public static void metodoBurbujaDoWhile(int[] array) {
		int aux = 0;
		int i = 1;
		int n = array.length;
		boolean ordenado = false;

		do {
			i++;
			ordenado = true;
			for (int j = 0; j < n - i; j++) {
				if (array[j] > array[j + 1]) {
					ordenado = false;
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		} while (i < n && !ordenado);
		System.out.println("Array final Metodo DoWhile");
		System.out.println(Arrays.toString(array));
	}

	public static void metodoBurbujaBidirecional(int[] array) {

		int izquierda, derecha, ultimo; // variables para ordenamiento
		izquierda = 1;
		derecha = array.length;
		ultimo = array.length - 1;

		do {
			for (int i = array.length - 1; i > 0; i--) {
				// Burbuja hacia la izquierda
				// Los valores menores van a la izquierda
				if (array[i - 1] > array[i]) {
					int aux = array[i]; // variable auxiliar para poder hacer intercambio de
					array[i] = array[i - 1]; // posicion
					array[i - 1] = aux;
					ultimo = i;
				}
			}
			izquierda = ultimo + 1;
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {
					int aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
					ultimo = j;
				}
			}
			derecha = ultimo - 1;
		} while (derecha >= izquierda);

		System.out.println("Array final metodo Burbuja Bidirecional");
		System.out.println(Arrays.toString(array));

	}

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

		long inicio = 0;
		long fin = 0;
		double tiempo = 0;

		// lectura de datos.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Por favor ingrese la cantidad de datos:");
		int cantidad = Integer.parseInt(br.readLine());
		int[] array_a = new int[cantidad];
		int[] array_b = new int[cantidad];
		int[] array_c = new int[cantidad];

		System.out.println("Array inicial");
		for (int i = 0; i < cantidad; i++) {
			array_a[i] = (int) (Math.random() * 100);
			array_b[i] = array_a[i];
			array_c[i] = array_a[i];
			// System.out.print(array[i] + " ");
		}
		System.out.println(Arrays.toString(array_a));
		System.out.println();
		// Llamo el metodo ordenar

		inicio = System.nanoTime();
		metodoBurbujaBasico(array_a);
		fin = System.nanoTime();
		tiempo = (double) (fin - inicio);
		System.out.println(tiempo + " NanoSegundos");
		System.out.println();

		inicio = System.nanoTime();
		metodoBurbujaWhile(array_b);
		fin = System.nanoTime();
		tiempo = (double) (fin - inicio);
		System.out.println(tiempo + " NanoSegundos");
		System.out.println();

		inicio = System.nanoTime();
		metodoBurbujaDoWhile(array_c);
		fin = System.nanoTime();
		tiempo = (double) (fin - inicio);
		System.out.println(tiempo + " NanoSegundos");

		System.out.println();
		inicio = System.nanoTime();
		metodoBurbujaBidirecional(array_b);
		fin = System.nanoTime();
		tiempo = (double) (fin - inicio);
		System.out.println(tiempo + " NanoSegundos");
		
		
		System.out.println();
		System.out.println("Clase de Arrays sort");
		inicio = System.nanoTime();
		Arrays.sort(array_b);
		fin = System.nanoTime();
		tiempo = (double) (fin - inicio);
		System.out.println(tiempo + " NanoSegundos");

	}

}
