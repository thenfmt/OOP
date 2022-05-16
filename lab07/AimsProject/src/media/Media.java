package media;
import java.util.ArrayList;
import java.util.List;

public abstract class Media {
	private String title;
	private String category;
	private float cost;
	private MediaId id;
	private List<String> authors = new ArrayList<String>();
	
	public Media(String title) {
		this.title = title;
	}
	
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	
	public Media(String title, String category, float cost, MediaId id) {
		this(title);
		this.category = category;
		this.cost = cost;
		this.id = id;
	}
	
	
	public void addAuthor(String authorName) {
		boolean checkExist = false;
		for(int i = 0; i <authors.size(); i++) {
			if(authors.get(i).equals(authorName)) {
				checkExist = true;
				break;
			}
		}
		
		if(!checkExist)
			authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		authors.remove(authorName);
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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
}
