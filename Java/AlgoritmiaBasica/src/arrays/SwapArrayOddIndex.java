package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SwapArrayOddIndex {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Por favor ingrese la cantidad del array:");
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = ((int) (Math.random() * 100 + 1));
		}
		System.out.println(Arrays.toString(array));
		

	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		System.out.println(Arrays.toString(array));
	}

}
