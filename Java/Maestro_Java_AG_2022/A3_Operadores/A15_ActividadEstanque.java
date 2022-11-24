import java.util.Scanner;

public class A15_ActividadEstanque {

	// Lector de consola
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {

		// Limpiar consola
		System.out.print("\033\143");

		/*
		 * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
		 * Se requiere un programa que pida la medida actual en litros y mostrar el
		 * resultado de la forma:
		 * Insuficiente, Suficiente, Medio...
		 * La medida o capacidad actual del estanque puede ser en tipo double, para una
		 * mejor precisión,
		 * pero tambien puede ser del tipo int.
		 * Si la capacidad actual es 70 litros: imprimir Estanque lleno
		 * Si está entre 60 y menor a 70: imprimir Estanque casi lleno
		 * Si está entre 40 y menor a 60: imprimir Estanque 3/4
		 * Si está entre 35 y menor a 40: imprimir Medio Estanque
		 * Si está entre 20 y menor a 35: imprimir Suficiente
		 * Si está entre 1 y menor a 20: imprimir Insuficiente
		 * 
		 */

		// Declarar variables
		double litros = 0;
		int capacidad = 0;
		boolean ok = false;

		String centimetros = " cm^3 de gasolina";

		// Leer datos
		do {
			try {
				System.out.print("\nIngrese la medida actual en litros del estanque de gasolina: ");
				litros = Integer.parseInt(lector.nextLine());
				if (litros > 1 && litros <= 70) {
					ok = true;
				} else {
					System.out.println("\nValor incorrecto: ");
				}
			} catch (Exception e) {
				System.out.print("\nValor incorrecto\n\nPresione enter para reintentar por favor ");
				lector.nextLine();
			}
		} while (!ok);

		// Condiciones
		capacidad = (int) litros;

		if (capacidad == 70) {
			System.out.println("\nEstanque lleno con " + litros + centimetros);
		} else if (capacidad >= 60 && capacidad < 70) {
			System.out.println("\nEstanque casi llenocon " + litros + centimetros);
		} else if (capacidad >= 40 && capacidad < 60) {
			System.out.println("\nEstanque 3/4 con " + litros + centimetros);
		} else if (capacidad >= 35 && capacidad < 40) {
			System.out.println("\nMedio Estanque con " + litros + centimetros);
		} else if (capacidad >= 20 && capacidad < 35) {
			System.out.println("\nEstanque Suficiente con " + litros + centimetros);
		} else if (capacidad >= 1 && capacidad < 20) {
			System.out.println("\nEstanque Insuficiente con " + litros + centimetros);
		} else {
			System.out.println("\nValor inesperado con " + litros + centimetros);			
		}
	}
}