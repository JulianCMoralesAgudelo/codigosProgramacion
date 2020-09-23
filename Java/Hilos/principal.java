
public class principal implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}
	
	public static void main(String[] args) {
		Runnable runnable = new principal();
		Thread hilo1 = new Thread(runnable);
		hilo1.start();
		
		try {
			hilo1.join();
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}	

}
