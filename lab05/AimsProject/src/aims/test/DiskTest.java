package lab05.AimsProject;

public class DiskTest {

	public static void main(String[] args) {
		Order orders = new Order();
		orders.setDateOrdered("20/04/2020");
		
		DVD dvd[] = new DVD[3];
		
		dvd[0] = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);	
		dvd[1] = new DVD("Star Wars", "Science Friction", "George Lucas", 124, 24.95f);
		dvd[2] = new DVD("Harry Potter", "Sciencce Friction", "J.K. Rowling", 90, 18.99f);
		
		
		orders.addDVD(dvd); // add list of dvd (3 dvds)
		
		// test search DVD 
		System.out.println("Search an title in list of DVD: ");
		String title;
		orders.printOrders();
		
		title = "Harry";
		System.out.println("Find " + title + " in list of order: ");
		orders.searchInOrder(title);
		
		title = "Potter";
		System.out.println("Find " + title + " in list of order: ");
		orders.searchInOrder(title);
		
		title = "Harry Potter";
		System.out.println("Find " + title + " in list of order: ");
		orders.searchInOrder(title);
		
		// test lucky items
		System.out.println("Random a lucky items: ");
		orders.printOrders();
		DVD luckyItem = orders.getALuckyItem();
		orders.printItems(luckyItem, "Your lucky item is: ");
		orders.printOrders();
	}

}
