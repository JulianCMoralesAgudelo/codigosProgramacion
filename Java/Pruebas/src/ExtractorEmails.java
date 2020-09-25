import java.util.regex.Matcher;
import java.util.regex.Pattern;

// http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java

public class ExtractorEmails {

	public static void main(String[] args) {
		String entrada = "<p>hola@pedro.com</p><br>\n";
		entrada += "kk@tres.tris///pepe@eso.es";

		Pattern limpiar = Pattern.compile("([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)");
		Matcher buscar = limpiar.matcher(entrada);
		while (buscar.find())
			System.out.println(buscar.group(1));
	}

}
