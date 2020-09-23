package emailapp;

import java.util.Scanner;

public class Email {

	private String firtsName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultpasswordLength = 10;
	private String alternativeEmail;
	private String companySuffix = "company.com";

	// Constructor to recieve Firts name and Last Name.
	public Email(String firtsName, String lastName) {
		this.firtsName = firtsName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firtsName + " " + this.lastName + ".");
		// Call a method asking for the departmaent - return deparment.
		this.department = setDepartament();		

		// Call a method that returns a random password.
		this.password = randomPassword(defaultpasswordLength);		

		// Combine elements to generate email.
		email = firtsName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;		
	}

	// Ask for department.
	private String setDepartament() {
		System.out.println(
				"DEPARMENT CODES\nEnter the deparment\n1 for sales\n2 for Development\n3 for Accounting\0 for none\nEnter deparment code.");
		Scanner in = new Scanner(System.in);
		int depChioice = in.nextInt();
		if (depChioice == 1) {
			return "Sales";
		} else if (depChioice == 2) {
			return "Development";
		} else if (depChioice == 3) {
			return "Accounting";
		} else {
			return "";
		}
	}

	// Generate a ramdom password.
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mailbox capacity.
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set the alternative email.
	public void setArlternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}

	// Change password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlernativeEmail() {
		return alternativeEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {

		return "\nDISPLAY NAME: " + firtsName + " " + lastName + "\nCOMPANY EMAIL " + email + "\nMAIL BOX CAPACITY :"
				+ mailboxCapacity + "mb";
	}
}
