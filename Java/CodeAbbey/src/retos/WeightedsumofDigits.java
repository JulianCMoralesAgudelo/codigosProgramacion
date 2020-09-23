package retos;

public class WeightedsumofDigits {


	public static void main(String[] args) {
		String cadena = "39\r\n"
				+ "723182 550594 40 24845053 8265986 216255677 54112215 903 534 67726804 30554266 10232889 972543 514427668 75055 573 64747 86421 222118 32714937 50452 352 171468 236163 119218225 6279 64954687 174888556 3670 31 4 135 12713 5 3 89758 27667856 1 19434";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");		

		for (int i = 1; i < partes.length; i++) {
			System.out.print(cifras(partes[i]) + " ");
		}
	}

	public static int cifras(String numero) {
		int suma = 0;
		for (int i = 1; i <= numero.length(); i++) {
			suma += Integer.parseInt(numero.charAt(i - 1) + "") * i;
		}

		return suma;
	}

}
