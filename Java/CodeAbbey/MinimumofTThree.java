package retos;

import java.util.ArrayList;

public class MinimumofTThree {

	public static void main(String[] args) {

		String cadena = "20\r\n" + "7373585 3565624 8579304\r\n" + "4498312 86025 5177743\r\n"
				+ "-3449677 -489694 3064513\r\n" + "-5014602 -3709438 -9375734\r\n" + "7639117 -3125004 -7243685\r\n"
				+ "1834403 6996788 8523885\r\n" + "3915127 3227198 7022239\r\n" + "7186418 -9300571 2786387\r\n"
				+ "2209737 -5020013 4632563\r\n" + "7500073 -3513 1037025\r\n" + "8037166 -2629928 -5397350\r\n"
				+ "6616471 -8131616 4688675\r\n" + "1794214 -1581293 -5801019\r\n" + "-5141272 3404104 489542\r\n"
				+ "-4517006 1043222 7364538\r\n" + "-1760692 -7122374 4361327\r\n" + "-3236806 6792752 -2411475\r\n"
				+ "-6214567 3979171 -1712046\r\n" + "6571820 -3811092 3267941\r\n" + "1204383 -6311018 -6735572";
		String patron = cadena.replaceAll("\r\n", " ");
		String[] partes = patron.split("\\s+");
		int length = partes.length;		
		ArrayList<Integer> Lista = new ArrayList<Integer>();
		ArrayList<Integer> Listb = new ArrayList<Integer>();
		ArrayList<Integer> Listc = new ArrayList<Integer>();
		
		for (int i = 1, cont = 1; i < partes.length; i++, cont++) {
			if (cont == 1) {
				Lista.add(Integer.parseInt(partes[i]));
			} else if (cont == 2) {
				Listb.add(Integer.parseInt(partes[i]));
			} else if (cont == 3) {
				Listc.add(Integer.parseInt(partes[i]));
				cont = 0;
			}
		}

		for (int i = 0; i < partes.length / 3; i++) {
			if (Lista.get(i) < Listb.get(i) && Lista.get(i) < Listc.get(i)) {
				System.out.print(Lista.get(i) + " ");
			} else if (Listb.get(i) < Lista.get(i) && Listb.get(i) < Listc.get(i)) {
				System.out.print(Listb.get(i) + " ");
			} else if (Listc.get(i) < Lista.get(i) && Listc.get(i) < Listb.get(i)) {
				System.out.print(Listc.get(i) + " ");
			}
		}
	}
	/*
	 * min=a; if(min>b) min=b; if(min>c) min=c; // output min
	 */

}
