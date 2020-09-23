
// Java program to demonstrate  
// working of Collections.frequency() 
import java.util.*;

public class GFG {
	public static void main(String[] args) {
		// Let us create a list with 4 items
		ArrayList<String> list = new ArrayList<String>();
		list.add("code");
		list.add("code");
		list.add("quiz");
		list.add("code");

		// count the frequency of the word "code"
		System.out.println("The frequency of the word code is: " + Collections.frequency(list, "code"));
	}
}