
public class Order {
	public static final int Max_Order = 10;
	private DVD itemsOrdered[] = new DVD[Max_Order];
	int index = 0;
	
	public void addDVD(DVD dvd) {
		itemsOrdered[index++] = dvd;
	}
	
	public void removeDVD(DVD dvd) {
		index--;
	}
	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < index; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
}
