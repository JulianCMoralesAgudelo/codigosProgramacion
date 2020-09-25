package PruebaTecnica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DecimaltoBin {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingres un numero :");
		int dato = Integer.parseInt(br.readLine());
		decimaltoBin(dato);

	}

	public static void decimaltoBin(int dato) {
		String base2 = "";
		while (dato > 0) {
			base2 = (dato % 2) + base2;
			dato /= 2;
		}
		System.out.println(base2);
	}

}
