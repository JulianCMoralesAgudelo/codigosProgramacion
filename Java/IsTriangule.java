
import java.util.ArrayList;

public class Triangles {

	public static void main(String[] args) {
		String cadena = "";

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
