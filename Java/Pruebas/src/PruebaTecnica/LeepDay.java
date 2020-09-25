package PruebaTecnica;

import java.io.*;


public class LeepDay {

	public static void main(String[] args) throws Exception {
		// write your code here

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int anio = Integer.parseInt(br.readLine());
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			System.out.println("Number of days in the year: " + 366);
		} else {
			System.out.println("Number of days in the year: " + 365);
		}
	}

}
