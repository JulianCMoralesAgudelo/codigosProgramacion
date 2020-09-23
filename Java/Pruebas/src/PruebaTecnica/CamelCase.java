package PruebaTecnica;

public class CamelCase {

	public static boolean esMayuscula(char c) {

		if (Character.isUpperCase(c)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s = "ejemploDeEntrada";
		int maysculas = 1;
		for (int i = 0; i < s.length(); i++) {
			if (esMayuscula(s.charAt(i))) {
				maysculas++;
			}
		}
		System.out.println(maysculas);
	}

}
