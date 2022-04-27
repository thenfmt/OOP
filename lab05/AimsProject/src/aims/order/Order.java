package lab05.AimsProject;

public class Order {
	public static final int Max_Order = 20;
	private DVD itemsOrdered[] = new DVD[Max_Order];
	private int nbOrdered = 0;
	private String dateOrdered;
	
	public void addDVD(DVD dvd) {
		if(Max_Order-nbOrdered >= 1)
			itemsOrdered[nbOrdered++] = dvd;
	}
	
	public void addDVD(DVD[] dvdList) {
		for(int i = 0; i < Math.min(Max_Order-nbOrdered, dvdList.length); i++) {
			itemsOrdered[nbOrdered++] = dvdList[i];
		}
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
	
	public void addDVD(DVD dvd1, DVD dvd2) {
		if(Max_Order-nbOrdered >= 1)
			itemsOrdered[nbOrdered++] = dvd1;
		
		if(Max_Order-nbOrdered >= 1)
			itemsOrdered[nbOrdered++] = dvd2;
	}
	
	public void printOrders() {
		System.out.println("\n\n*********************Order************************");
		System.out.println("Date: " + getDateOrdered());
		for(int i = 0; i < nbOrdered; i++) {
			
			System.out.println(i+1 + " DVD - " + itemsOrdered[i].getTitle()
									+ " - " + itemsOrdered[i].getCategory()
									+ " - " + itemsOrdered[i].getDirector()
									+ " - " + itemsOrdered[i].getLength()
									+ " - " + itemsOrdered[i].getCost());
		}
		System.out.println("Total cost : " + totalCost());
		System.out.println("**************************************************\n\n");
	}
	
	public void printItems(DVD dvd, String description) {
		System.out.println(description + dvd.getTitle()
				+ " - " + dvd.getCategory()
				+ " - " + dvd.getDirector()
				+ " - " + dvd.getLength()
				+ " - " + dvd.getCost());
	}
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < nbOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}

	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public void searchInOrder(String title) {
		for(int i = 0; i < nbOrdered; i++) {
			if(itemsOrdered[i].search(title)) {
				System.out.println("Found: " + itemsOrdered[i].getTitle()
						+ " - " + itemsOrdered[i].getCategory()
						+ " - " + itemsOrdered[i].getDirector()
						+ " - " + itemsOrdered[i].getLength()
						+ " - " + itemsOrdered[i].getCost());
			}
		}
	}
	public DVD getALuckyItem() {
		int luckyIndex = (int)(Math.random() % nbOrdered);
		itemsOrdered[luckyIndex].setCost(0); //free the lucky item
		
		return itemsOrdered[luckyIndex];
	}
}
