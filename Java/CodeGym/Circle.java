package com.codegym.tasks;

public class Circle {

	public double x;
	public double y;
	public double r;

	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle(double x, double y) {
		// write your code here
		this(x, y, 10);
	}

	public Circle() {
		this(5, 5, 1);
	}

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.r = 10;
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println(circle.x + " " + circle.y + " " + circle.r);
		Circle anotherCircle = new Circle(10, 5);
		System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.r);
	}
}
