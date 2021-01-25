import java.util.Collections;
import java.util.ArrayList;

class BuscarCaracteres {

	public static void main(String[] args) {

		// leo cadena
		String texto = "hola gatito,perrito adios";
		// Creo un arreglo con los caracteres de la cadena
		char[] cadena = texto.toCharArray();
		// Almaceno letras
		ArrayList<String> letras = new ArrayList<String>();
		// Almaceno caracteres
		ArrayList<String> car = new ArrayList<String>();
		// Almaceno posicion de los caracteres
		ArrayList<Integer> pos = new ArrayList<Integer>();

		for (int i = 0; i < cadena.length; i++) {
			// Si no es letra
			if (Character.isLetter(cadena[i])) {
				// Guardo letra
				letras.add(cadena[i] + "");
			} else {
				// Guardo posicion
				pos.add(i);
				// Guardo caracter
				car.add(cadena[i] + "");
			}
		}

		// Ordeno alfabeticamente
		Collections.sort(letras);
		

		// Inserto caracteres en su posicion original
		for (int i = 0; i < pos.size(); i++) {
			letras.add((int) pos.get(i), car.get(i));
		}

		// Imprimo System.out.println(pos); System.out.println(car);
		System.out.println(letras);

	}

}