package arrays;

import java.util.Arrays;

public class ArraySwapIndex {

	public static void main(String[] args) {

		int[] array = { 7, 4, 8, 9, 10, 6, 1, 3, 5, 2 };
		int n = array.length;
		System.out.println(n);
		System.out.println(Arrays.toString(array));
		intercambiarExtremos(array);
		intercambiarImpares(array);

	}

	public static void intercambiar(int[] a, int i, int j) {
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public static void intercambiarExtremos(int[] array) {

		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			if (i == array.length / 2) {
				break;
			} else {
				intercambiar(array, i, j);
			}
		}

		System.out.println(Arrays.toString(array));
	}

	public static void intercambiarImpares(int[] array) {

		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			if (i < array.length / 2) {
				intercambiar(array, i, j);
			} else {
				intercambiar(array, i, j);
			}
		}

		System.out.println(Arrays.toString(array));
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

}
