// Fig. 3.10: LibroCalificaciones.java
// La clase LibroCalificaciones con un constructor para inicializar el nombre del curso.
public class LibroCalificaciones
{
	private String nombreDelCurso; // nombre del curso para este LibroCalificaciones
	private String nombreDelInstructor;
	
	// el constructor inicializa nombreDelCurso con el objeto String que se provee como argumento
	
	public LibroCalificaciones( String nombre )
	{
		nombreDelCurso = nombre; // inicializa nombreDelCurso
		nombreDelInstructor = nombre;
		} 	// fin del constructor
	// método para establecer el nombre del curso
	
	public void establecerNombreDelCurso( String nombre )
	{
		nombreDelCurso = nombre; // almacena el nombre del curso
		} 	// fin del método establecerNombreDelCurso
	
	// método para obtener el nombre del curso
	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
		} 	// fin del método obtenerNombreDelCurso
	
	
	public void establecerNombreDelInstructor (String nombre){
		nombreDelInstructor = nombre;
		}
	
	public String obtenerNombreDelInstructor(){
		return nombreDelInstructor;
		}
	
	// muestra un mensaje de bienvenida al usuario de LibroCalificaciones
	public void mostrarMensaje()
	{
		System.out.printf( "Bienvenido al Libro De Calificaciones para \n%s\n " + 
	"Este es un curso representado por \n%s\n", obtenerNombreDelCurso(), obtenerNombreDelInstructor());
		}// fin del método mostrarMensaje
	
} // fin de la clase LibroCalificaciones
