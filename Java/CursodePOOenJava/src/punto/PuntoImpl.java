package punto;

public class PuntoImpl implements Punto {

	private Double x;
	private Double y;

	public PuntoImpl(Double x1, Double y1) {
		this.x = x1;
		this.y = y1;
	}

	public PuntoImpl() {
		this.x = 0.;
		this.y = 0.;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	public void setX(Double x1) {
		x = x1;
	}

	public void setY(Double y1) {
		y = y1;
	}

	public Double getDistanciaAOtroPunto(Punto p) {
		Double dx = this.getX() - p.getX();
		Double dy = this.getY() - p.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

	// representación como cadena
	public String toString() {
		String s = "(" + this.getX() + "," + this.getY() + ")";
		return s;
	}
	
	public boolean equals(Object o) {
		boolean r = false;
		if (o instanceof Punto) {
			Punto p = (Punto) o;
			r = this.getX().equals(p.getX()) && this.getY().equals(p.getY());
		}
		return r;
	}
	

	/*
	 * public static void testParidad(Integer n) { if (n % 2 == 0) {
	 * mostrar("Es par", x); } else { mostrar("Es impar", x); } }
	 * 
	 * public static void testFactorial(Integer n) { if (n > 0) { Double f =
	 * Utiles.factorial(n); mostrar("El factorial es ", f); } }
	 * 
	 * private static void mostrar(String string, Double f) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * public static void testTrigonometria(Double x){ if (x>0 && x<1){ Double
	 * s=Math.sin(x); mostrar (“El seno es “, s); } else { Double c=Math.cos(x);
	 * mostrar (“El coseno es “, c); } }
	 * 
	 * 
	 * public static Double calcularImpuesto(Double salario){ Double impuesto = 0.0;
	 * if (salario>=5000.0){ impuesto = 20.0; } else if (salario<5000.0 &&
	 * salario>=2500.0){ impuesto = 15.0; } else if (salario<2500.0 && salario
	 * >=1500.0){ impuesto = 10.0; } else if (salario > 800.0){ impuesto = 5.0; }
	 * return impuesto; }
	 * 
	 * public static Integer getNumDiasMes(Integer mes, Integer anyo) { Integer res=
	 * null; switch (mes) { case 1: case 3: case 5: case 7: case 8: case 10: case
	 * 12: res = 31; break; case 4: case 6: case 9: case 11: res = 30; break; case
	 * 2: if (Fechas.esBisiesto(anyo)) { res = 29; } else { res = 28; } } return
	 * res; }
	 * 
	 * public static void testCuadrante(Punto p){ if (p.getX()>=0.0){ if
	 * (p.getY()>=0.0){ mostrar("Primer cuadrante"); } else {
	 * mostrar("Cuarto cuadrante"); } else { if (p.getY()>=0.0){
	 * mostrar("Segundo cuadrante"); } else { mostrar("Tercer cuadrante"); } } } }
	 * 
	 */	
}