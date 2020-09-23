package retos;

import java.util.ArrayList;

public class MinimumofTwo {

	public static void main(String[] args) {
		String cadena = "27\r\n" + "-904182 -5364597\r\n" + "-3993739 -5360772\r\n" + "6466818 -257015\r\n"
				+ "-5455779 -5122879\r\n" + "1085742 8536084\r\n" + "9512900 2915973\r\n" + "3438426 -7590607\r\n"
				+ "-4906108 8032616\r\n" + "2176148 -3990275\r\n" + "7082659 -3202324\r\n" + "-8225068 6050369\r\n"
				+ "7369108 -325509\r\n" + "-6967216 -5330656\r\n" + "-1813530 -4873090\r\n" + "5112585 1278940\r\n"
				+ "9082091 -5791596\r\n" + "5914342 -4911647\r\n" + "-1152369 2381160\r\n" + "4831337 3391852\r\n"
				+ "7258281 -4082921\r\n" + "1927937 6771182\r\n" + "8833051 -4633637\r\n" + "9180574 -6073056\r\n"
				+ "-6601020 1356723\r\n" + "-63332 -9518361\r\n" + "8154399 1711600\r\n" + "6532008 5523508";
		String[] numerosSeparados = cadena.split("\\s+");
		int length = numerosSeparados.length;
		ArrayList<Integer> array_a = new ArrayList<Integer>(length / 2);
		ArrayList<Integer> array_b = new ArrayList<Integer>(length / 2);

		for (int i = 1; i < length; i++) {
			if (i % 2 == 0) {
				array_a.add(Integer.parseInt(numerosSeparados[i]));
			} else {
				array_b.add(Integer.parseInt(numerosSeparados[i]));
			}
		}

		for (int i = 0; i < array_a.size(); i++) {
			System.out.print((array_a.get(i) < array_b.get(i)) ? array_a.get(i) + " " : array_b.get(i) + " ");
		}
	}

	public static int minimo(int numero1, int numero2) {
		int menor = (numero1 < numero2) ? numero1 : numero2;
		return menor;
	}
}

/*
 * 6094012 1791328 -2259541 -4458147 -6645769 -3072744 -8765196 -2227273 1677493
 * -6837021 -5403040 -3122009 -2192087 -5741378 -7603750 -1840178 -9538842
 * -9858528 3188893 -4316676
 * 
 */
