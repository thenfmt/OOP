package aims;

import java.util.Scanner;

import book.Book;
import dvd.DVD;
import media.Media;
import media.MediaId;
import order.Order;

public class Aims {
	public static void main(String[] args) {
		Order order = new Order();
		
	
		int option;
		while(1 > 0) {
			showMenu();
			Scanner input = new Scanner(System.in);
			option = input.nextInt();
			
			switch (option) {
			case 0:
				System.exit(0);
			
			case 1:
				System.out.print("\nEnter date: ");
				input = new Scanner(System.in);
				String date = input.nextLine();
				order = new Order();
				order.setDateOrdered(date);
				break;
				
			case 2:
				order.addMedia(inputItems());
				break;
				
			case 3:
				Scanner getId = new Scanner(System.in);
				int id = getId.nextInt();
				
				order.removeMedia(id);
				
				break;
			
			case 4:
				order.printOrders();
				break;
			}
			
		}
	}
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static Media inputItems() {
		MediaId id = MediaId.DVD;
		
		System.out.print("\nEnter type of Media (Default is DVD): ");
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		if(type.toLowerCase().equals("book"))
			id = MediaId.Book;
		else
			id = MediaId.DVD;
		
		System.out.print("\nEnter title: ");
		input = new Scanner(System.in);
		String title = input.nextLine();
		
		System.out.print("\nEnter category: ");
		input = new Scanner(System.in);
		String category = input.nextLine();
		
		System.out.print("\nEnter cost: ");
		input = new Scanner(System.in);
		float cost = input.nextFloat();
		
		
		
		return new Media(title, category, cost, id);
	}
}
