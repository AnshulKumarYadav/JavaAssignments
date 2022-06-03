package _12RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaOccurance {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the paragraph:");
		String paraString = scanner.nextLine();
		
		System.out.println("Enter the word you want to search: ");
		String regexString = scanner.next();
		
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(paraString);
		
		int count = 0;
		while(matcher.find())
		{
			count++;
			System.out.println(matcher.start()+"--------"+matcher.end()+"--------"+matcher.group());
		}
		System.out.println("The no. of occurances: "+count);
		scanner.close();
			
		
	}
}


