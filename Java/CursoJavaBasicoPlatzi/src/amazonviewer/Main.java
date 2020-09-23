package amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import makereports.Report;

public class Main {

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {
		int exit = 0;
		do {

			System.out.println("WELCOME AMAZON VIEWER");
			System.out.println();
			System.out.println("Choice a number");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. exit");

			switch (Metodos.validateUserResponseMenu(0, 6)) {
			case 0:
				// salir
				exit = 0;
				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				exit = 1;
				break;
			case 6:
				makeReport(new Date());
				exit = 1;
				break;
			default:
				System.out.println();
				System.out.println("....!!Choice an option!!....");
				System.out.println();
				break;
			}

		} while (exit != 0);

	}

	static ArrayList<Movie> movies = Movie.makeMoviesList();

	public static void showMovies() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println("\n:: MOVIES ::");
			System.out.println();

			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i + 1 + " . " + movies.get(i).getTitle() + " Viewed: " + movies.get(i).isViewed());
			}
			System.out.println("0. Back to Menu.");
			System.out.println();

			int response = Metodos.validateUserResponseMenu(0, movies.size());

			if (response == 0) {
				exit = 0;
				showMenu();
				break;
			}

			if (response > 0) {

				Movie movieSelected = movies.get(response - 1);
				movieSelected.setViewed(true);
				Date dateI = movieSelected.startToSee(new Date());

				for (int i = 0; i < 100000; i++) {
					System.out.println(".............");
				}

				// Termina Pelicula
				movieSelected.stopToSee(dateI, new Date());
				System.out.println("You have already seen this movie" + movieSelected);
				System.out.println("By " + movieSelected.getTimeViewed() + " miliseconds");
			}
		} while (exit != 0);

	}

	static ArrayList<Serie> series = Serie.makeSeriesList();

	public static void showSeries() {
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();

			for (int i = 0; i < series.size(); i++) {
				System.out.println(i + 1 + ". " + series.get(i).getTitle() + " Viewed " + series.get(i).isViewed());
			}
			System.out.println("0. Back to Menu.");
			System.out.println();

			int response = Metodos.validateUserResponseMenu(0, series.size());

			if (response == 0) {
				exit = 0;
				showMenu();
			}

			showChapters(series.get(response - 1).getChapters());

		} while (exit != 0);
	}

	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();

			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) {
				System.out.println(i + 1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Viewed "
						+ chaptersOfSerieSelected.get(i).isViewed());
			}
			System.out.println("0. Back to Menu.");
			System.out.println();

			// Leer Respuesta usuario
			int response = Metodos.validateUserResponseMenu(0, chaptersOfSerieSelected.size());

			if (response == 0) {
				exit = 0;
			}
			if (response > 0) {
				Chapter chapterSelected = chaptersOfSerieSelected.get(response - 1);
				chapterSelected.setViewed(true);
				Date dateI = chapterSelected.startToSee(new Date());

				// Termina el chapter
				for (int i = 0; i < 100000; i++) {
					System.out.println(".............");
				}

				// Termina Pelicula
				chapterSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("You have already seen this movie" + chapterSelected);
				System.out.println("By " + chapterSelected.getTimeViewed() + " miliseconds");
			}
		} while (exit != 0);

	}

	static ArrayList<Book> books = Book.makeBookList();

	public static void showBooks() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();

			for (int i = 0; i < books.size(); i++) { // 1. Book 1
				System.out.println(i + 1 + ". " + books.get(i).getTitle() + " Leído: " + books.get(i).isReaded());
			}

			System.out.println("0. Back to Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = Metodos.validateUserResponseMenu(0, books.size());

			if (response == 0) {
				exit = 0;
				showMenu();
			}

			if (response > 0) {
				Book bookSelected = books.get(response - 1);
				bookSelected.setReaded(true);
				Date dateI = bookSelected.startToSee(new Date());

				for (int i = 0; i < 100000; i++) {
					System.out.println("..........");
				}

				// Termine de verla
				bookSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("You have already read: " + bookSelected);
				System.out.println("By" + bookSelected.getTimeReaded() + " miliseconds");
			}
		} while (exit != 0);

	}

	public static void showMagazines() {
		ArrayList<Magazine> magazines = Magazine.makeMagazineList();
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();

			for (int i = 0; i < magazines.size(); i++) { // 1. Book 1
				System.out.println(i + 1 + ". " + magazines.get(i).getTitle());
			}

			System.out.println("0. Back to Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = Metodos.validateUserResponseMenu(0, magazines.size());

			if (response == 0) {
				exit = 0;
				showMenu();
			}

			if (response > 0) {
				System.out.println(magazines.get(response - 1));
			}

		} while (exit != 0);
	}

	public static void makeReport() {
		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");
		String contentReport = "";

		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";

			}
		}

		for (Serie serie : series) {
			ArrayList<Chapter> chapters = serie.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += chapter.toString() + "\n";

				}
			}
		}

		for (Book book : books) {
			if (book.getIsReaded()) {
				contentReport += book.toString() + "\n";

			}
		}

		report.setContent(contentReport);
		report.makeReport();
		System.out.println("Reporte Generado");
		System.out.println();
	}

	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-h-m-s-S");
		String dateString = df.format(date);
		Report report = new Report();

		report.setNameFile("reporte" + dateString);
		report.setExtension("txt");
		report.setTitle(":: VISTOS ::");

		SimpleDateFormat dfNameDays = new SimpleDateFormat("E, W MMM Y");
		dateString = dfNameDays.format(date);
		String contentReport = "Date: " + dateString + "\n\n\n";

		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";

			}
		}

		for (Serie serie : series) {
			ArrayList<Chapter> chapters = serie.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += chapter.toString() + "\n";

				}
			}
		}

		for (Book book : books) {
			if (book.getIsReaded()) {
				contentReport += book.toString() + "\n";

			}
		}
		report.setContent(contentReport);
		report.makeReport();

		System.out.println("Reporte Generado");
		System.out.println();
	}

}
