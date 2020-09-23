package punto;

public interface Circulo {

	Punto getCentro();

	Double getRadio();

	Double getArea();

	Double getLongitud();

	void setCentro(Punto p);

	void setRadio(Double r);

}

/*
 * 
 * public void CirculoImpl(Punto p, Double r){ if (r<=0.0) throw new
 * ExcepcionCirculoRadio("Radio menor o igual que 0.",r); centro=p; radio=r; }
 * 
 * public void setRadio(Double r) { if (r<=0.0) throw new
 * ExcepcionCirculoRadio("Radio menor o igual que 0.",r); radio=r; }
 * 
 */
