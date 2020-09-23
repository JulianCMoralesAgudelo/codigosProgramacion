//package kackerrank;

import java.awt.font.NumericShaper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

class Result {

	/*
	 * Complete the 'gradingStudents' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY grades as parameter.
	 */

	public static List<Integer> gradingStudents(List<Integer> grades) {

		// Write your code here
		/*
		 * int residuo = 0; int num = 0; for (int i = 0; i < grades.size(); i++) {
		 * residuo = grades.get(i) % 10; if (grades.get(i) >= 38) { num = grades.get(i);
		 * num = (num + 4) / 5 * 5; System.out.println(num); if (num - grades.get(i) <
		 * 3) { grades.set(i, num); } } }
		 */
		System.out.println(grades.toString());
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) >= 38) {
				if (grades.get(i) % 5 >= 3) {
					int num = grades.get(i);
					num += (5 - grades.get(i) % 5);
					grades.set(i, num);
				}
			}
		}

		System.out.println(grades.toString());
		return grades;
	}
}

/*
 * Si la diferencia entre la calificación y el siguiente múltiplo de 5 es menor
 * que, 3 redondea la calificación hasta el siguiente múltiplo de 5. Si el valor
 * de la calificación es inferior a 38, no se produce redondeo ya que el
 * resultado seguirá siendo una calificación reprobatoria.
 * 
 */

public class Grades {

	public static void main(String[] args) throws IOException {

		List<Integer> lista = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);

		System.out.println("Por favor ingrese la cantidad de alumnos a evaluar:");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			lista.add((int) (Math.random() * 100 + 1));
		}

		Result.gradingStudents(lista);

	}

}
