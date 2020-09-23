package PruebaTecnica;

public class BorrarRepetido {

	public static void borrables(char[] letras) {
		int repetidas = 0;

		for (int i = 0; i < letras.length-1; i++) {
			for (int j = 1; j < letras.length; j++) {
				if (i == j) {
					if (letras[i] == letras[j]) {
						repetidas++;
					}
				}
			}
		}
		System.out.println(repetidas);		
	}

	public static void main(String[] args) {

		String s = "";
		borrables("AAAA".toCharArray());
		borrables("BBBBB".toCharArray());
		borrables("ABABABAB".toCharArray());
		borrables("BABABA".toCharArray());
		borrables("AAABBB".toCharArray());
	}

}
