import java.util.ArrayList;

public class PlusMinus {

	public static void main(String[] args) {

		// Declaracion e inicializacion de variables
		String s = "6\r\n" + "-4 3 -9 0 4 1";
		// Se elminan espacios
		String patron = s.replaceAll("\r\n", " ");
		// Se Crea array con los componentes de la cadena
		String[] partes = patron.split("\\s+");

		// Se crea lista de enteros y variables necesarias para los porncentajes
		ArrayList<Integer> lista = new ArrayList<Integer>();
		double pos = 0;
		double neg = 0;
		double nul = 0;
		int siz = 0;

		// Se pasa de array de cadenas a lista de enteros
		for (int i = 0; i < partes.length; i++) {
			lista.add(Integer.parseInt(partes[i]));
			if (lista.get(i) > 0) {
				pos++;
			} else if (lista.get(i) < 0) {
				neg++;
			} else {
				nul++;
			}
		}

		// Se obtiene la cantidad de numeros del array
		siz = lista.get(0);
		lista.remove(0);

		// Presentacion de datos haciendo uso de la salida formateada a seis decimales
		// con la funcion printf
		System.out.printf("%.6f %n", (pos / siz));
		System.out.printf("%.6f %n", (neg / siz));
		System.out.printf("%.6f %n", (nul / siz));

	}

}
