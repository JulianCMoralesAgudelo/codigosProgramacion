package databaseapp;

import java.util.Scanner;

public class Student {

	private String firtsName;
	private String lastName;
	private int gradeYear;
	private String studenID;
	private String courses;
	private String tiutionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter student's name and year.
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student firts name: ");
		this.firtsName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter studen class level: ");
		this.gradeYear = in.nextInt();

		setStudentID();

		System.out.println(firtsName + " " + lastName + " " + gradeYear + " " + studenID);
	}

	// Generate ID.
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studenID = gradeYear + "" + id;
	}

	// Enroll in courses.

	// View balance.

	// Pay Tiution.

	// Show status.

}
