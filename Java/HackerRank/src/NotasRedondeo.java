package kackerrank;

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
		int residuo = 0;
		int num = 0;
		for (int i = 0; i < grades.size(); i++) {
		residuo = grades.get(i) % 10;
		if (grades.get(i) >= 38) {
				num = grades.get(i);
				num = (num + 4) / 5 * 5;
				System.out.println(num);
				if (num - grades.get(i) < 3) {
				grades.set(i, num);
				}
			}
		}
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

public class Solution {

	public static void main(String[] args) throws IOException {

		List<Integer> lista = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);

		/*
		 * System.out.
		 * println("Por favor ingrese la cantidad de alumnos a evaluar:"); int n
		 * = in.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) { lista.add((int) (Math.random() * 100 +
		 * 1)); }
		 * 
		 */
		lista.add(20);
		lista.add(73);
		lista.add(67);
		lista.add(38);
		lista.add(33);
		lista.add(78);
		lista.add(60);
		lista.add(60);
		lista.add(15);
		lista.add(45);
		lista.add(15);
		lista.add(10);
		lista.add(5);
		lista.add(46);
		lista.add(87);
		lista.add(33);
		lista.add(60);
		lista.add(14);
		lista.add(71);
		lista.add(65);

		Result.gradingStudents(lista);

	}

}

