package PruebaTecnica;

public class MenorDeTres {
	public static void main(String[] args) {

	}

	public static int minimo(int a, int b, int c) {		
		int menor = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		return menor;
	}
}
