// Fig. 3.13: Cuenta.java
// La clase Cuenta con un constructor para
// inicializar la variable de instancia saldo.
public class Cuenta
{
	private double saldo; // variable de instancia que almacena el saldo
	// constructor
	public Cuenta( double saldoInicial )
	{
		// valida que saldoInicial sea mayor que 0.0;
		// si no lo es, saldo se inicializa con el valor predeterminado 0.0
		if ( saldoInicial > 0.0 )
		saldo = saldoInicial;
		} // fin del constructor de Cuenta
	// abona (suma) un monto a la cuenta
	public void abonar( double monto )
	{
			saldo = saldo + monto; // suma el monto al saldo
		} // fin del método abonar
		// devuelve el saldo de la cuenta
	public double obtenerSaldo()
	{
			return saldo; // proporciona el valor de saldo al método que hizo la llamada
	} // fin del método obtenerSaldo
} // fin de la clase Cuenta