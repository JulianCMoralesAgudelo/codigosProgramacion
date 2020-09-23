import java.util.ArrayList;
import java.util.Arrays;

public class JavaSubstringComparisons {

	public static void main(String[] args) {
		String cadena = "welcometojava\r\n" + "3";
		char[] datos = cadena.toCharArray();
		String letras = "";
		int numero = 0;

		for (int i = 0; i < datos.length; i++) {
			if (Character.isLetter(datos[i])) {
				letras += datos[i];
			} else {
				try {
					numero = Integer.parseInt(datos[i] + "");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		System.out.println("Letras: " + letras);
		System.out.println("Numero: " + numero);

		ArrayList<String> subCadenas = new ArrayList<String>();

		cadena = "";
		
		for (int i = 0, cont = 0; i < letras.length(); i++) {
			cadena += letras.charAt(i) + "";
			if (cadena.length() == numero) {
				subCadenas.add(cadena);
				cadena = "";
				cont = 0;
			}
			cont++;
		}

		System.out.println(subCadenas);

	}

}