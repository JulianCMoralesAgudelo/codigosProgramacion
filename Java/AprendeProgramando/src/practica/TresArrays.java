package practica;
import java.util.Scanner;

public class TresArrays {

	/*
	 * Define tres arrays de 20 números enteros cada una, con nombres numero ,
	 * cuadrado y cubo . Carga el array numero con valores aleatorios entre 0 y 100.
	 * En el array cuadrado se deben almacenar los cuadrados de los valores que hay
	 * en el array numero . En el array cubo se deben almacenar los cubos de los
	 * valores que hay en numero . A continuación, muestra el contenido de los tres
	 * arrays dispuesto en tres columnas.
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

		int[] numero = new int[cantidad];
		int[] cuadrado = new int[cantidad];
		int[] cubo = new int[cantidad];

		for (int i = 0; i < cantidad; i++) {
			numero[i] = (int) Math.floor(Math.random() * (n - m + 1) + m); // Valor entre M y N, ambos incluidos.
			cuadrado[i] = (int) Math.pow(numero[i], 2);
			cubo[i] = (int) Math.pow(numero[i], 3);
		}

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Numero: " + numero[i] + "\tCuadrado: " + cuadrado[i] + "\tCubo: " + cubo[i]);
		}

	}

}
