package promedios;

import javax.swing.JOptionPane;

public class ResultadosPromedio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solictud de datos.
		JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad de estudiantes a evaluar");
		int cantEstu=Integer.parseInt(JOptionPane.showInputDialog(null));
		double[] prom = new double[cantEstu];
		String[] nom = new String[cantEstu];

		// Ingreso de datos.
		for (int i=0;i<cantEstu;i++){
			nom[i]=JOptionPane.showInputDialog("Por favor ingrese el nombre del estudiante No: " + (i+1));
			prom[i]=Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el promedio del estudiante No: " + (i+1)));			
		}
		
		//Filtro de la informacion.
		JOptionPane.showMessageDialog(null, "Este es el resultado de la informacion ingresada.");
		
		JOptionPane.showMessageDialog(null, "Los estudiantes pesimos son:");
		for (int i=0;i<cantEstu;i++){
			if(prom[i]<=1){
				JOptionPane.showMessageDialog(null, "Nombre: " + nom[i] + " Promedio: " + prom[i]);
			}			
		}
		
		JOptionPane.showMessageDialog(null, "Los estudiantes malos son:");
		for (int i=0;i<cantEstu;i++){
			if(prom[i]>1 && prom[i]<=3){
				JOptionPane.showMessageDialog(null, "Nombre: " + nom[i] + " Promedio: " + prom[i]);
			}			
		}
		
		JOptionPane.showMessageDialog(null, "Los estudiantes regulares son:");
		for (int i=0;i<cantEstu;i++){
			if(prom[i]>3 && prom[i]<=3.5){
				JOptionPane.showMessageDialog(null, "Nombre: " + nom[i] + " Promedio: " + prom[i]);
			}			
		}
		
		JOptionPane.showMessageDialog(null, "Los estudiantes buenos son:");
		for (int i=0;i<cantEstu;i++){
			if(prom[i]>3.5 && prom[i]<=4.5){
				JOptionPane.showMessageDialog(null, "Nombre: " + nom[i] + " Promedio: " + prom[i]);
			}			
		}
		
		JOptionPane.showMessageDialog(null, "Los estudiantes excelentes son:");
		for (int i=0;i<cantEstu;i++){
			if(prom[i]>4.5){
				JOptionPane.showMessageDialog(null, "Nombre: " + nom[i] + " Promedio" + prom[i]);
			}			
		}		
	}
}




