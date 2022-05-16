package media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	public String artist;
	private int length = 0;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, String director, int length, float cost, MediaId id) {
		super(title, category, director, length, cost, id);
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
	
	
	//get total lenght of List<Track>
	public int getLength() {
		for(int i = 0; i < tracks.size(); i++) {
			this.length += tracks.get(i).getLength();
		}
		return this.length;
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

}
