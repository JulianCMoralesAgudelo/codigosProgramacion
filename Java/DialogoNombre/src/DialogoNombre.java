// Fig. 3.18: DialogoNombre.java
// Entrada básica con un cuadro de diálogo.
import javax.swing.JOptionPane;
public class DialogoNombre
{
	public static void main( String args[] )
	{
		// 	pide al usuario que escriba su nombre
		String nombre =JOptionPane.showInputDialog( "Cual es su nombre?" );
		// crea el mensaje
		String mensaje = String.format( "Bienvenido, %s, a la programacion en Java!", nombre );
		// muestra el mensaje para dar la bienvenida al usuario por su nombre
		JOptionPane.showMessageDialog( null, mensaje );
	} // fin de main
} // fin de la clase DialogoNombre