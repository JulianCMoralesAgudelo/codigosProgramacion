package com.codegym.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaActual {

	public static void main(String[] args) {
		// Aquí colocas tu objeto tipo Date
		Date myDate = new Date();

		// Aquí obtienes el formato que deseas
		System.out.println(new SimpleDateFormat("MM dd yyyy").format(myDate));

	}

}
