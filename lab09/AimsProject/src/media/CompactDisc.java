package media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable, Comparable{
	
	public String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost, MediaId id) {
		super(title, category, director, length, cost, id);
	}
	
	public void updateLength() {
		super.setLength(9);
	}
	
	public void addTrack(Track track) {
		boolean checkExist = false;
		for(int i = 0; i <tracks.size(); i++) {
			if(tracks.get(i).equals(track)) {
				checkExist = true;
				break;
			}
		}
		
		if(!checkExist) 
			tracks.add(track);
	}
	
	public void play() {
		System.out.println("Playing Compact Disc: ");
		System.out.println("Total length: " + getLength() + "\nList of tracks: ");
		
		for(int i = 0; i < tracks.size(); i++) {
			Track track = tracks.get(i);
			System.out.println("Disc " + (i+1) + ": " + track.getTitle() + " - " + track.getLength());
		}
	}
	
	public void removeTrack(Track track) {
		tracks.remove(track);
	}
	


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
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
