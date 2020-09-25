
public class Marcianos {

	public static final Marcianos marcianos = new Marcianos();
	private static int cantidad;

	private Marcianos() {
		setCantidad(10);
	}

	public static Marcianos getMarcianos() {
		return marcianos;
	}

	public static void derribarMarcianos() {

		if (getCantidad() > 0) {
			System.out.println("Soy el bueno, derribe un marciano");
			setCantidad(getCantidad() - 1);
		}
	}

	public static void crearMarcianos() {
		if (getCantidad() > 0) {
			System.out.println("Soy el malo, cree un marciano");
			setCantidad(getCantidad() + 1);
		}
	}

	public static void cuantosQuedan() {

		if (getCantidad() > 0) {
			System.out.println("Qeudan en el juego " + getCantidad() + " marcianos.");
		} else {
			System.out.println("Felicitaciones, has ganado el juego");
			System.out.println("El juego ha terminado.");
		}

	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Marcianos.cantidad = cantidad;
	}

}
