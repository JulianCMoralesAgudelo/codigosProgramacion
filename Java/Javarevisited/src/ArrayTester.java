
public class ArrayTester {

	public static void main(String[] args) {
		// how to loop over an integer array
		int[] primes = { 2, 3, 5, 7, 11, 13, 17 };
		// looping using for loop
		System.out.println("looping over an array using for loop");
		for (int i = 0; i < primes.length; i++) {
			System.out.println("current element is: " + primes[i]);
		}
		// looping using enhanced for loop of Java 5
		System.out.println("looping over an array using enhanced for loop");
		for (int number : primes) {
			System.out.println(number);
		}
	}
}
