import java.util.Scanner;
import javax.swing.JOptionPane;

public class ImprimeNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0, n=0, variacion=0;
				
		//Leer dato
		System.out.println();
		n=Integer.parseInt((JOptionPane.showInputDialog("Por favor ingrese un dato entero")));
				
		/*
		//Recorro el cliclo while e imprimo el numero.
		while(i<=n){
	        JOptionPane.showMessageDialog(null, "Numero " + i);
			i++;
		}
		*/
		
		/*
		//Recorro el cliclo for e imprimo el numero.
		for(i=1;i<=n;i++){
			JOptionPane.showMessageDialog(null, "Numero " + i);
		}
		*/
		
		/*
		
		//Recorro el cliclo for e imprimo el numero.
		/*
		for(i=n;i>=1;i--){
			JOptionPane.showMessageDialog(null, "Numero " + i);
					}
		*/

		//Recorro el cliclo for e imprimo el numero.
		
		for(i=1;i<=n;i++){
			System.out.println(i);
		}
		
				
		

	}

}
