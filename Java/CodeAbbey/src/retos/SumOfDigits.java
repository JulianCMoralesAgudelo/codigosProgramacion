package retos;

import java.util.ArrayList;

public class SumOfDigits {

	public static void cantidadDigitos(int sum) {
		int total = 0;
		int numero = sum;

		while (numero > 0) {
			total = total + numero % 10;
			numero /= 10;
		}
		System.out.print(total + " ");
	}

	public static void main(String[] args) {

		String cadena = "14\r\n" + "251 130 110\r\n" + "13 102 115\r\n" + "354 88 65\r\n" + "256 247 27\r\n"
				+ "327 72 80\r\n" + "395 5 102\r\n" + "45 215 112\r\n" + "176 70 137\r\n" + "358 136 97\r\n"
				+ "106 298 110\r\n" + "378 184 197\r\n" + "203 187 65\r\n" + "36 152 124\r\n" + "163 42 89";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");

		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> listb = new ArrayList<Integer>();
		ArrayList<Integer> listc = new ArrayList<Integer>();
		ArrayList<Integer> listd = new ArrayList<Integer>();

		int sum = 0;

		for (int i = 1, cont = 1; i < partes.length; i++, cont++) {
			if (cont == 1) {
				lista.add(Integer.parseInt(partes[i]));
			} else if (cont == 2) {
				listb.add(Integer.parseInt(partes[i]));
			} else if (cont == 3) {
				listc.add(Integer.parseInt(partes[i]));
				cont = 0;
			}
		}

		for (int i = 0; i < lista.size(); i++) {

			sum += lista.get(i) * listb.get(i) + listc.get(i);
			listd.add(sum);
			sum = 0;
		}

		for (int i = 0; i < listd.size(); i++) {
			cantidadDigitos(listd.get(i));
		}

	}

}
