package PruebaTecnica;

import java.util.Scanner;

public class PasoxReferencia {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int a = 0;
		int b = 0;
		System.out.print("Por favor ingrese el numero a : ");
		a = dato.nextInt();
		System.out.print("Por favor ingrese el numero b : ");
		b = dato.nextInt();
		Operaciones Operacion1 = new Operaciones(a, b);		
		System.out.println("El valor de a original es = " + a);
		System.out.println("El valor de b original es = " + b);
	}

	public static class Operaciones {
		int a;
		int b;

		public Operaciones(int a, int b) {
			this.a = a;
			this.b = b;			
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		public void sumar() {
			int c = a + b;
			System.out.println("La suma de a + b original es = " + c);
			a = a * 2;
			b = b * 3;
			c = a + b;
			System.out.println("El valor de a modificado es = " + a);
			System.out.println("El valor de b modificado es = " + b);
			System.out.println("La suma de a + b modificada es = " + c);
		}

	}

}
