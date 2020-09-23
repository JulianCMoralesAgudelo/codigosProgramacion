
public class indeterminacion implements Runnable {

	private static int cont = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20000; i++) {
			cont++;
		}
	}

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int nNUcleos = runtime.availableProcessors();
		Thread[] hilos = new Thread[nNUcleos];

		for (int i = 0; i < hilos.length; i++) {
			Runnable runnable = new indeterminacion();
			hilos[i] = new Thread(runnable);
			hilos[i].start();
		}

		for (int i = 0; i < hilos.length; i++) {
			try {
				hilos[i].join();
			} catch (Exception ex) {
			}
		}
		System.out.println(cont);
	}

}
