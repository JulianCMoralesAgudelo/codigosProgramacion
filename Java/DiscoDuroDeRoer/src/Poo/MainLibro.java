package Poo;

public class MainLibro {

	public static void main(String[] args) {

		Libro libro_1 = new Libro(1001, "Amor", "Jesus", 1000);
		Libro libro_2 = new Libro(1002, "Soberbia", "Pedro Perez", 30);

		System.out.println(libro_1.toString());
	}

}
