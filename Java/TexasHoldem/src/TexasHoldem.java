import java.util.Arrays;

/*
 * Tu trabajo es comparar pares de manos de póquer e indicar cuál es el ganador, y con que tipo de mano gano

Debe tener en cuenta que solo debe implementar 5 de los 10 tipos de manos pero en el orden normal, por ejemplo: Escalera real, Escalera de color, Poker, Full House y Color
 */

public class TexasHoldem {

	// Atributos

	private final static String[] palos = new String[] { "C", "D", "H", "S" };
	private final static String[] tarjeta = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A" };

	int paloslenght = palos.length;
	int tarjetalenght = tarjeta.length;
	

	// Ranking de combinaciones
	// Escalera Real son 10,J,Q,K,A 
    // Escalera de color 5 cartas diferentes a la escalera real.
	// Poker 4 cartas del mismo numero, el ganador lo define la carta de mayor valor.
	// Full house tres cartas de igual valor y dos de igual valor pero distintas al trio, el ganador lo define las cartas de mayor valor.
	// Color son 5 cartas del mismo palo sin importar los colores, gana la carta mas alta.
	// Escalera sencilla son cinco cartas del palo que sean y gana la carta mas alta y si aun asi son iguales comparrar por orden de valor.
	// El Trio son tr4wes cartas y la gana el de la carta de mayor valor
	// Dobles Parejas son una mano con dos parejas de igual numero y gana la carta de mayor valor
	// Pareja sopn dos cartas del mismo valor.
	// Carta Alta cuando no hay combinacion y la suerte va a la carta mas alta.
	// Escalera baja A,2,3,4,5 del mismo palo.
	

	public static void main(String[] args) {

		String[] cartas = new String[5];

		for (int i = 0; i < 5; i++) {
			int palo = (int) (Math.random() * palos.length);
			int carta = (int) (Math.random() * tarjeta.length);
			cartas[i] = tarjeta[carta] + palos[palo];			
		}

		Arrays.sort(cartas);		
		System.out.println(Arrays.toString(cartas));		

	}

}
