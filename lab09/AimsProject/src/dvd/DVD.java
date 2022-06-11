package dvd;

import media.Disc;
import media.Media;
import media.Playable;
import media.MediaId;

public class DVD extends Disc implements Playable, Comparable{
	
	public DVD(String title, String category, String director, int length, float cost, MediaId id) {
		super(title, category, director, length, cost, id);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

//	sort by title
//	public int compareTo(Object o) {
//		return this.getTitle().compareTo(((Media)o).getTitle());
//	}
	
	
	//sort by cost
	public int compareTo(Object o) {
		Media obj = (Media)o;
		if(this.getCost() > obj.getCost())
			return 1;
		else if(this.getCost() < obj.getCost())
			return -1;
		
		return 0;
	}


}
