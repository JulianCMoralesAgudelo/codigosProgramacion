/**
 * Condicionales.
 *
 * @author Julian Morales
 */

/*
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) 
 * 40 horas trabajadas ganara 391
 * De pagan a 10 euros la hora. A partir de la hora 41.
 * Entre 31 y 39 horas trabajadas se descuenta 10 dolares por cada horas no trabajada.
 * Menos de 31 se descuenta 10 dolares por cada horas no trabajada y se despide.
 */

package practica;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HorasTrabajadas {

	// Metodo para validar datos numericos ingresados.
	static boolean validarNumeroInt(String s) {
		try {
			int a = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("El dato no es valido o numerico."); //
			return false;
		} catch (InputMismatchException e) {
			System.out.println("El dato no es valido o numerico.");
			return false;
		} catch (NoSuchElementException e) {
			System.out.println("El dato no es valido o numerico.");
			return false;
		} catch (Exception e) {
			System.out.println("El dato no es valido o numerico.");
			return false;
		}
	}

	public static void main(String[] args) {

		// Declaracion e inicializacion de variables.
		Scanner sc = new Scanner(System.in);
		String s = "";
		boolean numeroCorrecto = false;
		int horas = 0;
		double salario = 0;

		// inicio
		System.out.println("Programa que calula el salario a partir de las horas trabajadas por semana.: ");

		// Lectura de datos
		do {
			System.out.println("\nPor favor ingrese las horas trabajadas de esta semana: ");
			s = sc.nextLine();
			if (validarNumeroInt(s)) {
				horas = Integer.parseInt(s);
				numeroCorrecto = true;
			} else {
				numeroCorrecto = false;
			}
		} while (!numeroCorrecto);

		// Presentacion de datos

		if (horas == 40) {
			salario = 391;
			System.out.println("Su salario para esta semana es por total de: " + salario);
		} else if (horas > 40) {
			salario = (horas - 40) * 10 + 391;
			System.out.println("Su salario para esta semana es por total de: " + salario);
		} else if (horas >= 31 && horas <= 39) {
			salario = 391 - (40 - horas) * 10;
			System.out.println("Su salario para esta semana es por total de: " + salario);
		} else if (horas <= 31) {
			salario = 391 - (40 - horas) * 10;
			System.out.println("Su salario para esta semana es por total de: " + salario);
			System.out.println("Se le informa que su contrato ha sido terminado por bajo rendimiento y productividad");
		}

		sc.close();

	}

}
