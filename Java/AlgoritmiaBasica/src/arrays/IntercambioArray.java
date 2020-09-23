package arrays;

import java.util.Arrays;

public class IntercambioArray {

	public static void main(String[] args) {
		int[] A = { 7, 4, 8, 9, 3, 10, 6, 1, 2, 5 };
		System.out.println(Arrays.toString(A));
		ordIntercambio(A);
		System.out.println(Arrays.toString(A));

	}

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

}
