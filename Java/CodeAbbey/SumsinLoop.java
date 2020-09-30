package retos;

public class SumsinLoop {
	public static void main(String[] args) {

		// Dividir el string
		// el pimer indice es la cantidad es la cantidad de sumas o salida
		// la cantidad de sumas por 2 es la cantidad ee parejas a sumar.
		//

		String cadena = "13\r\n" + "234156 722325\r\n" + "607451 746166\r\n" + "81944 584114\r\n" + "657180 646743\r\n"
				+ "709727 233933\r\n" + "256526 553634\r\n" + "225003 892002\r\n" + "360778 913366\r\n"
				+ "893864 792423\r\n" + "629630 245880\r\n" + "794588 53106\r\n" + "756320 864501\r\n"
				+ "988417 885805";
		String[] numerosSeparados = cadena.split("\\s+");
		int sumas = 0;

		for (int i = 1; i < numerosSeparados.length; i++) {
			sumas += Integer.parseInt(numerosSeparados[i]);
			if (i % 2 == 0) {
				System.out.print(sumas + " ");
				sumas = 0;
			}
		}
	}

}
