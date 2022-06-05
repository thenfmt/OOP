package aims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import book.Book;
import dvd.DVD;
import media.CompactDisc;
import media.Media;
import media.MediaId;
import media.Track;
import order.Order;

public class Aims {
	
	public static void main(String[] args) {
		Order order = new Order();
		
		List<Media> lst = new ArrayList<Media>();
		
		
		
		CompactDisc cd = new CompactDisc("C title", "C category", "C director", 3, 3, MediaId.CompactDisc);
		cd.addTrack(new Track("C title", 3));
		cd.addTrack(new Track("C_title", 3));
		lst.add(cd);
		
		cd = new CompactDisc("D title", "D category", "D director", 3, 3, MediaId.CompactDisc);
		cd.addTrack(new Track("D title", 3));
		cd.addTrack(new Track("D_title", 3));
		lst.add(cd);
		
		lst.add(new DVD("B title", "B category", "B diretor", 2, 2, MediaId.DVD));
		lst.add(new DVD("A title", "A category", "A director", 1, 1, MediaId.DVD));
		
		
		Iterator iterator = lst.iterator();
		
		System.out.println("--------------------------------------");
		System.out.println("The DVDS currently in the order are: ");
		
		while(iterator.hasNext()) {
			Media md = (Media)iterator.next();
			
			System.out.println("Title: " + md.getTitle()
					+ "   Cost: " + md.getCost());
		}
		
		
		Collections.sort((List)lst);
		
		iterator = lst.iterator();
		System.out.println("---------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		
		while(iterator.hasNext()) {
			Media md = (Media)iterator.next();
			
			System.out.println("Title: " + md.getTitle()
					+ "   Cost: " + md.getCost());
		}
		
		System.out.println("---------------------------------------");
//		while(true) {
//			
//			showMenu();
//			
//			Scanner input = new Scanner(System.in);
//			int chose = input.nextInt();
//			
//			switch(chose) {
//				case 0:
//					System.exit(0);
//			
//				case 1:
//					System.out.println("\nEnter date: ");
//					input = new Scanner(System.in);
//					String date = input.nextLine();
//					
//					order.setDateOrdered(date);
//					order = new Order();
//					break;
//					
//				case 2:
//					order.addMedia(createItems());
//					break;
//					
//				case 3: 
//					input = new Scanner(System.in);
//					int id = input.nextInt();
//					order.removeMedia(id);
//					break;
//				
//				case 4:
//					order.printOrders();
//					break;
//				
//				default:
//					System.out.println("Wrong choice! Please try again: ");
//					break;
//			}
//		}
		
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
		System.out.print("Please choose a number: ");
	}
	
	public static Media createItems() {
		MediaId id = MediaId.DVD;
		
		System.out.print("\nEnter type of Media (Book, DVD, CompactDisc): ");
		Scanner input = new Scanner(System.in);
		String type = input.nextLine();
		
		
		if(type.toLowerCase().equals("book")) {
			
			return createBook();
			
		} else if(type.toLowerCase().equals("dvd")) {
			
			return createDVD();
			
		} else if(type.toLowerCase().equals("compactdisc")) {
			
			return createCompactDisc();
			
		}
		
		return null;
	}
	
	public static Book createBook() {
		MediaId id = MediaId.Book;
		System.out.print("\nEnter book title: ");
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		
		System.out.print("\nEnter book category: ");
		input = new Scanner(System.in);
		String category = input.nextLine();
		
		System.out.print("\nEnter book cost: ");
		input = new Scanner(System.in);
		float cost = input.nextFloat();
		return new Book(title, category, cost, id);
	}
	
	public static DVD createDVD() {
		MediaId id = MediaId.DVD;
		
		System.out.print("\nEnter DVD title: ");
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		
		System.out.print("\nEnter DVD category: ");
		input = new Scanner(System.in);
		String category = input.nextLine();
		
		System.out.print("\nEnter DVD cost: ");
		input = new Scanner(System.in);
		float cost = input.nextFloat();
		
		System.out.print("\nEnter DVD length: ");
		input = new Scanner(System.in);
		int length = input.nextInt();
		
		System.out.print("\nEnter DVD director: ");
		input = new Scanner(System.in);
		String director = input.nextLine();
		
		return new DVD(title, category, director, length, cost, id);
	}
	
	public static CompactDisc createCompactDisc() {
		MediaId id = MediaId.DVD;
		
		System.out.print("\nEnter DVD title: ");
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		
		System.out.print("\nEnter DVD category: ");
		input = new Scanner(System.in);
		String category = input.nextLine();
		
		System.out.print("\nEnter DVD cost: ");
		input = new Scanner(System.in);
		float cost = input.nextFloat();
		
		System.out.print("\nEnter DVD length: ");
		input = new Scanner(System.in);
		int length = input.nextInt();
		
		System.out.print("\nEnter DVD director: ");
		input = new Scanner(System.in);
		String director = input.nextLine();
		
		CompactDisc compactDisc = new CompactDisc(title, category, director, length, cost, id);
		
		System.out.println("How many tracks are there: ");
		input = new Scanner(System.in);
		int nbTrack = input.nextInt();
		
		for(int i = 0; i < nbTrack; i++) {
			System.out.print("\nEnter DVD title: ");
			input = new Scanner(System.in);
			String titleTrack = input.nextLine();
			
			System.out.print("\nEnter DVD length: ");
			input = new Scanner(System.in);
			int lengthTrack = input.nextInt();
			
			compactDisc.addTrack(new Track(titleTrack, lengthTrack));
			compactDisc.updateLength();
			System.out.println(compactDisc.getLength());
		}
		
		return compactDisc;
	}

}
