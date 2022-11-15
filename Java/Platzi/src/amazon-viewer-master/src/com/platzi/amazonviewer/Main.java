package com.platzi.amazonviewer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import com.platzi.amazonviewer.model.Book;
import com.platzi.amazonviewer.model.Chapter;
import com.platzi.amazonviewer.model.Film;
import com.platzi.amazonviewer.model.Magazine;
import com.platzi.amazonviewer.model.Movie;
import com.platzi.amazonviewer.model.Serie;
import com.platzi.makereport.Report;
import com.platzi.util.AmazonUtil;

/**
 * <h1>AmazonViewer</h1>
 * AmazonViewer es un programa que permite visualizar Movies, Series con sus respetivos Chapters, Books y Magazines.
 * <p>
 * Existen algunas reglas como todos los elementos pueden ser visualizados o leídos a excepción de las Magazines, estas sólo pueden ser vistas a modo de exposición sin ser leídas.
 * </p>
 * 
 * @author Cesar Ramírez
 * @version 1.1
 * @since 2018
 **/
public class Main {
	static ArrayList<Movie> movies;
	static ArrayList<Serie> series;
	static ArrayList<Book> books;
	static ArrayList<Magazine> magazines;
	
	public static void main(String[] args) throws IOException {
		showMenu();
	}
	
	public static void showMenu() throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		movies = Movie.makeMoviesList();
		series = Serie.makeSeriesList();
		books = Book.makeBookList();
		magazines = Magazine.makeMagazineList();

		do {
			System.out.println("*** BIENVENIDOS AMAZON VIEWER ***\n");
			System.out.println("1. Movies\n2. Series\n3. Books\n4. Magazines\n5. Report\n6. Report Date\n7. Exit");

			int opcion = AmazonUtil.validateUserResponseOptionMenu(1, 7, "Digite una opción del menú: ");

			if (opcion == 7) {
				System.out.println("Saliendo...");
				exit = true;
			} else if (opcion == 1) {
				showMovies(movies);
			} else if (opcion == 2) {
				showSeries(series);
			} else if (opcion == 3) {
				showBooks(books);
			} else if (opcion == 4) {
				showMagazines();
			} else if (opcion == 5) {
				makeReport();
			} else if (opcion == 6) {
				try {
					System.out.print("Digite la fecha del reporte a generar en formato yyyy-MM-dd: ");
					Date dateE = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
					makeReport(dateE);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		} while (!exit);
		sc.close();
	}
	
	public static void showMovies(ArrayList<Movie> movies) {
		System.out.println("\n:: MOVIES ::");
		
		// Lambda para imprimir una movie.
		AtomicInteger atomicInteger = new AtomicInteger(1);
		movies.forEach(m -> System.out.println(atomicInteger.getAndIncrement() + ". " + m.getTitle() + "\tViewed: " + m.isViewed() + "\tTime Viewed: " + m.getTimeViewed() + " seg"));
		
		int opcion = AmazonUtil.validateUserResponseOptionMenu(1, movies.size(), "Elige la película que deseas ver: ");
		Film movieSelected = movies.get(opcion - 1);
		movieSelected.view();
	}
	
	public static void showSeries(ArrayList<Serie> series) {
		System.out.println("\n:: SERIES ::");

		for (int i = 0; i < series.size(); i++) {
			System.out.println((i + 1) + ". " + series.get(i).getTitle() + "\tViewed: " + series.get(i).isViewed());
		}
		
		int serieSelected = AmazonUtil.validateUserResponseOptionMenu(1, series.size(), "Elige la serie que deseas ver: ");
		showChapters(series.get(serieSelected-1).getChapters());
	}

	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		System.out.println("\n:: CHAPTERS ::");

		for (int i = 0; i < chaptersOfSerieSelected.size(); i++) {
			System.out.println((i + 1) + ". " + chaptersOfSerieSelected.get(i).getTitle() + "\tViewed: " + chaptersOfSerieSelected.get(i).isViewed());
		}
		
		int opcion = AmazonUtil.validateUserResponseOptionMenu(1, chaptersOfSerieSelected.size(), "Elige el capítulo que deseas ver: ");
		Chapter chapterSelected = chaptersOfSerieSelected.get(opcion - 1);
		chapterSelected.view();
	}
	
	public static void showBooks(ArrayList<Book> books) {
		System.out.println("\n:: BOOKS ::");
		
		for (int i = 0; i < books.size(); i++) {
			System.out.println((i + 1) + ". " + books.get(i).getTitle() + "\tRead: " + books.get(i).isRead() + "\tTime Read: " + books.get(i).getTimeRead() + " seg");
		}
		
		int opcion = AmazonUtil.validateUserResponseOptionMenu(1, books.size(), "Elige el libro que deseas leer: ");
		Book bookSelected = books.get(opcion - 1);
		bookSelected.view();
		
	}
	
	public static void showMagazines() {
		System.out.println("\n:: MAGAZINES ::");
		
		for (int i = 0; i < magazines.size(); i++) {
			System.out.println((i + 1) + ". " + magazines.get(i).getTitle());
		}
	}
	
	public static void makeReport() throws IOException {
		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		StringBuilder contentReport = new StringBuilder(report.getTitle());
		
		movies.stream()
			.filter(m -> m.getIsViewed()) // Predicate - filter()
			.forEach(m -> contentReport.append("\n\n" + m)); // Consumer - forEach()
		
		Consumer<Serie> seriesEach = s -> {
			ArrayList<Chapter> chapters = s.getChapters();
			chapters.stream()
				.filter(c-> c.getIsViewed())
				.forEach(c -> {
					contentReport.append("\n\nTitle Serie: " + s.getTitle());
					contentReport.append("\n" + c);
					});
		};
		series.stream().forEach(seriesEach);
		
		books.stream()
			.filter(b -> b.getIsRead())
			.forEach(b -> contentReport.append("\n\n" + b));
		
		report.setContent(contentReport.toString());
		report.makeReport();
		System.out.println("Archivo " + report.getNameFile() + "." + report.getExtension() + " generado!");
	}
	
	public static void makeReport(Date date) throws IOException {
		Date dateToday = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH-m-ss-S");
		String dateString = df.format(dateToday);
		
		Report report = new Report();
		report.setNameFile("reporte-" + dateString);
		report.setExtension("txt");
		report.setTitle("\n\n\t:: VISTOS - " + new SimpleDateFormat("EEE, d MMM yyyy").format(date) + " ::");
		
		SimpleDateFormat dfNameDays = new SimpleDateFormat("EE, d MMM Y, hh:mm:ss a");
		dateString = dfNameDays.format(dateToday);
		String contentReport = "Report date: " + dateString + report.getTitle();
		
		ArrayList<Movie> movies_date = new ArrayList<>();
		movies_date = Movie.makeMoviesListDate(date);
		
		for (Movie movie : movies_date) {
			contentReport += "\n\n" + movie;
		}
		
		for (Serie serie : series) {
			ArrayList<Chapter> chapters = serie.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += "\n\nTitle Serie: " + serie.getTitle();
					contentReport += "\n" + chapter;
				}
			}
		}
		
		for (Book book : books) {
			if (book.getIsRead()) {
				contentReport += "\n" + book;
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		System.out.println("Archivo " + report.getNameFile() + "." + report.getExtension() + " generado!");
	}
}