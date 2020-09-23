package practica;

public class BarajaFrancesa {

	public static void main(String[] args) {
		String cartas[] = { "AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JOTA", "REYNA", "REY" };
		String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS" };

		int palo = 0;
		int carta = 0;

		for (int i = 0; i < 10; i++) {
			palo = (int) (Math.random() * 4);
			carta = (int) (Math.random() * 14);
			System.out.println(cartas[carta] + " " + palos[palo]);
		}

	}

}
