
public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Friction", "George Lucas", 124, 24.95f);
		anOrder.addDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladdin", "Animation", "John Musker", 90, 18.99f);
		anOrder.addDVD(dvd3);
		
		System.out.println("The cost before remove dvd1: " + anOrder.totalCost());
		anOrder.removeDVD(dvd1);
		System.out.println("The cost after remove dvd1: " + anOrder.totalCost());
	}
}
