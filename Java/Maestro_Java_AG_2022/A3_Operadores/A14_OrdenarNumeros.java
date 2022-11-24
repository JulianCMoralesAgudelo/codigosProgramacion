import java.util.Scanner;

public class A14_OrdenarNumeros {

	// Lector de consola
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {

		// Limpiar consola
		System.out.print("\033\143");

		// Declarar variables
		int x = 0;
		int y = 0;
		int mayor = 0;
		int menor = 0;

		boolean ok = false;

		do {

			try {
				System.out.print("\nIngrese un numero entero: ");
				x = lector.nextInt();
				System.out.print("\nIngrese un numero entero: ");
				y = lector.nextInt();
				ok = true;
			} catch (Exception e) {
				System.out.println("\nIntente nuevamente");
				lector.nextLine();
			}
		} while (!ok);

		mayor = (x > y) ? x : y;
		menor = (x < y) ? x : y;

		if (mayor == menor) {
			System.out.println("\nAmbos numeros son iguales");
		} else {
			System.out.println("\nMayor: " + mayor);
			System.out.println("\nMenor: " + menor);
		}
	}
}