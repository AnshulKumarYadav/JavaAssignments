package _22StreamIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Count {
	static void countChar(File f,String c, String s) throws IOException {
		 long length = f.length();
		 
		 FileReader fr = new FileReader(f);
		 char[] characters = new char[(int)length];
		 fr.read(characters);
		 fr.close();
		 int count = 0;
		 for(char i: characters)
		 {
			 if(Character.compare(i, c.charAt(0))==0 || Character.compare(Character.toUpperCase(i), c.charAt(0))==0)
			 {
				 count++;
			 }
		 }
		 System.out.println("************In file below sentences is written***********");
		 System.out.println(" ");
		 BufferedReader br = new BufferedReader(new FileReader("D://DSA/"+s));
			String st =  br.readLine();
			while(st!=null)
			{
				System.out.println(st);
				st = br.readLine();
			}
			System.out.println(" ");
			System.out.println("**************In this file "+c+" is "+count+" times ***************");
	}
	static void fileCheck(String s,String c) throws IOException
	{
		 File f =  new File("D://DSA/"+s);
		 if(f.exists()==false)
		 {
			 f.createNewFile();
			 BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			 bw.write("Hii all thing in this world was very beautiful");
			 bw.newLine();
			 bw.write("In our daily life we use many items but we can't realise good thing always");
			 bw.newLine();
			 bw.flush();
			 bw.close();
			 
			
			 
			countChar(f, c, s);
		 }
		 else {
			countChar(f,c,s);
			 
		 }
	}
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter File Name");
			String fileName = br.readLine();
			System.out.println("Enter character");
			String character = br.readLine();
			if(character.length()==1)
			{
			fileCheck(fileName,character);
			}
			else {
				System.out.println("Enter valid character as a or b or anything else");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
