package book;

import media.MediaId;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("A title", "A category", 20, MediaId.Book);
		book.setContent("a a b b b c c c");
		
		System.out.println("information of current book: " 
				+ book.toString());
	}

}
