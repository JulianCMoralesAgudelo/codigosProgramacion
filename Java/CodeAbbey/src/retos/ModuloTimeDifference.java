package retos;

import java.util.ArrayList;
import java.util.List;

public class ModuloTimeDifference {

	static int dia1;
	static int hora1;
	static int min1;
	static int seg1;
	static int dia2;
	static int hora2;
	static int min2 = 0;
	static int seg2;

	public static void resultado(int dia1, int hora1, int min1, int seg1, int dia2, int hora2, int min2, int seg2) {
		int f1 = (dia1 * 86400) + (hora1 * 60 * 60) + (min1 * 60) + seg1;
		int f2 = (dia2 * 86400) + (hora2 * 60 * 60) + (min2 * 60) + seg2;
		int total = f2 - f1;

		dia1 = total / 86400;
		hora1 = (total - (86400 * dia1)) / 3600;
		min1 = (total - (dia1 * 86400) - (hora1 * 3600)) / 60;
		seg1 = (total - (dia1 * 86400) - (hora1 * 3600) - (min1 * 60));
		System.out.print("(" + dia1 + " " + hora1 + " " + min1 + " " + seg1 + ") ");

	}

	public static void main(String[] args) {
		String cadena = "14\r\n" + "2 5 28 48 10 18 57 54\r\n" + "9 12 11 30 22 4 10 55\r\n"
				+ "13 22 42 21 29 6 14 16\r\n" + "2 1 31 41 3 12 19 12\r\n" + "8 2 23 44 28 13 4 5\r\n"
				+ "9 4 32 47 14 14 45 52\r\n" + "24 5 50 12 25 18 51 56\r\n" + "2 1 53 1 8 23 20 25\r\n"
				+ "1 10 1 50 17 6 21 12\r\n" + "13 2 7 32 27 10 23 32\r\n" + "16 5 22 6 17 23 21 27\r\n"
				+ "1 20 50 8 22 21 20 55\r\n" + "1 21 42 38 21 10 48 34\r\n" + "26 4 17 44 29 6 20 35";

		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < partes.length; i++) {
			lista.add(Integer.parseInt(partes[i]));
		}

		// lista.remove(0);
		// System.out.println(lista.size());

		for (int i = 1, cont = 1; i < lista.size(); i++, cont++) {
			switch (cont) {
			case 1:
				dia1 = lista.get(i);
				break;
			case 2:
				hora1 = lista.get(i);
				break;
			case 3:
				min1 = lista.get(i);
				break;
			case 4:
				seg1 = lista.get(i);
				break;
			case 5:
				dia2 = lista.get(i);
				break;
			case 6:
				hora2 = lista.get(i);
				break;
			case 7:
				min2 = lista.get(i);
				break;
			case 8:
				seg2 = lista.get(i);
				cont = 0;
				resultado(dia1, hora1, min1, seg1, dia2, hora2, min2, seg2);
				ModuloTimeDifference();
			}

		}

	}

	private static void ModuloTimeDifference() {
		// TODO Auto-generated method stub
		dia1 = 0;
		hora1 = 0;
		min1 = 0;
		seg1 = 0;
		dia2 = 0;
		hora2 = 0;
		min2 = 0;
		seg2 = 0;
	}

}
