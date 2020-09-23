package cine;

public class Pelicula {

	// Atrubutos.

	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	// Constructor.
	public Pelicula(String titulo, int duracion, int edadMininma, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMininma;
		this.director = director;
	}

	// Metodos.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMininma() {
		return edadMinima;
	}

	public void setEdadMininma(int edadMininma) {
		this.edadMinima = edadMininma;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "'" + titulo + "' del director " + director + ", con una duracion de " + duracion
				+ " minutos y la edad minima es de " + edadMinima + " años";
	}
}
