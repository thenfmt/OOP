package book;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import media.Media;
import media.MediaId;

public class Book extends Media implements Comparable{
	String content = "Default Default";
	List<String> contentTokens = new ArrayList<String>();
	Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, float cost, MediaId id) {
		super(title, category, cost, id);
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		processContent();
	}
	
	public void processContent() {
		String[] arr = content.split(" ");
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			contentTokens.add(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			int frequency = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) == 0)
					frequency++;
			}
			wordFrequency.put(arr[i], frequency);
		}
		
	}
	
	public String toString() {
		String infor = "\ntitle: " + getTitle() 
				+ "\ncategory: " + getCategory() 
				+ "\ncontent: " + getContent()
				+ "\nToken length: " + contentTokens.size()
				+ "\nWord frequency: \n";
		
		for(Map.Entry<String, Integer> e : wordFrequency.entrySet()) {
			infor = infor + e.getKey() + " - " + e.getValue() + "\n";
		}
		
		return infor;
	}
}
