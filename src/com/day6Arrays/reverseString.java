package com.day6Arrays;

import java.util.Scanner;

public class reverseString {
	
	public static String stringReverse(String s) {
		String bag = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			bag += s.charAt(i);
		}
		return bag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String s = sc.next();
		sc.close();
		String result = stringReverse(s);
		System.out.println("Original String is :"+ s);
		System.out.println("Reversed String is :"+ result);
	}
}
