
public class Order {
	public static final int Max_Order = 10;
	private DVD itemsOrdered[] = new DVD[Max_Order];
	int nbOrdered = 0;
	
	public void addDVD(DVD dvd) {
		itemsOrdered[nbOrdered++] = dvd;
	}
	
	public void removeDVD(DVD dvd) {
		for(int i = 0; i < nbOrdered; i++) {
			if(itemsOrdered[i]== dvd) {
				for(int j = i; j < nbOrdered-1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				nbOrdered--;
			}
		}
	}
	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < nbOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
}
