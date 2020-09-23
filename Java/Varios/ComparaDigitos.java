package practica;

import java.util.Scanner;

public class ComparaCaracteres {

	public static void main(String[] args) {
		// Declaracion e inicializacion de variables.
		Scanner in = new Scanner(System.in);
		System.out.println("Programa que compara si el ultimo digito de dos numeros de tres digitos\n");
		boolean numeroCorrecto = false;
		int contador = 0;
		int a = 0, b = 0;
		String s = "";
		String s1 = "";

		// Lectura de datos
		do {
			if (contador == 0) {
				System.out.println("Ingrese un numero entero de tres digitos: ");
				s = in.nextLine();
				try {					
					a = Integer.parseInt(s);	
					while (s.length() > 3) {
						System.out.println("Ingrese un numero entero de tres digitos: ");
						numeroCorrecto = true;
						contador++;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Ingrese un numero entero de tres digitos: ");
					contador = 0;
				}
			}
			if (contador == 1) {
				System.out.println("Ingrese un numero entero de tres digitos: ");
				s1 = in.nextLine();
				try {
					while (s1.length() > 3) {
						System.out.println("Ingrese un numero entero de tres digitos: ");
						s1 = in.nextLine();
						numeroCorrecto = true;
						b = Integer.parseInt(s);
						contador++;
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Ingrese un numero entero de tres digitos: ");
					contador = 1;
				}
			}

		}while(!numeroCorrecto&&contador==2);

	// Manipulacion y presnetacion de datos.
	System.out.println("Los numeros ingresados fueron: "+s+" de "+s.length()+" cifras y "+s1+" de "+s.length()+" cifras.");

	// Declaracion e inicializacion de variables.
	char[] dato = s.toCharArray();
	char[] dato1 = s1.toCharArray();

	if(dato[2]==dato1[2])
	{
		System.out.println("El ultimo digito es el mismo.\nhasta luego");
	}else
	{
		System.out.println("El ultimo digito no es el mismo. \nhasta luego");

	}

	in.close();
}

}
