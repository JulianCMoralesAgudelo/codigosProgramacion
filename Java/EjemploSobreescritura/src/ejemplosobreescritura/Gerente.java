package ejemplosobreescritura;

public class Gerente extends Empleado{
	//Atributos de clase
	private String departamento;
	
	//Constructor
	public Gerente(String nombre,double sueldo,String departamento){
		super(nombre,sueldo);//Hacemos uso del constructor de tipo protected de la clase padre.
		this.departamento=departamento;//Asignamos el parametro departamento al atributo de esta clase
	}
	
	//Sobre escribimos el metodo padre heredado
	public String obtenerDetalles(){
		//Observar como accedemos directamente al atributo heredado
		//debido a que se declaro como protected en la clase padre
		//y por tanto la clase hija lo hereda y accede directamente.
		return "Nombre: " + nombre + 
				", sueldo: " + sueldo +
				", departamento: " + departamento;
		}

	//Getters && Setters || Accesor && Mutators.
	public String getDepartamento(){
		return departamento;
	}
	
	public void setDepartamento(String departamento){
		this.departamento=departamento;
	}
}
