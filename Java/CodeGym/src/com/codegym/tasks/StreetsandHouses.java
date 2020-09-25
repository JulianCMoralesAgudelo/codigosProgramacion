package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetsandHouses {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[15];

		int even = 0;
		int odd = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				even += array[i];
			} else {
				odd += array[i];
			}

		}

		if (even > odd) {
			System.out.println("Even-numbered houses have more residents.");
		} else {
			System.out.println("Odd-numbered houses have more residents.");
		}

	}
}
