package _22StreamIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadBuffer {
	
	public static void main(String[] args) {
		try {
			File f = new File("D://DSA/asd.txt");
			f.createNewFile();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write("Hii, I am Rohan");
			bw.newLine();
			bw.write("And i am a software developer");
			bw.flush();
			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader("D://DSA/asd.txt"));
			String s =  br.readLine();
			while(s!=null)
			{
				System.out.println(s);
				s = br.readLine();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
