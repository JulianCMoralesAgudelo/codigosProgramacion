package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneLargeArrayandTwoSmallOnes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[20];
		int[] array_1 = new int[10];
		int[] array_2 = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}

		for (int i = 0; i < array.length; i++) {
			if (i < 10) {
				array_1[i] = array[i];
				System.out.println(array_1[i]);
			} else if (i >= 10) {
				array_2[i - 10] = array[i];
				System.out.println(array_2[i - 10]);
			}
		}

	}

}
