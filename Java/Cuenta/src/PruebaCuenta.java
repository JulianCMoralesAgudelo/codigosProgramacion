// Fig. 3.14: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;
public class PruebaCuenta
{
	// el método main empieza la ejecución de la aplicación de Java
	public static void main( String args[] )
	{
		Cuenta cuenta1 = new Cuenta( 50.00 ); // crea objeto Cuenta.
		System.out.printf( "Saldo de Cuenta1 : %s\n", cuenta1.obtenerSaldo());
		Cuenta cuenta2 = new Cuenta( -7.53 ); // crea objeto Cuenta.
		// muestra el saldo inicial de cada objeto
		System.out.printf( "Saldo de cuenta1: $%.2f\n",
				cuenta1.obtenerSaldo() );
		System.out.printf( "Saldo de cuenta2: $%.2f\n\n",
				cuenta2.obtenerSaldo() );
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
		Scanner entrada = new Scanner( System.in );
		double montoDeposito; // deposita el monto escrito por el usuario
		double montoRetirar;
		System.out.print("Escriba el monto a cargar: ");
		montoRetirar = entrada.nextDouble();
		System.out.print( "Escriba el monto a depositar para cuenta1: " ); // indicador
		System.out.printf( "Saldo de Cuenta1 : %s\n", cuenta1.obtenerSaldo());
		
		montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		System.out.printf( "\nsumando %.2f al saldo de cuenta1\n\n",
				montoDeposito );
		cuenta1.abonar( montoDeposito ); // suma al saldo de cuenta1
		// muestra los saldos
		System.out.printf( "Saldo de cuenta1: $%.2f\n",
		cuenta1.obtenerSaldo());

		System.out.printf( "Saldo de cuenta2: $%.2f\n\n",
				cuenta2.obtenerSaldo());

		System.out.print( "Escriba el monto a depositar para cuenta2: " ); // indicador
		montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
		System.out.printf( "\nsumando %.2f al saldo de cuenta2\n\n",
				montoDeposito );
		cuenta2.abonar( montoDeposito ); // suma al saldo de cuenta2
		//muestra los saldos
		System.out.printf( "Saldo de cuenta1: $%.2f\n",
		cuenta1.obtenerSaldo());

		System.out.printf( "Saldo de cuenta2: $%.2f\n",
				cuenta2.obtenerSaldo());
	} // fin de main
} // fin de la clase PruebaCuenta