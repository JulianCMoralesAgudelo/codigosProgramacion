package arrays;

import java.util.Arrays;

/**
 * Java program to find the maximum and minimum number in Array. It's good
 * programming exercise for beginners because you can't use API methods.
 *
 * @author Javin
 */

public class Pattern {

	public static void main(String args[]) {

		// normal case testing
		int[] primes = { 31, 37, 41, 43, 47, 59 };
		System.out.printf("Array: %s, Maximum: %d, Minimum: %d %n", Arrays.toString(primes), max(primes), min(primes));
		int[] even = { 2, 4, 14, 16, 18, 20 };
		System.out.printf("Array: %s, Maximum: %d, Minimum: %d %n", Arrays.toString(even), max(even), min(even));
		int[] odd = { 1, 3, 11, 15, 18, 21 };
		System.out.printf("Array: %s, Maximum: %d, Minimum: %d %n", Arrays.toString(odd), max(odd), min(odd));

		// testing for empty array
		try {
			int[] empty = {};
			System.out.printf("Array: %s, Largest: %d, Smallest: %d %n", Arrays.toString(empty), max(empty),
					min(empty));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// testing for array with negative numbers
		int[] negative = { 1, -1, 2, -3 };
		System.out.printf("Array: %s, Maximum: %d, Minimum: %d %n", Arrays.toString(negative), max(negative),
				min(negative));

		// testing for a single element array
		int[] single = { 1 };
		System.out.printf("Array: %s, Largest: %d, Smallest: %d %n", Arrays.toString(single), max(single), min(single));

		// testing for a null array
		try {
			int[] nullInput = null;
			System.out.printf("Array: %s, Maximum: %d, Minimum: %d %n", Arrays.toString(nullInput), max(nullInput),
					min(nullInput));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Method to find maximum number of Array in Java
	 *
	 * @param numbers
	 * @return maximum number from given array
	 */
	public static int max(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Invalid input: " + Arrays.toString(numbers));
		}
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	/**
	 * Method to calculate minimum of an Array in Java
	 *
	 * @param numbers
	 * @return minimum number from array
	 */
	public static int min(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Invalid input: " + Arrays.toString(numbers));
		}
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
}
