/**
 * Plantilla de trabajo
 *
 * @author Julian Camilo Morales Agudelo.
 */

package practica;

import java.util.Scanner;

public class Horario {

	// Definicion de variables e Inicializacion de variables
	static String lunes = "Lunes";
	static String martes = "Martes";
	static String miercoles = "Miercoles";
	static String jueves = "Jueves";
	static String viernes = "Viernes";
	static String sabado = "Sabado";
	static String domingo = "Domingo";
	static String trabajo = "Jornada laboral de 8 horas mas dos horas de transporte ida y regreso.";

	public static void main(String[] args) {

		// Definicion de variables e Inicializacion de variables
		Scanner s = new Scanner(System.in);
		String diaSem = "";
		diaSem = s.nextLine();

		// Lectura de datos Manipulacion de datos y Presentacion de datos.
		System.out.print("Por favor, introduce un dia de la semana: ");

		if (diaSem.equalsIgnoreCase(lunes)) {
			System.out.println("Cátedra IU Digital, Paz y Reconciliación.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		} else if (diaSem.equalsIgnoreCase(martes)) {
			System.out.println("Calculo, Fundamentos de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		} else if (diaSem.equalsIgnoreCase(miercoles)) {
			System.out.println("Inglés I, Fundamentos de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
		} else if (diaSem.equalsIgnoreCase(jueves)) {
			System.out.println("Fundamentos de la Investigación, de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		} else if (diaSem.equalsIgnoreCase(jueves)) {
			System.out.println(
					"Cátedra IU Digital, Paz y Reconciliación, Fundamentos de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		} else if (diaSem.equalsIgnoreCase(viernes)) {
			System.out.println("Calculo, Fundamentos de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		} else if (diaSem.equalsIgnoreCase(sabado)) {
			System.out.println("Calculo,Fundamentos de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		} else if (diaSem.equalsIgnoreCase(domingo)) {
			System.out.println("Inglés I, Fundamentos de programacion, Algoritmos de practica en java.");
			System.out.println(trabajo);
			System.out.println("Vida familiar");
		}
		s.close();
	}

}
