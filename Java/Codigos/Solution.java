import java.io.*;

package PruebaTecnica;

import java.io.*;

public class Test {

	public static void main(String[] args) throws Exception {

		// write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int contador = 0;

		if (a >= 0 && b >= 0 && c >= 0) {
			System.out.println(3);
		}

		if (a >= 0 && b >= 0 && c < 0) {
			System.out.println(2);
		}

		if (a >= 0 && b < 0 && c >= 0) {
			System.out.println(2);
		}

		if (a < 0 && b >= 0 && c >= 0) {
			System.out.println(2);
		}

		if (a < 0 && b < 0 && c >= 0) {
			System.out.println(1);
		}

		if (a < 0 && b >= 0 && c < 0) {
			System.out.println(1);
		}
		
		if (a >= 0 && b < 0 && c < 0) {
			System.out.println(1);
		}
		
		else {
			System.out.println(0);
		}
		
	}
	
}
