package retos;

import java.util.ArrayList;

public class Triangles {

	public static void main(String[] args) {
		String cadena = "26\r\n" + "509 296 859\r\n" + "256 490 203\r\n" + "1375 1285 690\r\n" + "1869 693 1101\r\n"
				+ "507 351 956\r\n" + "1357 506 675\r\n" + "303 555 1200\r\n" + "564 313 1282\r\n" + "894 1343 3315\r\n"
				+ "1255 1552 790\r\n" + "606 401 1187\r\n" + "927 2689 1277\r\n" + "813 3298 1480\r\n"
				+ "1219 838 464\r\n" + "669 479 544\r\n" + "875 750 1733\r\n" + "2478 862 1047\r\n" + "955 537 382\r\n"
				+ "1028 2292 557\r\n" + "391 898 677\r\n" + "925 1092 882\r\n" + "267 466 897\r\n" + "193 114 437\r\n"
				+ "2284 984 1221\r\n" + "755 622 627\r\n" + "1024 594 1128";

		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;
		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < partes.length; i++) {
			lista.add(Integer.parseInt(partes[i]));
		}
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 1, cont = 1; i < lista.size(); i++, cont++) {
			if (cont == 1) {
				a = lista.get(i);
			} else if (cont == 2) {
				b = lista.get(i);
			} else if (cont == 3) {
				c = lista.get(i);
				isTriangle(a, b, c);
				cont = 0;
			}
		}
	}

	public static void isTriangle(int a, int b, int c) {

		int resultado = 0;

		if (a + b > c) {
			resultado++;
		}
		if (a + c > b) {
			resultado++;
		}

		if (b + c > a) {
			resultado++;
		}

		if (resultado == 3) {
			System.out.print(1 + " ");
		} else {
			System.out.print(0 + " ");
		}
	}

}
