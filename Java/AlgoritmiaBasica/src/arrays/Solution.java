package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) throws IOException {

		// String [] customers ;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> customers = new ArrayList<>();

		for (int i = 0; i < customersCount; i++) {
			String customersItem = bufferedReader.readLine();
			customers.add(customersItem);
		}

		List<String> result = Result.mostActive(customers);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(result.get(i));

			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
		System.out.println("Hello");
	}

	

	static class Result {

		/*
		 * Complete the 'mostActive' function below.
		 *
		 * The function is expected to return a STRING_ARRAY. The function accepts
		 * STRING_ARRAY customers as parameter.
		 */

		public static List<String> mostActive(List<String> customers) {

			for (int i = 0; i < customers.size(); i++) {
				System.out.println(customers.get(i));
			}
			return customers;
		}

		// Write your code here

	}

}
