import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {

		Marcianos marcianos;
		Computadora computadora;
		Jugador jugador;
		Scanner sc = new Scanner(System.in);
		marcianos = Marcianos.getMarcianos();
		computadora = new Computadora();
		jugador = new Jugador();

		int disparos;

		do {
			System.out.println("Ingrese la cantidad disparos a realizar: ");
			disparos = sc.nextInt();
			for (int i = 0; i < disparos; i++) {
				jugador.destruirMarcianos();
			}
			computadora.crearMarcianos();
			Marcianos.cuantosQuedan();
		} while (disparos != 0 && Marcianos.getCantidad() != 0);
		

	}

}
