
/*
 * Para dividir una matriz en dos, necesitamos al menos tres 
 * variables de matriz. Tomaremos una matriz con números 
 * continuos y luego almacenaremos sus valores en dos variables
 * diferentes basadas en valores pares e impares.
 * 
 * START
 * Step 1 → Take three array variables A, E, and O
 * Step 2 → Store continuous values in A
 * Step 3 → Loop for each value of A
 * Step 4 → If A[n] is even then store in E array
 * Step 5 → If A[n] is odd then store in E array
 * STOP
 *  
 */
public class DividirArreglo {

	public static void main(String[] args) {
		// Declaracion e inicializacion de variables
		int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] even = new int[10];
		int[] odd = new int[10];
		int loop = 0, e = 0, d = 0;

		// Manipulacion de datos.
		for (loop = 0; loop < 10; loop++) {
			if (array[loop] % 2 == 0) {
				even[e] = array[loop];
				e++;
			} else {
				odd[d] = array[loop];
				d++;
			}
		}

		// Presentacion de datos
		System.out.println("Original -> ");
		for (loop = 0; loop < 10; loop++) {
			System.out.print(array[loop]);
		}

		System.out.println("\nEven -> ");
		for (loop = 0; loop < e; loop++) {
			System.out.print(even[loop]);
		}

		System.out.println("\nOdd  -> ");
		for (loop = 0; loop < d; loop++) {
			System.out.print(odd[loop]);
		}
	}

}
