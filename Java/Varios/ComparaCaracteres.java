package practica;

import java.text.ParseException;
import java.util.Scanner;

public class ComparaCaracteres {

	// Leer dos datos numericos.
	// Verificar que son numeros enteros de tres digitos.
	// Dividir cada numero en los numeros que lo componen.
	// Comparar el ultimo digito de cada numero.
	// Si son iguales se logra el objetivo.
	// Si no lo son no se logra el objetivo.

	// variables de clase
	static final String pregunta = "\nIngrese un numero entero de tres digitos ";

	// Metodo para convertir cadena a numero
	public static int stringtoint(String s) {
		int num = 0;
		try {
			num = Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("\ndato no valido:\n");
			// System.out.print(pregunta);
			num = -1;
		}
		return num;
	}

	// Metodo para dividir el numero en digitos
	public static int[] CuentaDigitos(String s) {
		// Creo e inicalizo el arreglo en cero
		int[] digitos = new int[s.length()];
		for (int j = 0; j < s.length(); j++) {
			digitos[j] = 0;
		}
		int number = Integer.parseInt(s);
		int i = digitos.length - 1;
		while (number > 0) {
			digitos[i] = number % 10;
			number = number / 10;
			i--;
		}
		return digitos;
	}

	public static void main(String[] args) {

		// Declaracion e inicializacion de variables.
		Scanner in = new Scanner(System.in);
		boolean numeroCorrecto = false;
		String s = "";
		// Variables para almacenar los numero ingresados por digitos.
		int[] a = new int[3];
		int[] b = new int[3];
		// Variables para almacenar los numero ingresados por digitos.
		int dato = 0;

		// Lectura de datos y verificacion de datos.
		System.out.print("\nPrograma que compara el ultimo digito entre dos numeros de tres cifras cada uno\n");
		System.out.print(pregunta + "para el primer numero: ");
		do {
			s = in.nextLine();
			dato = stringtoint(s);
			if (s.length() == 3 && dato > 110 && dato < 1000 && (s != "")) {
				a = CuentaDigitos(s);
				System.out.println("Primer Dato correcto y almacenado.");
				numeroCorrecto = true;
				s = "";
			} else {
				System.out.println(pregunta + "para el primer numero: ");
			}
		} while (!numeroCorrecto);

		numeroCorrecto = false;
		System.out.print(pregunta + "para el segundo numero: ");

		do {
			s = in.nextLine();
			dato = stringtoint(s);
			if (s.length() == 3 && dato > 110 && dato < 1000 && (s != "")) {
				b = CuentaDigitos(s);
				System.out.println("Segundo Dato correcto y almacenado.");
				numeroCorrecto = true;
				s = "";
			} else {
				System.out.println(pregunta + "para el segundo numero: ");
			}
		} while (!numeroCorrecto);

		// Cierro el metodo de entrada de datos.
		in.close();

		System.out.println("");
		// Presentacion de datos.
		if (a[2] == b[2]) {
			System.out.println("El ultimo digito de los numemros ingresados es igual.\n");
			for (int i = 0; i < a.length; i++) {
				System.out.println("Dato a[" + i + "] = [" + a[i] + "]  y Dato b[" + i + "] = [" + a[i] + "]");
			}
		} else {
			System.out.println("El ultimo digito de los numemros ingresados no es igual.\n");
			for (int j = 0; j < b.length; j++) {
				System.out.println("Dato a[" + j + "] = [" + b[j] + "]  y Dato b[" + j + "] = [" + b[j] + "]");
			}
		}

	}
}
