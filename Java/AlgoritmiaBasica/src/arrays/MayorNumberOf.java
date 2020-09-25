package arrays;

import java.io.*;
import java.util.Arrays;

public class MayorNumberOf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cantidad = 0;
		int sum = 0;
		boolean ok = false;
		String s = null;
		int n = 0;

		do {
			System.out.println("Ingrese un numero de cuatro cifras:");
			s = reader.readLine();
			try {
				n = Integer.parseInt(s);
				ok = true;
			} catch (Exception e) {
				// TODO: handle exception
			}

		} while (ok && s.length() != 4);

		cantidad = s.length();

		int[] array = new int[cantidad];

		for (int i = s.length() - 1; i >= 0; i--) {
			array[i] = n % 10;
			n /= 10;
		}

		
		ordIntercambio(array);
		System.out.println(Arrays.toString(array));
		ordIntercambiInverso(array);
		System.out.println(Arrays.toString(array));

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
