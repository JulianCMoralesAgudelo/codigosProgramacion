package PruebaTecnica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuArray {

	static ArrayList<String> nombres = new ArrayList<String>();
	static Scanner leer = new Scanner(System.in);
	static String menu = "Seleccione una opción: \n" + "1. Agregar nombre\n" + "2. Modificar nombre\n"
			+ "3. Eliminar nombre\n" + "4. Ordenar Ascedentemente\n" + "5. Ordenar Descedentemente\n"
			+ "6. Listar nombres\n" + "7. Salir\n";
	static String dato = "";
	static int opcion = 0;
	static boolean ok = false;
	static int contador = 0;

	public static void main(String[] args) {

		do {
			opcion = leerNumeros(JOptionPane.showInputDialog(null, menu));
			switch (opcion) {
			case 1:
				contador++;
				nombres.add(agregarNombre());
				break;
			case 2:
				modificarNombres();
				break;
			case 3:
				eliminarNombres();
				break;
			case 4:
				ordenarNombresAsc();
				break;
			case 5:
				ordenarNombresDes();
				break;
			case 6:
				listarNombres();
				break;

			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Opcion seleccionada no existe");
				break;
			}
		} while (opcion != 7);

	}

	static int leerNumeros(String dato) {
		ok = false;
		int numero = 0;
		do {
			if (dato == null) {
				System.exit(0);
			} else if (dato.equals("")) {
				dato = null;
			} else {
				try {
					numero = Integer.parseInt(dato);
					ok = true;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Por favor introduzca un numero..");
				}
			}
		} while (!ok && numero >= 0);
		return numero;
	}

	static String agregarNombre() {
		ok = false;
		String nombre;
		do {
			nombre = JOptionPane.showInputDialog(null, "Por favor introduzca un nombre..");
			if (nombre == null) {

			} else if (nombre.equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor introduzca un nombre..");
			} else {
				ok = true;
			}
		} while (!ok);
		return nombre;
	}

	static void modificarNombres() {
		ok = false;
		int persona;
		JOptionPane.showMessageDialog(null, "Escoja el numero correspondiente al nombre que desea modificar");
		do {
			listarNombres();
			persona = leerNumeros(JOptionPane.showInputDialog(null, "Por favor introduzca un numero.."));
			if (persona <= nombres.size() && persona >= 0) {
				nombres.set(persona, agregarNombre());
				ok = true;
			} else {
				JOptionPane.showMessageDialog(null, "Numero invalido..");
			}
		} while (!ok);
	}

	static void eliminarNombres() {
		ok = false;
		int persona;
		JOptionPane.showMessageDialog(null, "Escoja el numero correspondiente al nombre que desea modificar");
		do {
			listarNombres();
			persona = leerNumeros(JOptionPane.showInputDialog(null, "Por favor introduzca un numero.."));
			if (persona <= nombres.size() && persona >= 0) {
				nombres.remove(persona);
				ok = true;
			} else {
				JOptionPane.showMessageDialog(null, "Numero invalido..");
			}
		} while (!ok);
	}

	static void ordenarNombresAsc() {
		Collections.sort(nombres);
		listarNombres();
	}

	static void ordenarNombresDes() {
		Collections.sort(nombres);
		Collections.reverse(nombres);
		listarNombres();
	}

	static void listarNombres() {
		String lista = "";
		for (int i = 0; i < nombres.size(); i++) {
			lista += "Persona " + i + " nombre = " + nombres.get(i) + "\n";
		}
		JOptionPane.showMessageDialog(null, lista);
	}

}
