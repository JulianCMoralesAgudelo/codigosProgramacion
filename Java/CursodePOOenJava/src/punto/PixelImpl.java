package punto;

public class PixelImpl extends PuntoImpl implements Pixel {
	private Color color;

	public PixelImpl() {
		super();
		this.color = Color.VERDE;
	}

	public PixelImpl(Double x, Double y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString() {
		String s = super.toString();
		s = s + "." + color;
		return s;
	}
}
