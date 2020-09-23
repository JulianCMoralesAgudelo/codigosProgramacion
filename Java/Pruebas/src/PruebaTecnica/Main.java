package PruebaTecnica;

public class Main {

	public static void main(String[] args) {
		int i = 234;
		byte b = (byte) i;
		System.out.println(b); // -22
		int i2 = b & 0xFF;
		System.out.println(i2); // 234
	}

}
