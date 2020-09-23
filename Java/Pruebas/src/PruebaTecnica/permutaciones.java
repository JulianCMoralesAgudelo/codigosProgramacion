package PruebaTecnica;

import java.math.BigInteger;

public class permutaciones {
	
	// Variables de clase.
	private int[] a;
	private BigInteger numeroIzquierdo;
	private BigInteger total;

	// Metodo permutaciones
	public permutaciones(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Min 1");
		}
		a = new int[n];
		total = getFactorial(n);
		reiniciar();
	}

	// Metodo reiniciar
	public void reiniciar() {
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		numeroIzquierdo = new BigInteger(total.toString());
	}

	// Getters && Setters
	public BigInteger getNumLeft() {
		return numeroIzquierdo;
	}

	public BigInteger getTotal() {
		return total;
	}

	public boolean hasMore() {
		return numeroIzquierdo.compareTo(BigInteger.ZERO) == 1;
	}

	private static BigInteger getFactorial(int n) {
		BigInteger fact = BigInteger.ONE;
		for (int i = n; i > 1; i--) {
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}

	public int[] getNext() {

		if (numeroIzquierdo.equals(total)) {
			numeroIzquierdo = numeroIzquierdo.subtract(BigInteger.ONE);
			return a;
		}

		int temp;

		// Find largest index j with a[j] < a[j+1]

		int j = a.length - 2;
		while (a[j] > a[j + 1]) {
			j--;
		}

		// Find index k such that a[k] is smallest integer
		// greater than a[j] to the right of a[j]

		int k = a.length - 1;
		while (a[j] > a[k]) {
			k--;
		}

		// Interchange a[j] and a[k]

		temp = a[k];
		a[k] = a[j];
		a[j] = temp;

		// Put tail end of permutation after jth position in increasing order

		int r = a.length - 1;
		int s = j + 1;

		while (r > s) {
			temp = a[s];
			a[s] = a[r];
			a[r] = temp;
			r--;
			s++;
		}

		numeroIzquierdo = numeroIzquierdo.subtract(BigInteger.ONE);
		return a;
	}

	public static void main(String[] args) {
		int[] indices;
		String[] elements = { "a", "b", "c", "d" };
		permutaciones x = new permutaciones(elements.length);
		StringBuffer permutation;
		while (x.hasMore()) {
			permutation = new StringBuffer();
			indices = x.getNext();
			for (int i = 0; i < indices.length; i++) {
				permutation.append(elements[indices[i]]);
			}
			System.out.println(permutation.toString());
		}

	}

}
