public class SoloLetras {
 
	/**
	 * Metodo para comprobar si los caracteres introducidos en una cadena son
	 * SOLO letras o no.
	 * @param cadena String a comprobar
	 * @return true si solo contiene letras, false en caso contrario
	 */
	static boolean esSoloLetras(String cadena)
	{
		//Recorremos cada caracter de la cadena y comprobamos si son letras.
		//Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
		//Si está fuera del rango 65 - 90, es que NO son letras.
		//Para ser más exactos al tratarse del idioma español, tambien comprobamos
		//el valor 165 equivalente a la Ñ
 
		for (int i = 0; i < cadena.length(); i++)
		{
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
				return false; //Se ha encontrado un caracter que no es letra
		}
 
		//Terminado el bucle sin que se hay retornado false, es que todos los caracteres son letras
		return true;
	}
 
	/**
	 * Sencilla clase que hereda de Exception para crear una excepcion
	 * que avise en el caso de que la cadena contenga caracteres que no son letras
	 */
	static class NoEsLetraExcepcion extends Exception{
 
		public NoEsLetraExcepcion(String mensajeExcepcion) {
			super(mensajeExcepcion);
		}
 
	}
 
	/**
	 * Metodo que pide cadenas al usuario y comprueba si contiene solo letras o no.
	 * @return String introducido por el usuario que solo contenga letras o que sea cadena vacía.
	 * @throws NoEsLetraExcepcion Excepcion en el caso de encontrar caracteres que no sean letras.
	 */
	static String pedirCadenaLetras() throws NoEsLetraExcepcion
	{
		Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
		if (esSoloLetras(cadena) || cadena.isEmpty()) //Para este caso, aceptamos cadena vacía como válida
			return cadena;
		else
			throw new NoEsLetraExcepcion("La cadena contiene caracteres que NO son letras");
	}
 
	public static void main(String[] args) {
 
		String cadena = " ";
 
		while (!cadena.isEmpty())
		{
			System.out.print("Introduzca cadena a comprobar (Cadena vacia = FIN): ");
			//Pedimos cadenas usando nuestro método que lanzará excepcion si encuentra caracteres
			//que no sean letras.
			try {
				cadena = pedirCadenaLetras();
				if (!cadena.isEmpty())
					System.out.println("La cadena contiene SOLO letras\n");
			}catch(NoEsLetraExcepcion ex) {
				System.out.println(ex.getMessage() + "\n");
			}
		}
 
		System.out.println("\n\t\tFIN DE PROGRAMA");
 
	}
 
}