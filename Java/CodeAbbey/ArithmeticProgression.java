package retos;

import java.util.ArrayList;

public class ArithmeticProgression {

	// Sn = (a1 + an)*(n/2)
	// Sn= (2*a1 + (n - 1)* d)*(n/2)

	public static void main(String[] args) {

		String cadena = "11\r\n" + "22 9 71\r\n" + "29 18 95\r\n" + "28 4 55\r\n" + "16 7 85\r\n" + "7 11 23\r\n"
				+ "14 12 60\r\n" + "15 0 10\r\n" + "8 19 85\r\n" + "20 11 78\r\n" + "5 14 52\r\n" + "29 9 93";

		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;
		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < partes.length; i++) {
			lista.add(Integer.parseInt(partes[i]));
		}
		int a1 = 0;
		int d = 0;
		int n = 0;

		for (int i = 1, cont = 1; i < lista.size(); i++, cont++) {
			if (cont == 1) {
				a1 = lista.get(i);
			} else if (cont == 2) {
				d = lista.get(i);
			} else if (cont == 3) {
				n = lista.get(i);
				ArithProgression(a1, d, n);
				cont = 0;
			}
		}

	}

	public static void ArithProgression(int a1, int d, int n) {

		int sn = ((2 * a1 + (n - 1) * d) * n) / 2;
		System.out.print(sn + " ");
	}

}
