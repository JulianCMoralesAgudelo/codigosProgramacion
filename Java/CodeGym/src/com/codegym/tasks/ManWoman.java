package com.codegym.tasks;

public class ManWoman {

	public static void main(String[] args) {
		Man man1 = new Man("Julian", 37, "Bello Antioquia Colombia");
		Man man2 = new Man("Tito", 3, "Bello Antioquia Colombia");

		Woman woman1 = new Woman("Gilma", 67, "Bello Antioquia Colombia");
		Woman woman2 = new Woman("Yise", 28, "Bello Antioquia Colombia");

		System.out.println( man1.name + " " + man1.age + "  " + man1.address);
		System.out.println(man2.name + " " + man2.age + " " + man2.address);		
		System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
		System.out.println(woman2.name + " " + woman2.age + "  " + woman2.address);

	}

	public static class Man {

		public String name;
		public int age;
		public String address;

		public Man(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Man(String name, int age) {
			this(name, age, "Address");
		}

		public Man(String name) {
			this(name, 1, "Address");
		}

	}

	public static class Woman {

		public String name;
		public int age;
		public String address;

		public Woman(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Woman(String name, int age) {
			this(name, age, "Address");
		}

		public Woman(String name) {
			this(name, 1, "Address");
		}

	}

}
