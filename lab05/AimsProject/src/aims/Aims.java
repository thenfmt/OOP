package aims;

import dvd.DVD;
import order.Order;

public class Aims {
	public static void main(String[] args) {
		
		Order anOrder = new Order();
		anOrder.setDateOrdered("19/04/2020");
		
		DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Friction", "George Lucas", 124, 24.95f);
		anOrder.addDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladdin", "Animation", "John Musker", 90, 18.99f);
		anOrder.addDVD(dvd3);
		
		anOrder.printOrders();
		
		}
}
