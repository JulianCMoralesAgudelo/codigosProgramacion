package com.platzi.amazonviewer.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import com.platzi.util.AmazonUtil;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	private ArrayList<Page> pages;
	
	public Book(String title, Date editionDate, String editorial, boolean read) {
		super(title, editionDate, editorial);
		this.read = read;
	}
	
	public Book(String title, Date editionDate, String editorial, String[] authors, ArrayList<Page> pages) {
		super(title, editionDate, editorial);
		this.setAuthors(authors);
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String isRead() {
		return read ? "Yes" : "No";
	}
	public boolean getIsRead() {
		return read;
	}	
	public void setRead(boolean read) {
		this.read = read;
	}
	public int getTimeRead() {
		return timeRead;
	}
	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}
	public ArrayList<Page> getPages() {
		return pages;
	}
	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		String detailBook = 
				"\nTitle: " + this.getTitle() + 
				"\nEditorial: " + this.getEditorial() + 
				"\nEdition Date: " + new SimpleDateFormat("MMMM dd, yyyy", Locale.US).format(this.getEditionDate()) + 
				"\nAuthors: ";
		for (String author : this.getAuthors()) {
			detailBook += author + "\t";
		}
		return detailBook;
	}

	@Override
	public Date startToSee(Date dateI) {
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		int result = dateF.getTime() > dateI.getTime() ? (int) (dateF.getTime() - dateI.getTime()) / 1000 : 0;
		this.setTimeRead(result);
	}
	
	public void view() {
		Date dateI = this.startToSee(new Date());
		
		int numberPagesRead = 0;
		do {
			System.out.print("........\n");
			System.out.println("Page: " + this.getPages().get(numberPagesRead).getNumber());
			System.out.println("Content: " + this.getPages().get(numberPagesRead).getContent());
			AmazonUtil.seenThread();
			this.getPages().get(numberPagesRead).setRead(true);
			System.out.print(".......\n");
			
			if (numberPagesRead != 0) System.out.println("1. Regresar Página");
			System.out.println("2. Siguiente Página");
			System.out.println("3. Cerrar Libro\n");
			
			int opcion = AmazonUtil.validateUserResponseOptionMenu(1, 3, "Elige una opción: ");
			
			if (opcion == 2) numberPagesRead++;
			else if (opcion == 1) numberPagesRead--;
			else if (opcion == 3) break;
		} while (numberPagesRead < getPages().size());
		
		int pagesReadBook = 0;
		for (Page p : pages) {
			if (p.isRead()) {
				pagesReadBook++;
			}
		}
		
		if (pagesReadBook == getPages().size()) this.setRead(true);		
		
		this.stopToSee(dateI, new Date());
		System.out.println("Viste \"" + this.getTitle() + "\" en " + this.getTimeRead() + " segundos !! ");
	}
	
	public static ArrayList<Book> makeBookList() {
		ArrayList<Book> books = new ArrayList<>();
		ArrayList<Page> pages = new ArrayList<>();
		String[] authors = new String[3];
		
		for (int i = 0; i < 3; i++) {
			authors[i] = "Author " + i;
		}	
		
		int page = 0;
		for (int i = 0; i < 4; i++) {
			page = i + 1;
			pages.add(new Book.Page(page, "El contenido de la página " + page));
		}
		
		for (int i = 1; i <= 5; i++) {
			books.add(new Book("Book " + i, new Date(), "Editorial " + i, authors, pages));
		}
		
		return books;
	}

	public static class Page {
		private int id;
		private int number;
		private String content;
		private boolean read;
		
		public Page(int number, String content) {
			super();
			this.number = number;
			this.content = content;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public boolean isRead() {
			return read;
		}
		public void setRead(boolean read) {
			this.read = read;
		}		
	}
}