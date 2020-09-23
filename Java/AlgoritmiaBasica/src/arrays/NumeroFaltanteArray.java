package arrays;

public class NumeroFaltanteArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15 };
		int n = array.length + 1;
		int sumaTotal = n * (n + 1) / 2;
		int sumaElementos = 0;
		int salida = 0;
		System.out.println(n);
		System.out.println(sumaTotal);
		// [n*(n+1)]/2

		for (int i = 0; i < array.length; i++) {
			sumaElementos += array[i];
		}
		salida = sumaTotal - sumaElementos;
		System.out.println(salida);

	}

}