package _22StreamIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) throws IOException {
		
			FileReader f = new FileReader(new File("D://DSA/asd.txt"));
			int line = f.read();
			
			while(line!=-1)
			{
				System.out.print((char)line);
				line = f.read();
			}
	
	}
}
