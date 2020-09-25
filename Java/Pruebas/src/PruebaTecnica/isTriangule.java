package PruebaTecnica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class isTriangule {

	public static void main(String[] args) throws Exception {
		// write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int resultado = 0;

		if (a + b > c) {
			resultado++;
		}

		if (a + c > b) {
			resultado++;
		}

		if (b + c > a) {
			resultado++;
		}

		if (resultado == 3) {
			System.out.println("The triangle is possible.");
		} else {
			System.out.println("The triangle is not possible.");
		}
	}

}
