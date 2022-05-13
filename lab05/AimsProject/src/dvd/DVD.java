package dvd;

public class DVD {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public DVD(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public DVD(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public boolean search(String title) {
		title = title.toLowerCase();
		String[] token = title.split(" ");
		
		String dvdTitle = this.title.toLowerCase();
		
		for(String tk : token) {
			if(dvdTitle.contains(tk)) {
				return true;
			}
		}
		
		return false;
	}
	
}
