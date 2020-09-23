package amazonviewer;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication implements IVisualizable {

	private int id;
	private boolean viewed;
	private double timeViewed;

	public Magazine(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);

	}

	public int getId() {
		return id;
	}

	public boolean isViewed() {
		return viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

	public double getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(double timeViewed) {
		this.timeViewed = timeViewed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailMagazine = "\n :: MAGAZINE ::" + "\n Title: " + getTitle() + "\n Editorial: " + getEditorial()
				+ "\n Edition Date: " + getEditionDate() + "\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailMagazine += "\t" + getAuthors()[i] + " ";
		}
		return detailMagazine;
	}

	public static ArrayList<Magazine> makeMagazineList() {
		ArrayList<Magazine> magazines = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 5; i++) {
			authors[i] = "author " + i;
		}
		for (int i = 1; i <= 5; i++) {
			magazines.add(new Magazine("Magazine " + i, new Date(), "Editorial " + i));
		}

		return magazines;
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getTime() > dateI.getTime()) {
			setTimeViewed((int) (dateF.getTime() - dateI.getTime()));
		} else {
			setTimeViewed(0);
		}
	}

}
