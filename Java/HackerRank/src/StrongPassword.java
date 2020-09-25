import java.util.regex.Matcher;

public class StrongPassword {

	public static void main(String[] args) {
		// Recibo la cadena desde el navegador
		String s = "11\r\n" + "#HackerRank";	
		// Se elminan espacios
		String patron = s.replaceAll("\r\n", " ");
		// Se Crea array con los componentes de la cadena
		String[] partes = patron.split("\\s+");
		// Se envia el indice del array a la funcion para imprimir si este cumple los requerimientos. 
		System.out.println(checkPass(partes[1]));

	}
	// Chequeo de clave.
	private static int checkPass(String password) {
		// Contador de requisitos.
		int count = 0;
		// Verifica que existan letras minusculas en la cadena.
		if (!password.matches(".*[a-z].*")) {
			count++;
		}
		// Verifica que existan letras mayusculas en la cadena.
		if (!password.matches(".*[A-Z].*")) {
			count++;
		}
		// Verifica que existan numeros en la cadena.
		if (!password.matches(".*[0-9].*")) {
			count++;
		}
		// Verifica que existan caracteres especiales en la cadena.
		if (password.matches("[a-zA-Z0-9]*")) {
			count++;
		}
		// Compara que longitud de la cadena cumpla los requerimientos de una clave segura.
		int lengthDifference = 6 - password.length();
 
		if (lengthDifference > 0 && count <= lengthDifference) {
			return lengthDifference;
		}

		return count;
	}

}
