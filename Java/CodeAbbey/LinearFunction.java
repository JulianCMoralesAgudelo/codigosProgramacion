package retos;

import java.util.ArrayList;

public class LinearFunction {

	public static void main(String[] args) {
		String cadena = "10\r\n" + "847 58664 143 9384\r\n" + "445 -38357 918 -78562\r\n" + "39 -2896 -702 46751\r\n"
				+ "202 14518 330 23350\r\n" + "775 44994 -599 -36072\r\n" + "778 -18476 678 -15976\r\n"
				+ "-708 25702 226 -8856\r\n" + "258 -12661 -812 41909\r\n" + "331 28903 -985 -85589\r\n"
				+ "932 52900 900 51076";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;

		System.out.println();

		double b = 0, m = 0, x = 0, y = 0, x1 = 0, x2 = 0, y1 = 0, y2 = 0;

		for (int i = 1, cont = 1; i < partes.length; i++, cont++) {
			switch (cont) {
			case 1:
				x1 = Integer.parseInt(partes[i]);
				break;
			case 2:
				y1 = Integer.parseInt(partes[i]);
				break;
			case 3:
				x2 = Integer.parseInt(partes[i]);
				break;
			case 4:
				y2 = Integer.parseInt(partes[i]);
				imprimir(x1, y1, x2, y2);
				cont = 0;
				break;
			default:
				break;
			}
		}

	}

	public static void imprimir(double x1, double y1, double x2, double y2) {
		double b = 0, m = 0;
		m = (y2 - y1) / (x2 - x1);
		b = y1 - m * x1;
		System.out.print("(" + (int) m + " " + (int) b + ") ");
	}

}
