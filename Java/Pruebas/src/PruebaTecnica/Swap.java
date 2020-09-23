package PruebaTecnica;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese un numero:");
		int a = in.nextInt();
		System.out.println("Ingrese un numero:");
		int b = in.nextInt();
		System.out.println(a + " " + b);
		swap(a, b);
	}

	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println(i + " " + j);
	}

}
