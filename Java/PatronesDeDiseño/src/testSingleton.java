
public class testSingleton {

	public static void main(String[] args) {
		Singleton miSingleton = Singleton.obtenerSingleton();
		Singleton miSingletonDos = Singleton.obtenerSingleton();
		Singleton miSingletonTres = Singleton.obtenerSingleton();
		Singleton miSingletonCuatro = Singleton.obtenerSingleton();
		Singleton miSingletonCinco = Singleton.obtenerSingleton();
		Singleton miSingletonSeis = Singleton.obtenerSingleton();
		Singleton miSingletonSiete = Singleton.obtenerSingleton();
		Singleton miSingletonOcho = Singleton.obtenerSingleton();
		Singleton miSingletonNueve = Singleton.obtenerSingleton();
		Singleton.vecesLLamado();
		System.out.println("He terminadod e crear los objetos");

	}

}
