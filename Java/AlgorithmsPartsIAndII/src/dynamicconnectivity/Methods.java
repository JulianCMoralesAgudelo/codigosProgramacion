package dynamicconnectivity;

import java.util.Scanner;

public class Methods {

	public static int numberIn() {
		// Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		int numero = 0;

		do {
			try {
				numero = Integer.parseInt(sc.nextLine());
				ok = true;
			} catch (Exception e) {
				System.out.println(e + " , Intenta nuevamente por favor");
			}

		} while (!ok);

		return numero;
	}

}
