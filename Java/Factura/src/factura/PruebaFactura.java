package factura;

public class PruebaFactura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura prod1 = new Factura("Producto1", "Verificar operatividad", 3, 5.6);
		System.out.println(prod1.getNumP()+" "+prod1.getDescxAr());
		System.out.println(prod1.getCantxAr() + prod1.getPrexAr());
		System.out.println(prod1.montoFactura(7.5, 10));
		
	}

}
