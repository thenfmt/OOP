package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class DayOfMonth {
	public static void main(String[] args){
		String[] dayOf_31 = {"January", "Jan.", "Jan", "1", "March", "Mar.", "Mar", "3", "May", "5", "July", "Jul", "7", "August", "Aug.", "Aug", "8", "December", "Dec.", "Dec", "12"};
		String[] dayOf_30 = {"April", "Apr.", "Apr", "4", "June", "Jun", "6", "September", "Sept.", "Sep", "9", "November", "Nov.", "Nov", "11"};
		String[] dayOf_28_29 = {"February", "Feb.", "Feb", "2"};
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month and year: ");
		String str = sc.nextLine();
		String[] splited = str.split(" ");

		int year = Integer.valueOf(splited[1]);
		boolean isLeapYear = (year%4 == 0 && year%100 == 0 && year%400 == 0);

		if(Arrays.asList(dayOf_30).contains(splited[0])){
			System.out.println("There are 30 days in " + splited[0] + "/" + splited[1]);
			return;
		}

		if(Arrays.asList(dayOf_31).contains(splited[0])){
			System.out.println("There are 31 days in " + splited[0] + "/" + splited[1]);
			return;
		}

		if(Arrays.asList(dayOf_28_29).contains(splited[0]) && isLeapYear){
			System.out.println("There are 29 days in " + splited[0] + "/" + splited[1]);
			return;
		}else{
			System.out.println("There are 28 days in " + splited[0] + "/" + splited[1]);
			return;
		}
	}
}
