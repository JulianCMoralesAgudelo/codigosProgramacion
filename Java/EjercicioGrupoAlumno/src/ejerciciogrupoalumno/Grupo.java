package ejerciciogrupoalumno;

public class Grupo {
	
	private Alumno[] alumnos = null;
	
	//Consructor.
	public Grupo(){
	alumnos= new Alumno[5];
	
	for (int i = 0; i < alumnos.length; i++) {
		alumnos[i]= new Alumno();
		}
	}
}
