package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

public class CatRelations {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String granFatherName = reader.readLine();
		Cat granFatherCat = new Cat(granFatherName, null, null);

		String granMotherName = reader.readLine();
		Cat grandMotherCat = new Cat(granMotherName, null, null);

		String fatherName = reader.readLine();
		Cat catFather = new Cat(fatherName, granFatherCat, null);

		String motherName = reader.readLine();
		Cat catMother = new Cat(motherName, null, grandMotherCat);

		String sonName = reader.readLine();
		Cat catSon = new Cat(sonName, catFather, catMother);

		String daughterName = reader.readLine();
		Cat catDaughter = new Cat(daughterName, catFather, catMother);

		System.out.println(granFatherCat);
		System.out.println(grandMotherCat);
		System.out.println(catFather);
		System.out.println(catMother);
		System.out.println(catSon);
		System.out.println(catDaughter);

	}

	public static class Cat {
		private String name;
		private Cat father;
		private Cat mother;

		Cat(String name) {
			this.name = name;
		}

		Cat(String name, Cat father) {
			this.name = name;
			this.father = father;

		}

		public Cat(String name, Cat mother, Cat father) {
			this.name = name;
			this.father = mother;
			this.mother = father;

		}

		@Override
		public String toString() {
			if (name != null && mother == null && father == null) {
				return "The cat's name is " + name + ", no mother, no father ";
			} else if (name != null && father != null && mother == null) {
				return "The cat's name is " + name + ",  no mother, " + father.name + " is the father";
			} else if (name != null && father == null && mother != null) {
				return "The cat's name is " + name + ", " + mother.name + " is the mother , no father";
			} else if (name != null && father != null && mother != null) {
				return "The cat's name is " + name + ", " + mother.name + " is the mother, " + father.name
						+ " is the father";
			}
			return null;
		}
	}

}
