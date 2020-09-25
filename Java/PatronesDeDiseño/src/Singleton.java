// Clase principal
public final class Singleton {

	// Objeto
	private static final Singleton singleton = new Singleton();
	private static int cantidad;

	// Objeto
	private Singleton() {
		System.out.println("Hola, he sido creado solo una sola vez!!!");
	}

	// Metodo
	public static Singleton obtenerSingleton() {
		cantidad++;
		return singleton;
	}

	public static void vecesLLamado() {
		System.out.println("Se ha llamdado " + cantidad + " veces");
	}

}
