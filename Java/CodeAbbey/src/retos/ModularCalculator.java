package retos;

import java.math.BigInteger;

public class ModularCalculator {

	public static void main(String[] args) {
		String cadena = "6275\r\n" + "* 4\r\n" + "* 97\r\n" + "* 3097\r\n" + "+ 451\r\n" + "* 40\r\n" + "* 2567\r\n"
				+ "* 90\r\n" + "+ 2826\r\n" + "* 836\r\n" + "* 83\r\n" + "* 87\r\n" + "* 43\r\n" + "+ 380\r\n"
				+ "+ 3\r\n" + "* 7514\r\n" + "* 6\r\n" + "* 10\r\n" + "* 82\r\n" + "+ 81\r\n" + "* 15\r\n" + "* 12\r\n"
				+ "+ 561\r\n" + "* 1413\r\n" + "* 150\r\n" + "* 10\r\n" + "+ 1\r\n" + "+ 201\r\n" + "+ 4538\r\n"
				+ "* 71\r\n" + "* 9828\r\n" + "+ 27\r\n" + "* 903\r\n" + "* 856\r\n" + "* 4334\r\n" + "* 69\r\n"
				+ "* 991\r\n" + "+ 62\r\n" + "* 5\r\n" + "+ 780\r\n" + "+ 6833\r\n" + "+ 100\r\n" + "+ 7102\r\n"
				+ "+ 3\r\n" + "* 3\r\n" + "+ 2906\r\n" + "+ 9\r\n" + "* 110\r\n" + "+ 2\r\n" + "+ 7\r\n" + "% 7702";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");	

		BigInteger n = BigInteger.ZERO;

		n = n.add(BigInteger.valueOf(Long.parseLong(partes[0])));

		// Suma
		// n = n.add(BigInteger.valueOf(9));
		// Resta
		// n = n.subtract(BigInteger.valueOf(4));
		// Multiplicacion
		// n = n.multiply(BigInteger.valueOf(10));
		// División
		// n = n.divide(BigInteger.valueOf(2));

		for (int i = 0; i < partes.length; i++) {

			if (partes[i].equalsIgnoreCase("+")) {
				n = n.add(BigInteger.valueOf(Long.parseLong(partes[i + 1])));
			} else if (partes[i].equalsIgnoreCase("*")) {
				n = n.multiply(BigInteger.valueOf(Long.parseLong(partes[i + 1])));
			} else if (partes[i].equalsIgnoreCase("%")) {
				n = n.mod(BigInteger.valueOf(Long.parseLong(partes[i + 1])));
			}
		}

		System.out.println(n);

	}

}

/*
 * public static void main(String[] args) { final Pattern pOperation =
 * Pattern.compile("[+*%]"); Scanner sc = new Scanner(System.in); BigInteger
 * result = BigInteger.valueOf(sc.nextLong());
 * 
 * while (true) { String operation = sc.next(pOperation); BigInteger operand =
 * BigInteger.valueOf(sc.nextLong());
 * 
 * switch (operation) { case "+": result = result.add(operand); break;
 * 
 * case "*": result = result.multiply(operand); break;
 * 
 * case "%": System.out.println(result.mod(operand)); return; } } }
 */
