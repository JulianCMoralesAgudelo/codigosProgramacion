package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ArithmeticMean {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		double prom = 0;
		int cont = 0;

		while (a != -1) {
			a = Integer.parseInt(br.readLine());
			prom += a;
			cont++;
		}
		prom++;
		cont += a;
		prom /= cont;

		//System.out.printf("El número originalmente es: %f\n", prom);
		double parteDecimal = prom % 1; // Lo que sobra de dividir al número entre 1
		double parteEntera = prom - parteDecimal; // Le quitamos la parte decimal usando una resta
		//System.out.printf("Parte entera: %f. Parte decimal: %f\n", parteEntera, parteDecimal);

		DecimalFormat df = new DecimalFormat("#.#");
		df.format(parteEntera + parteDecimal);
		System.out.println(df.format(parteEntera + parteDecimal));

	}

}
