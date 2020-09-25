package arrays;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class GFG {

	// Generic function to convert List of
	// String to List of Integer
	public static <T, U> List<U> convertStringListToIntList(List<T> listOfString, Function<T, U> function) {
		return listOfString.stream().map(function).collect(Collectors.toList());
	}

	public static void main(String args[]) {

		// Create a list of String
		List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5");

		// Print the list of String
		System.out.println("List of String: " + listOfString);

		// Convert List of String to list of Integer
		List<Integer> listOfInteger = convertStringListToIntList(listOfString, Integer::parseInt);

		// Print the list of Integer
		System.out.println("List of Integer: " + listOfInteger);
	}
}