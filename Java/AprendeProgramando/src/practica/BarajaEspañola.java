package practica;

public class BarajaEspañola {

	public static void main(String[] args) {
		String cartas[] = { "2", "3", "4", "5", "6", "7"};
		String palos[] = { "Oros", "Bastos", "Copas", "Espadas" };

		int palo = 0;
		int carta = 0;

		for (int i = 0; i < 10; i++) {
			palo = (int) (Math.random() * 4);
			carta = (int) (Math.random() * 6);
			System.out.println(cartas[carta] + " " + palos[palo]);
		}

	}

}
