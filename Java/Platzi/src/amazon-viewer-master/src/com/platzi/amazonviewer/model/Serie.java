package com.platzi.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {
	private int id;
	private int seasonQuantity;
	private ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, String creator, int duration, int seasonQuantity) {
		super(title, genre, creator, duration);
		this.seasonQuantity = seasonQuantity;
	}
	
	public Serie(String title, String genre, String creator, int duration, int seasonQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		this.seasonQuantity = seasonQuantity;
		this.chapters = chapters;
	}	

	public int getId() {
		return id;
	}
	
	public int getSeasonQuantity() {
		return seasonQuantity;
	}
	public void setSeasonQuantity(int seasonQuantity) {
		this.seasonQuantity = seasonQuantity;
	}
	public ArrayList<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return "Title: " + this.getTitle() +
				"\nGenre: " + this.getGenre() +
				"\nYear: " + this.getYear() +
				"\nCreator: " + this.getCreator() +
				"\nDuration: " + this.getDuration();
	}
	
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			Serie serie = new Serie("Serie " + i, "Genre " + i, "Creator " + i, 1200 + i, 5 + i);
			serie.setChapters(Chapter.makeChaptersList(serie));
			series.add(serie);
		}
		
		return series;
	}

	@Override
	public void view() {
		this.setViewed(true);
	}
}