package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MInMaxSumArray {

	public static void main(String[] args) {

		// Leer numero entero
		Scanner in = new Scanner(System.in);
		System.out.print("Por favor ingrese un numero: ");
		String numero = in.nextLine();
		// El numero lo leo como cadena para aber la longitud y asi poder almacenar en
		// un array de esa longitud
		int[] array = separaNumero(numero);

		ordIntercambio(array);
		System.out.println(Arrays.toString(array));
		ordIntercambiInverso(array);
		System.out.println(Arrays.toString(array));

		// Separar pares e impares del array

		String pares = "";
		String impares = "";

		// Separa numeros pares e impares
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				pares += Integer.toString(array[i]);
			} else {
				impares += Integer.toString(array[i]);
			}
		}

		// Imprime pares
		int[] arrayPares = separaNumero(pares);
		/*
		 * ordIntercambio(arrayPares); System.out.println(Arrays.toString(arrayPares));
		 */
		ordIntercambiInverso(arrayPares);
		System.out.println(Arrays.toString(arrayPares));

		// Imprime impares
		int[] arrayImpares = separaNumero(impares);

		ordIntercambio(arrayImpares);
		System.out.println(Arrays.toString(arrayImpares));
		/*
		 * ordIntercambiInverso(arrayImpares);
		 * System.out.println(Arrays.toString(arrayImpares));
		 */

	}

	// Separar numero en cifras y crear array
	public static int[] separaNumero(String numero) {

		// El numero lo leo como cadena para aber la longitud y asi poder almacenar en
		// un array de esa longitud
		int[] array = new int[numero.length()];
		int dato = Integer.parseInt(numero);
		// Creo las variables para separar el numero en digitos
		int entero = 0;
		int residuo = 0;

		for (int i = 0; i < numero.length(); i++) {
			residuo = dato % 10;
			array[i] = residuo;
			dato /= 10;
		}

		return array;

	}

	// Metodo de ordenamiento de arrays

	public static void intercambiar(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public static void ordIntercambio(int a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					intercambiar(a, i, j);
				}
	}

	public static void ordIntercambiInverso(int a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					intercambiar(a, i, j);
				}
	}

}
