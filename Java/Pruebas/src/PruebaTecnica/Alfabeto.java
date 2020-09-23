package PruebaTecnica;

public class Alfabeto {

	/*
	 * Dado el siguiente vector realizar un algoritmo para ordenarlo alfabéticamente
	 * comenzando por la letra “A”: Vector a ordenar:
	 * [A,Z,D,G,U,W,C,H,D,Y,I,E,T,U,H,N,M,S,A,F] Vector esperado:
	 * [A,A,C,D,D,E,F,G,H,H,I,M,N,S,T,U,U,W,Y,Z]
	 */
	
	// Crear arreglo de caracteres, cada letra posee un numeroe en el codigo ASCII.
	// Ordenar Arreglo
	// Imprimir arreglo ordenado.

	public static void ordIntercambio(char a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++)
			// sitúa mínimo de a[i+1]...a[n-1] en a[i]
			for (j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					intercambiar(a, i, j);
				}
	}

	// Intercambia datos.
	public static void intercambiar(char[] a, int i, int j) {
		char aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public static void main(String[] args) {


		char[] letras = new char[] { 'A', 'Z', 'D', 'G', 'U', 'W', 'C', 'H', 'D', 'Y', 'I', 'E', 'T', 'U', 'H', 'N',
				'M', 'S', 'A', 'F' };

		System.out.println("Arreglo original");
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		System.out.println();

		ordIntercambio(letras);

		System.out.println("\nArreglo ordenado");

		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}

	}

}


