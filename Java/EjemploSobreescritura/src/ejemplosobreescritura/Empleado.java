package ejemplosobreescritura;

public class Empleado {
	
	//Atributos de clase
	protected String nombre;
	protected double sueldo;
	
	//Constructor
	protected Empleado(String nombre,double sueldo){
		this.nombre=nombre;//Asigno el parametro recibido como nombre al atributo nombre de la clase.
		this.sueldo=sueldo;//Asigno el parametro recibido como sueldo al atributo sueldo de la clase.		
	}
	
	//Metodo Obtener detalles
	public String obtenerDetalles(){
		return "Nombre: " + nombre +
				", sueldo: " + sueldo;
		}
	//Getters && Setters || Accesor && Mutators.
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public double getSueldo(){
		return sueldo;
	}
	
	public void setSueldo(double sueldo){
		this.sueldo=sueldo;
	}
}
