package dvd;

import media.Disc;
import media.Playable;
import media.MediaId;

public class DVD extends Disc implements Playable{
	
	public DVD(String title, String category, String director, int length, float cost, MediaId id) {
		super(title, category, director, length, cost, id);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
