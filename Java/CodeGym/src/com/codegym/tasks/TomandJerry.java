package com.codegym.tasks;

public class TomandJerry {

	public static void main(String[] args) {
		Mouse jerryMouse = new Mouse("Jerry", 12, 5);
		Dog bullDog = new Dog("Paco", 80, 40);
		Cat tito = new Cat("Tito", 40, 20);

		// write your code here
	}

	public static class Mouse {
		String name;
		int height;
		int tail;

		public Mouse(String name, int height, int tail) {
			this.name = name;
			this.height = height;
			this.tail = tail;
		}
	}

	// write your code here
	public static class Dog {
		String name;
		int height;
		int tail;

		public Dog(String name, int height, int tail) {
			this.name = name;
			this.height = height;
			this.tail = tail;
		}
	}

	public static class Cat {
		String name;
		int height;
		int tail;

		public Cat(String name, int height, int tail) {
			this.name = name;
			this.height = height;
			this.tail = tail;
		}
	}

}
