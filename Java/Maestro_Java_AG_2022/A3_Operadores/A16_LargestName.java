public class A16_LargestName {	

	public static void main(String[] args) {

		// Limpiar consola
		System.out.print("\033\143");

		/*
		 * Obtener el nombre mas largo de tres personas, según los siguientes
		 * requerimientos
		 * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres
		 * miembros de la familia o amigos
		 * usando la clase JOptionPane y método showInputDialog().
		 * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en
		 * cantidad de caracteres)
		 * (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
		 * Podría usar .split(" "); del objeto String para separar nombre y apellido en
		 * un arreglo, y con el indice cero
		 * accedemos al nombre de la persona.
		 * Restricción no usar loops en el desarrollo de la tarea.
		 * Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
		 */

		// Declarar variables
		String[] nombres = { "Julian Camilo Morales Agudelo", "Yisela Maria Guzmán Morales",
				"Ana Gilma Agudelo Berrio" };
		String largestName;

		// Procesar datos
		largestName = nombres[0].length() > nombres[1].length() ? nombres[0] : nombres[1];
		largestName = largestName.length() > nombres[2].length() ? largestName : nombres[2];
		
		// Resultados
		System.out.println(largestName);

	}
}