package _17HashCodeEquals;

import java.util.Objects;

public class Song {
	private String movieName;
	private String songName;
	
	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(movieName, other.movieName) && Objects.equals(songName, other.songName);
	}
	
	public Song() {

	}
	
	public Song(String movie, String song) {
		this.movieName = movie;
		this.songName = song;
	}
	
	public void play()
	{
		System.out.println(songName+" of "+movieName+" is playing...! ");
	}
	
}
