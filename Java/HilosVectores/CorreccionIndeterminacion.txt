
public class CorreccionIndeterminacion implements Runnable {

	private static int cont = 0;
	private static Object object = new Object();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (object) {
			for (int i = 0; i < 20000; i++) {
				cont++;
			}
		}
	}

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int nNUcleos = runtime.availableProcessors();
		Thread[] hilos = new Thread[nNUcleos];

		for (int i = 0; i < hilos.length; i++) {
			Runnable runnable = new CorreccionIndeterminacion();
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
