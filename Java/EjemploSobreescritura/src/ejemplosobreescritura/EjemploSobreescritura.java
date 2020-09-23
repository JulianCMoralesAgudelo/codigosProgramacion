package ejemplosobreescritura;

public class EjemploSobreescritura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado("Julian",1400000);
		System.out.println(empleado.obtenerDetalles());
		
		Gerente gerente = new Gerente("Delgar",6000000,"Gerente Operativo y Finanzas");
		System.out.println(gerente.obtenerDetalles());
		}
	}
