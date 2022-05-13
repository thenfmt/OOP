package dvd;

import media.Media;
import media.MediaId;

public class DVD extends Media{
	private String director;
	private int length;
	
	public DVD(String title, String category, String director, int length, float cost, MediaId id) {
		super(title, category, cost, id);
		this.director = director;
		this.length = length;
	}
	
	public boolean search(String title) {
		title = title.toLowerCase();
		String[] token = title.split(" ");
		
		String dvdTitle = this.getTitle().toLowerCase();
		
		for(String tk : token) {
			if(dvdTitle.contains(tk)) {
				return true;
			}
		}
		
		return false;
	}
	
	

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
