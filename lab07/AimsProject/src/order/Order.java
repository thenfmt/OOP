package order;

import java.util.ArrayList;
import java.util.List;

import dvd.DVD;
import media.Media;

public class Order {
	
	private List<Media> itemsOrdered = new ArrayList<Media>();
	private String dateOrdered;
	
	public Order() {
	}
	
	public void addMedia(Media media) {
		boolean checkDup = false;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i) == media)
				checkDup = true;
		}
		if(!checkDup && media!=null)
			itemsOrdered.add(media);
	}
	
	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}
	
	public void removeMedia(int id) {
		itemsOrdered.remove(id);
	}
	
	public void printOrders() {
		System.out.println("\n\n*********************Order************************");
		System.out.println("Date: " + getDateOrdered());
		for(int i = 0; i < itemsOrdered.size(); i++) {
			
			System.out.println("Item " + (i+1) + ": " +  itemsOrdered.get(i).getTitle()
									+ " - " + itemsOrdered.get(i).getCategory()
									+ " - " + itemsOrdered.get(i).getCost());
		}
		System.out.println("Total cost : " + totalCost());
		System.out.println("**************************************************\n\n");
	}
	
	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			cost += itemsOrdered.get(i).getCost();
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
