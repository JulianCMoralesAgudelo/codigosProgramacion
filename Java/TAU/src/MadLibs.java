import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {

		// 1. Get the season of the year
		System.out.println("Enter one season of the year.");
		Scanner scanner = new Scanner(System.in);
		String season = scanner.nextLine();

		// 2. Get the whole number
		int number = scanner.nextInt();

		// 2. Get the adjetive
		String adjetive = scanner.nextLine();

		System.out
				.println("On a" + adjetive + " " + season + " day, I drink a minimun of " + number + " cups of coffee");
	}

}
