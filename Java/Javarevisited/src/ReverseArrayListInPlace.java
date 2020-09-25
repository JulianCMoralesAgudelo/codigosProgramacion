import java.util.ArrayList;
import java.util.List;

/* * Java Program to reverse an ArrayList in place. 
 * * When you reverse ArrayList in place, you are not 
 * * allowed to use additional buffer e.g. an array 
 * * or any collection. */

public class ReverseArrayListInPlace {
	public static void main(String[] args) {
		// Let's create a list of foods which helps
		// to lose weight, one of the prime concern programmers
		List<String> listOfFood = new ArrayList<>();
		listOfFood.add("Beans");
		listOfFood.add("Soup");
		listOfFood.add("Dark Chocolate");
		listOfFood.add("Yogurt");
		listOfFood.add("Sausage");
		listOfFood.add("Pure Vegetables");
		listOfFood.add("Nuts");
		System.out.println("Original ArrayList: " + listOfFood);

		// let's now reverse the list in place in Java
		int size = listOfFood.size();
		for (int i = 0; i < size / 2; i++) {
			final String food = listOfFood.get(i);
			listOfFood.set(i, listOfFood.get(size - i - 1));
			// swap
			listOfFood.set(size - i - 1, food); // swap
		}

		System.out.println("Reversed ArrayList: " + listOfFood);

	}

}
