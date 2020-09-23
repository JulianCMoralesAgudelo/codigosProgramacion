package PruebaTecnica;

public class Combinacioness {
	public static void main(String[] args) {
		String[] nombres = new String[3];
		nombres[0] = "Sam";
		nombres[1] = "I";
		nombres[2] = "Amn";
		int cont = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (nombres[i] != nombres[j] && nombres[i] != nombres[k] && nombres[j] != nombres[k]) {
						System.out.println(nombres[i] + nombres[j] + nombres[k]);
						cont++;
					}
				}
			}
		}
	}

}
