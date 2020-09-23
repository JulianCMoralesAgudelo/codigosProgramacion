package PruebaTecnica;

import java.util.Scanner;

public class PasoxValor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner dato = new Scanner(System.in);
		System.out.print("Por favor ingrese su nombre : ");
		String nombre = dato.nextLine();
		Persona prueba_a = new Persona(nombre);
		System.out.println(prueba_a.toString() + "\tHashcode : " + prueba_a.hashCode());
		prueba_a.setNombre("Felipe Montoya");
		System.out.println(prueba_a.toString() + "\tHashcode : " + prueba_a.hashCode());
		System.out.println("Variable Original =" + nombre);
	}

	public static class Persona {

		private String nombre;

		public Persona(String nombre) {
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + "]";
		}

	}
}
