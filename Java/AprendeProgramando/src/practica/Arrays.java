package practica;
import java.util.Scanner;

public class Arrays {

	/*
	 * Define un array de 12 números enteros con nombre num y asigna los valores
	 * según la tabla que se muestra a continuación. Muestra el contenido de todos
	 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
	 * han sido inicializados?
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros a crear:");
		int cantidad = in.nextInt();
		System.out.println("Ingrese el numero superior");
		int n = in.nextInt();
		System.out.println("Ingrese el numero inferior");
		int m = in.nextInt();
		int num = (int) Math.floor(Math.random() * (n - m + 1) + m); // Valor entre M y N, ambos incluidos.

		int[] array = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			array[i] = (int) Math.floor(Math.random() * (n - m + 1) + m); // Valor entre M y N, ambos incluidos.
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nOrden Inverso");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
