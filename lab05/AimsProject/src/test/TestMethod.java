package test;

import dvd.DVD;
import order.Order;

public class TestMethod {

	public static void main(String[] args) {
		
		Order orders = new Order();
		orders.setDateOrdered("20/04/2020");
		
		DVD dvd[] = new DVD[3];
		
		dvd[0] = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);	
		dvd[1] = new DVD("Star Wars", "Science Friction", "George Lucas", 124, 24.95f);
		dvd[2] = new DVD("Aladdin", "Animation", "John Musker", 90, 18.99f);
		
		orders.addDVD(dvd[0]); // add 1 dvd
		
		orders.addDVD(dvd[0], dvd[1]); // add 2 dvds
		
		orders.addDVD(dvd); // add list of dvd(3 dvds)
		
		orders.printOrders();
		

	}

}
