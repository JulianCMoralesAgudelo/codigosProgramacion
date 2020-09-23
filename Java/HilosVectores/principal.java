
public class principal implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

	public static void main(String[] args) {
		Thread[] hilos = new Thread[2];

		for (int i = 0; i < hilos.length; i++) {
			Runnable runnable = new principal();
			hilos[i] = new Thread(runnable);
			hilos[i].start();
		}

		for (int i = 0; i < hilos.length; i++) {
			try {
				hilos[i].join();
			} catch (Exception ex) {
				// TODO: handle exception

			}
		}

	}

}
