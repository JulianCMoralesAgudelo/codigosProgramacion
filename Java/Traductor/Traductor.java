import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Traductor {

	/*
	 * Para facilitar el envío y validación de datos el cliente desea que dado un
	 * número en caracteres numéricos o cadena de texto se pueda obtener como salida
	 * su versión en 7 segmentos. De esa manera el cliente expone los siguientes
	 * requisitos funcionales:
	 * 
	 */

	static String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	static String[] numEspa = { "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve" };
	static String[] numIngles = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	static String[][] matriz = new String[7][7];

	public static void main(String[] args) throws IOException {

		// 1. A la aplicación se le puede ingresar datos de tipo numérico o texto.
		// 2. El programa solo soporta los números del 0(cero) al 9(nueve).
		// 3. Los caracteres de texto pueden ser ingresados en inglés o español.

		// Declaracion e inicializacion de variables

		// Lector de datos.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println(
					"Enter a number between 0-1 or press enter to exit:" + "\nIngrese un numero entre 0-1 o presione enter para salir:");
			String s = reader.readLine();
			imprimirDato(s);
			if (s.isEmpty()) {
				break;
			}
		}

	}

	// Validar cadena
	public static void imprimirDato(String s) {

		for (int i = 0; i < numIngles.length; i++) {
			if ((s).equalsIgnoreCase(numeros[i]) || (s).equalsIgnoreCase(numEspa[i])
					|| (s).equalsIgnoreCase(numIngles[i])) {
				try {
					patrones(numeros[i]);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		}

	}
	
	public static void patrones(String s) {
		switch (s) {
		case "0":
			inicializar();
			matriz[0][3] = " _____ ";
			matriz[1][3] = "|     |";
			matriz[2][3] = "|     |";
			matriz[3][3] = "|     |";
			matriz[4][3] = "|     |";
			matriz[5][3] = "|_____|";
			imprimir(matriz);
			break;

		case "1":
			inicializar();
			matriz[0][3] = "   |   ";
			matriz[1][3] = "   |   ";
			matriz[2][3] = "   |   ";
			matriz[3][3] = "   |   ";
			matriz[4][3] = "   |   ";
			matriz[5][3] = "___|___";
			imprimir(matriz);
			break;
		case "2":
			inicializar();
			matriz[0][1] = " ______";
			matriz[1][4] = "       |";
			matriz[2][4] = "       |";
			matriz[3][2] = " ______|";
			matriz[5][1] = "|";
			matriz[6][1] = "|";
			matriz[6][3] = "|______";
			imprimir(matriz);
			break;
		case "3":
			inicializar();
			matriz[0][1] = " _____";
			matriz[1][4] = "      |";
			matriz[2][4] = "      |";
			matriz[3][2] = " _____|";
			matriz[5][1] = "      |";
			matriz[6][1] = "      |";
			matriz[6][3] = " _____|";
			imprimir(matriz);
			break;
		case "4":
			inicializar();
			matriz[1][3] = "|     |";
			matriz[2][3] = "|     |";
			matriz[3][3] = "|_____|";
			matriz[5][1] = "      |";
			matriz[6][1] = "      |";
			matriz[6][2] = "      |";
			imprimir(matriz);
			break;
		case "5":
			inicializar();
			matriz[0][1] = " _____";
			matriz[2][4] = "|";
			matriz[3][1] = "|";
			matriz[3][2] = "|_____";
			matriz[5][1] = "      |";
			matriz[6][1] = "      |";
			matriz[6][3] = " _____|";
			imprimir(matriz);
			break;
		case "6":
			inicializar();
			matriz[0][3] = " _____";
			matriz[1][3] = "|";
			matriz[2][3] = "|";
			matriz[3][3] = "|_____";
			matriz[5][1] = "|     |";
			matriz[6][1] = "|     |";
			matriz[6][3] = "|_____|";
			imprimir(matriz);
			break;
		case "7":
			inicializar();
			matriz[0][3] = " _____";
			matriz[1][3] = "      |";
			matriz[2][3] = "      |";
			matriz[3][3] = "  ____|";
			matriz[5][1] = "      |";
			matriz[6][1] = "      |";
			matriz[6][3] = "      |";
			imprimir(matriz);
			break;
		case "8":
			inicializar();
			matriz[0][3] = " _____";
			matriz[1][3] = "|     |";
			matriz[2][3] = "|     |";
			matriz[3][3] = "|_____|";
			matriz[5][1] = "|     |";
			matriz[6][1] = "|     |";
			matriz[6][3] = "|_____|";
			imprimir(matriz);
			break;
		case "9":
			inicializar();
			matriz[0][3] = " _____";
			matriz[1][3] = "|     |";
			matriz[2][3] = "|     |";
			matriz[3][3] = "|_____|";
			matriz[5][1] = "      |";
			matriz[6][1] = "      |";
			matriz[6][3] = " _____|";
			imprimir(matriz);
			break;

		default:
			break;
		}
	}

	public static void inicializar() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = "";
			}
		}
	}

	public static void imprimir(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (!(matriz[i][j].equals(""))) {
					if (matriz[i][j].equals("__")) {
						System.out.print(matriz[i][j]);
					} else {
						System.out.println(matriz[i][j]);
					}

				}
			}
		}
		System.out.println();
	}

}
