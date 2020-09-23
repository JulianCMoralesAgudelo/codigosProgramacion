package factura;
/*
 * Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura para un 
 * artículo vendido en la tienda.
 * Una factura debe incluir 4 piezas de información como variables de instancia: 
 * un numero de pieza (tipo String),la descripción de la pieza (tipo String), 
 * la cantidad de artículos de ese tipo que se van a comprar (tipo int) y el precio por el 
 * articulo(tipo double). Su clase debe tener un constructor que inicialice las 4 variables de instancia.
 * Proporcione un método establecer y un método obtener para cada variable de instancia.
 * Además proporcione un método llamado obtener Monto Factura, que calcule el monto de 
 * la factura (valor * cantidad) y después devuelva ese monto como valor doublé. 
 * Si la cantidad no es positiva debe establecerse en cero.
 * Si el precio por el artículo no es positivo, debe establecerse 0,0.
 * Escriba una aplicación de prueba llamada Prueba Factura que demuestre las capacidades de su clase factura
 */
public class Factura {
	
	private String 	 numP;
	private String 	 descxAr;
	private int	 cantxAr;
	private double  prexAr;
	
	public Factura(String numP, String descxAr,int cantAr, double prexAr){
		this.setNumP(numP);
		this.setDescxAr(descxAr);
		this.setCantxAr(cantAr);
		this.setPrexAr(prexAr);		
	}

	public String getNumP() {
		return numP;
	}

	public void setNumP(String numP) {
		this.numP = numP;
	}

	public String getDescxAr() {
		return descxAr;
	}

	public void setDescxAr(String descxAr) {
		this.descxAr = descxAr;
	}

	public int getCantxAr() {
		return cantxAr;
	}

	public void setCantxAr(int cantxAr) {
		this.cantxAr = cantxAr;
	}

	public double getPrexAr() {
		return prexAr;
	}

	public void setPrexAr(double prexAr) {
		this.prexAr = prexAr;
	}
	
	public double montoFactura(double prexAr, int cantAr){
		if (cantAr<=0){
			cantAr=0;
			return prexAr*cantAr;
			}
		if (prexAr<=0){
			prexAr=0;
			return prexAr*cantAr;
			}
		return prexAr*cantAr;		
	}

}
