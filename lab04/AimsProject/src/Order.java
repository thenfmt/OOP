
public class Order {
	public static final int Max_Order = 20;
	private DVD itemsOrdered[] = new DVD[Max_Order];
	private int lengthOrdered = 0;
	private String dateOrdered;
	
	public void addDVD(DVD dvd) {
		if(Max_Order-lengthOrdered >= 1)
			itemsOrdered[lengthOrdered++] = dvd;
	}
	
	public void addDVD(DVD[] dvdList) {
		for(int i = 0; i < Math.min(Max_Order-lengthOrdered, dvdList.length); i++) {
			itemsOrdered[lengthOrdered++] = dvdList[i];
		}
	}
	
	public void removeDVD(DVD dvd) {
		for(int i = 0; i < lengthOrdered; i++) {
			if(itemsOrdered[i]== dvd) {
				for(int j = i; j < lengthOrdered-1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				lengthOrdered--;
			}
		}
	}
	
	public void addDVD(DVD dvd1, DVD dvd2) {
		if(Max_Order-lengthOrdered >= 1)
			itemsOrdered[lengthOrdered++] = dvd1;
		
		if(Max_Order-lengthOrdered >= 1)
			itemsOrdered[lengthOrdered++] = dvd2;
	}
	
	public void printOrders() {
		System.out.println("*********************Order************************");
		System.out.println("Date: " + getDateOrdered());
		for(int i = 0; i < lengthOrdered; i++) {
			
			System.out.println(i+1 + " DVD - " + itemsOrdered[i].getTitle()
									+ " - " + itemsOrdered[i].getCategory()
									+ " - " + itemsOrdered[i].getDirector()
									+ " - " + itemsOrdered[i].getLength()
									+ " - " + itemsOrdered[i].getCost());
		}
		System.out.println("Total cost : " + totalCost());
		System.out.println("**************************************************");
	}
	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < lengthOrdered; i++) {
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
	
}
