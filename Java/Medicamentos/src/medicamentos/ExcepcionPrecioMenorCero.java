package medicamentos;

public class ExcepcionPrecioMenorCero extends RuntimeException {

	public ExcepcionPrecioMenorCero() {
		super();
	}

	public ExcepcionPrecioMenorCero(String s) {
		super(s);
	}

}
