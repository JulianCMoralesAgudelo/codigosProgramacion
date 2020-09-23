package medicamentos;

public interface Medicamento extends Comparable<Medicamento> {

	// Metodos consultores

	Integer getCodigo();

	String getNombre();

	Double getPrecio();

	Boolean getReceta();

	// Metodos modificadores

	void setPrecio(Double nuevoprecio);

	void setReceta(Boolean nuevareceta);

	void incrementaPrecio(Integer precio);

}
