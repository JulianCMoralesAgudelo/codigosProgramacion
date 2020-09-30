package retos;

import java.util.ArrayList;

//`cels = 5 * (fahr - 32) / 9`

public class FahrenheittoCelsius {

	public static void main(String[] args) {

		String cadena = "34 104 553 441 208 79 361 594 357 347 540 542 311 293 481 251 101 78 368 271 121 278 68 109 411 40 115 332 595 131 538 269 203 490 110";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;
		double numero = 0;

		ArrayList<Integer> Lista = new ArrayList<Integer>();

		for (int i = 1; i < partes.length; i++) {
			numero = (Double.parseDouble(partes[i]) - 32) / 1.8;
			// System.out.printf("El número originalmente es: %f\n", numero);
			double parteDecimal = numero % 1; // Lo que sobra de dividir al número entre 1
			double parteEntera = numero - parteDecimal; // Le quitamos la parte decimal usando una resta
			// System.out.printf("Parte entera: %f. Parte decimal: %f\n", parteEntera,
			// parteDecimal);
			if (parteDecimal >= Math.abs(0.5)) {
				if (parteEntera < 0) {
					System.out.print((int) (parteEntera - parteDecimal - 0.5) + " ");
				} else {
					System.out.print((int) (parteEntera + parteDecimal + 0.5) + " ");
				}
			} else {
				System.out.print(((int) parteEntera) + " ");
			}

		}

	}

}
