package com.codegym.tasks;

public class NotepadNewIdeas {

	public static void main(String[] args) {
		printIdea(new Idea());
	}

	// write your code here
	public static void printIdea(Idea idea) {
		// TODO Auto-generated method stub
		System.out.println(idea.getDescription());
	}

	public static class Idea {
		public String getDescription() {
			return "Hago algo";
		}
	}
}
