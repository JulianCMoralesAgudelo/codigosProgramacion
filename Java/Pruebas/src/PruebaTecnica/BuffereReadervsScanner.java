package PruebaTecnica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BuffereReadervsScanner {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingres un numero :");
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese un dato : ");
		String dato1 = br.readLine();
		System.out.print("Ingrese un dato : ");
		String dato2 = in.nextLine();

		System.out.println(dato1);
		System.out.println(dato2);

		System.out.print("Ingrese un numero : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Ingrese un numero : ");
		int num2 = in.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
