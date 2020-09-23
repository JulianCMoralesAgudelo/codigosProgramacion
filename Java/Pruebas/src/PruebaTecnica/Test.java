package PruebaTecnica;

public class Test {
	public static void main(String[] args) {

		displayClosestToTen(8, 11);
		displayClosestToTen(7, 14);

	}

	public static void displayClosestToTen(int a, int b) {
		// write your code here.
		int aSub = 10 - a;
		int bSub = 10 - b;
		int aAbs = abs(aSub);
		int bAbs = abs(bSub);
		if ((aAbs) > (bAbs)) {
			System.out.println(b + " is  closer  to  10");
		} else {
			System.out.println(a + " is closer to 10");
		}
	}

	public static int abs(int a) {
		if (a < 0) {
			return -a;
		} else {
			return a;
		}
	}
}
