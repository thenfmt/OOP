package book;


import media.Media;
import media.MediaId;

public class Book extends Media{
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, float cost, MediaId id) {
		super(title, category, cost, id);
	}
}
