package punto;

public class ExcepcionCirculoRadio extends RuntimeException {
	public ExcepcionCirculoRadio() {
		super();
	}

	public ExcepcionCirculoRadio(String msg) {
		super(msg);
	}

	public ExcepcionCirculoRadio(String s, Double valor) {
		super(s + " Valor radio: " + valor);
	}
}