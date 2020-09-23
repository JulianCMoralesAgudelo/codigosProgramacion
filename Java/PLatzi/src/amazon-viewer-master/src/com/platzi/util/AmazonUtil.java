package com.platzi.util;

import java.util.Scanner;

public class AmazonUtil {
	public static int validateUserResponseOptionMenu(int oMin, int oMax, String message) {
		Scanner sc = new Scanner(System.in);
		int responseOption;
		
		do {
			System.out.print(message);
			while (!sc.hasNextInt()) {
				System.out.println("No es un número!");
				System.out.print(message);
				sc.next(); // esto es importante!
			}
			responseOption = sc.nextInt();
			if (!(responseOption >= oMin && responseOption <= oMax)) System.out.println("Opción inválida !!");
		} while (responseOption < oMin || responseOption > oMax);
		
		return responseOption;
	}
	
	public static void seenThread() {
		try {
			byte min = 1, max = 5;
			long num_random = (long) Math.floor(Math.random() * (max - min + 1)) + min;
			Thread.sleep(num_random * 1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}