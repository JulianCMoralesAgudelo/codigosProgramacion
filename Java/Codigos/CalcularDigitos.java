package practica;

// Forma matematica de obtener los digitos de un numero N en cualquier base de numeracion K

public class CalcularDigitos {

	public static void main(String[] args) {
		int number = 1234;
		System.out.println("El numero " + (int) number + " tiene " + getDigits(number, 10) + " digitos");
	}

	public static int getDigits(int number, int base) {
		return (int) (Math.floor(Math.log10(number) / Math.log10(base)) + 1);
	}
}