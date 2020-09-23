package medicamentos;

import java.util.concurrent.ExecutionException;

public class MedicamentoImpl implements Medicamento {

	// Atributos
	private Integer codigo;
	private String nombre;
	private Double precio;
	private Boolean receta;

	public MedicamentoImpl(Integer codigo, String nombre, Double precio, Boolean receta) {
		super();
		if (precio < 0) {
			throw new ExcepcionPrecioMenorCero(" Error intento de crear un medicamento con precio menor que cero");
		}

		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.receta = receta;
	}

	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public Boolean getReceta() {
		// TODO Auto-generated method stub
		return receta;
	}

	@Override
	public void setPrecio(Double nuevoprecio) {
		// TODO Auto-generated method stub
		if (nuevoprecio < 0) {
			throw new ExcepcionPrecioMenorCero(" Intento de modificar un medicamento con precio menor que cero");
		}
		precio = nuevoprecio;
	}

	@Override
	public void setReceta(Boolean nuevareceta) {
		// TODO Auto-generated method stub
		receta = nuevareceta;

	}

	// Deberia tener redefinido un metodo equals
	public boolean equals(Object o) {
		boolean r = false;
		if (o instanceof Medicamento) {
			Medicamento m = (Medicamento) o;
			r = this.getNombre().equals(m.getNombre()) && this.getPrecio().equals(m.getPrecio());
		}
		return r;
	}

	// Debo de tener un metodo toString
	public String toString() {
		String medicamento;
		medicamento = "[" + this.getNombre() + " precio: " + this.getPrecio() + "]";
		return medicamento;
	}

	@Override
	public int compareTo(Medicamento o) {
		// Orden natural
		// Este metodo devuelve
		// >0 si this es mayor que o
		// <0 si this es menor que o
		// 0 si this es igual a o
		int resultado = this.getNombre().compareTo(o.getNombre());
		if (resultado == 0) {
			resultado = this.getPrecio().compareTo(o.getPrecio());
		}
		return resultado;
	}

	@Override
	public void incrementaPrecio(Integer precio) {
		// TODO Auto-generated method stub
		Double precioAnterior = this.getPrecio();
		Double nuevoprecio = precioAnterior + precioAnterior * precio / 100;
		try {
			this.setPrecio(nuevoprecio);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//this.setPrecio(this.getPrecio()*(1+precio/100.);

	}

}
