package _17HashCodeEquals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
		PlayList playList = new PlayList();
		Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=4;i++)
		{
			System.out.println("Enter the "+ i+ "th movie name: ");
			String movieString = scanner.next();
			System.out.println("Enter the "+i+"th song name: ");
			String songName = scanner.next();
			Song song = new Song(movieString,songName);
			
			playList.addSong(song);
			
			
		}
		scanner.close();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
}
