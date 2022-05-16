package media;


public class Disc extends Media{
	private int length;
	private String director;
	
	public Disc(String title, String category, String director, int length, float cost, MediaId id) {
		super(title, category, cost, id);
		this.length = length;
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
