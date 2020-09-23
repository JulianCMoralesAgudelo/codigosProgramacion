package Poo;

public class Libro {

	// Atributos
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;

	public Libro(int iSBN, String titulo, String autor, int numPaginas) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}
	
	

}
