package retos;

import java.util.ArrayList;
import java.util.List;

public class Rounding {

	/*
	 * Separar parte entera y decimal de un número en Java Para obtener la parte
	 * entera y decimal tenemos que usar puras matemáticas, pues no existe la
	 * función modf como en Python o C.
	 * 
	 * El primer paso es obtener la parte decimal, eso se obtiene tomando lo que
	 * resta al dividir el número entre 1.
	 * 
	 * Después, lo segundo es lo más sencillo, pues para obtener la parte entera se
	 * resta la parte decimal del número original.
	 */

	public static void main(String[] args) {
		String cadena = "16\r\n" + "2444289 -1154444\r\n" + "8359 1512\r\n" + "7887 1250\r\n" + "4496547 208\r\n"
				+ "7701754 1772359\r\n" + "6460373 146\r\n" + "8593 742\r\n" + "7378241 853\r\n" + "2245990 738329\r\n"
				+ "2963095 267\r\n" + "16255 1824\r\n" + "5742563 162\r\n" + "11899 1046\r\n" + "2923388 2928284\r\n"
				+ "7365 1486\r\n" + "338530 -2153757";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;
		double numero = 0;
		ArrayList<Double> Lista_rigth = new ArrayList<Double>(length / 2);
		ArrayList<Double> Lista_left = new ArrayList<Double>(length / 2);

		for (int i = 1; i < length; i++) {
			if (i % 2 == 0) {
				Lista_rigth.add(Double.parseDouble(partes[i]));
			} else {
				Lista_left.add(Double.parseDouble(partes[i]));
			}
		}

		for (int i = 0; i < Lista_rigth.size(); i++) {
			numero = Lista_left.get(i) / Lista_rigth.get(i);
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