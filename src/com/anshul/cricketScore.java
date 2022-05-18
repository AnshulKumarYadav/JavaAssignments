package com.anshul;

public class cricketScore {
	
	public static void score(int ones,int twos,int threes,int fours,int sixes) {
		
		long totalScore = ones + (2*twos)+ (3*threes) + (4*fours) + (6*sixes);
		System.out.println(totalScore);
		
	}
	
	public static void main(String[] args) {
		int ones = 14;
		int twos = 6;
		int threes = 5;
		int fours = 9;
		int sixes = 4;
		
		score(ones,twos,threes,fours,sixes);
	}

}


/*
 * Write a Java class with a static method that will take 5 positive numbers as
 * a parameter which will represent: 1s, 2s, 3s, fours and sixes scored by the
 * batsman.
 * 
 * implement the above method to compute the total run scored by that batsman.
 * 
 * Call this method from the main method of that class and print the result.
 */