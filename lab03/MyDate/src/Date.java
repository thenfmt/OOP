import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	private String date;
	
	public Date() { //int day, int month, int year) {
		/*
		this.day = day;
		this.month = month;
		this.year = year;
		this.date = getStrDate();
		*/
	}
	
	private String getStrDate() {
		String[] strMonth = {" ", "January", "February", "March", "April", "May", "June",
				"July", "Augoust", "September", "Ocotbor", "November", "December"};
		String[] strOrder = {" ", "st", "nd", "rd", "th"};
		
		return strMonth[month] + " " + day + strOrder[Math.min(4, day)] + " " + year;
	}
	
	public void accept() {
		System.out.print("Enter date (dd/mm/yyyy):");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] splited = str.split("/");
		
		setDay(Integer.valueOf(splited[0]));
		setMonth(Integer.valueOf(splited[1]));
		setYear(Integer.valueOf(splited[2]));
		setDate(getStrDate());
		
	}
	public void print() {
		System.out.println(date);
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
