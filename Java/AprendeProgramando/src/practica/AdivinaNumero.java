package practica;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {

		// En general, para conseguir un número entero entre M y N con M menor que N y
		// ambos incluídos, debemos usar esta fórmula

		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el numero superior");
		int n = in.nextInt();
		System.out.println("Ingrese el numero inferior");
		int m = in.nextInt();

		int num = (int) Math.floor(Math.random() * (n - m + 1) + m); // Valor entre M y N, ambos incluidos.
		int intentos = 5;
		int dato = 0;

		while (intentos > 0) {
			System.out.println("Ingrese la un numero:");
			dato = in.nextInt();
			if (dato == num) {
				System.out.println("Adivinaste");
				break;
			} else if (dato < num) {
				System.out.println("Fallaste, el numero es mayor");
			} else {
				System.out.println("Fallaste, el numero es menor");
			}
			intentos--;
			System.out.println("Te quedan " + intentos + " intentos");
			if(intentos==0) {
				System.out.println("Ya paila, perdio");
				break;
			}

		}

	}

}
