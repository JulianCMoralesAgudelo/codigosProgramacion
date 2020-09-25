
public class Robot {
	int ext;
	boolean extras;

	public Robot() {
		ext = 10;
		extras = true;
	}

	public Robot(String cadena) {
		ext = 1;
		extras = false;
	}

	public void caminar() {
		System.out.println("Estoy caminando.");
	}

	public void caminar(int numero) {
		System.out.println("Voy a caminar " + numero + " cuadras.");
	}

	public void caminar(int numero, int numero2) {
		System.out.println("Voy a caminar " + numero + " cuadras, " + numero2 + " veces.");
	}

	public void caminar(int numero, String calle) {
		System.out.println("Voy a caminar " + numero + " cuadras hasta la la calle: " + calle);
	}

}
