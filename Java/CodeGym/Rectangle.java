package com.codegym.tasks;

public class Rectangle {

	// Atributos

	public int top;
	public int left;
	public int width;
	public int height;

	public void initialize(int top, int left, int width, int heigth) {
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = heigth;
	}

	public void initialize(int top, int left, int width) {
		this.top = top;
		this.left = left;
		this.width = width;
	}

	public void initialize(int width, int heigth) {
		this.width = width;
		this.height = heigth;
	}

	public void initialize(int width) {
		this.width = width;
	}

	public static void main(String[] args) {

	}

}
