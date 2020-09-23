package arrays;

import java.util.Arrays;

public class SwapIndex {
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	public static void main(String[] args) {
		int[] A = { 7, 4, 8, 9, 10, 6 };

		// index of the first element to be swapped
		int i = 2;

		// index of the second element to be swapped
		int j = 3;

		swap(A, i, j);	

		System.out.println(Arrays.toString(A));
	}

}
