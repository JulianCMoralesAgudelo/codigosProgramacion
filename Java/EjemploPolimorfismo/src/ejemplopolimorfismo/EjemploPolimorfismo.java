package ejemplopolimorfismo;
public class EjemploPolimorfismo {

	public static void main(String[] args) {
		Empleado emp = new Empleado("Julian",1400000);
		imprimirDetalles(emp);
		
		Gerente ger = new Gerente("Delgar",6000000,"Finanzas");
		imprimirDetalles(ger);
	}	
	
	//Obsebvemos que el tipo que recibe el metodo es de tipo padre.
	//Sin embargo al ejecutar el metodo, se ejecuta el hijo gerente.
	//Eso es el polimorfismo multiples formas en tiempo de ejecucion.
	
	private static void imprimirDetalles(Empleado emp) {
		System.out.println(emp.obtenerDetalles());;		
	}

}
