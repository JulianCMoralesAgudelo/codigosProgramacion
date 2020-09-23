package practica;
import java.util.Scanner;

public class Aleatorios {
	public static void main(String[] args) {

		// En general, para conseguir un número entero entre M y N con M menor que N y
		// ambos incluídos, debemos usar esta fórmula

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros a crear:");
		int cantidad = in.nextInt();

		System.out.println("Ingrese el numero superior");
		int n = in.nextInt();
		System.out.println("Ingrese el numero inferior");
		int m = in.nextInt();

		int num = (int) Math.floor(Math.random() * (n - m + 1) + m); // Valor entre M y N, ambos incluidos.	
		int sum = 0;

		for (int i = 1; i <= cantidad; i++) {
			num = (int) Math.floor(Math.random() * (n - m + 1) + m); // Valor entre M y N, ambos incluidos.
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();

		System.out.println("La suma de los nuemeros es = " + sum);
	}
}
