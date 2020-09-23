package com.platzi.amazonviewer.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * <h1>Magazine</h1>
 * <p>Te permite crear las revistas pero no visualizarlas. Se maneja a especie de catálogo.
 * Hereda de {@link Publication}</p>
 * 
 * @author Cesar Ramírez
 * @version 1.1
 * @since 2018
 **/
public class Magazine extends Publication {
	private int id;
	
	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial);
		this.setAuthors(authors);
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "\nTitle: " + this.getTitle() +
				"\nEditorial: " + this.getEditorial() +
				"\nEdition Date: " + new SimpleDateFormat("MMMM dd, yyyy", Locale.US).format(this.getEditionDate());
	}
	
	public static ArrayList<Magazine> makeMagazineList() {
		ArrayList<Magazine> magazines = new ArrayList<>();
		String[] authors = new String[3];
		
		for (int i = 0; i < 3; i++) {
			authors[i] = "Author " + i;
		}
		for (int i = 1; i <= 5; i++) {
			magazines.add(new Magazine("Magazine " + i, new Date(), "Editorial " + i, authors));
		}
		
		return magazines;
	}
}