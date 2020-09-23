package com.platzi.amazonviewer.model;

import java.util.Arrays;
import java.util.Date;

public class Publication {
	private String title;
	private Date editionDate;
	private String editorial;
	private String[] authors;
	
	public Publication(String title, Date editionDate, String editorial) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editorial = editorial;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	@Override
	/** Comparar cada uno de los atributos de los dos objetos. */	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		
		Publication p = (Publication) obj;
		
		if (this.title == null && p.title != null) return false;
		if (this.title != null && !this.title.equals(p.title)) return false;
		
		if (this.editionDate.compareTo(p.editionDate) != 0) return false;
		
		if (this.editorial == null && p.editorial != null) return false;
		if (this.editorial != null && !this.editorial.equals(p.editorial)) return false;
		
		if (!Arrays.equals(this.authors, p.authors)) return false;
		
		return true;
	}
}