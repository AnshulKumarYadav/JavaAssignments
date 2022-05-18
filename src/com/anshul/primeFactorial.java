package com.anshul;

public class primeFactorial {
	
	static void prime( int num)
	{
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)//if flag is false
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
	}
	
	public static void main(String[]args) {
		int num = 5;
		prime(num);
	}

}


/*
 * PRIME FACTORIAL The prime factors of a number are all of the integers below
 * that number that are divisible into the number as well as 1. For example, the
 * prime factors of 12 are 1,2,3,4,6, and 12. Write a Java class with a static
 * method that will take a number and print all the prime factorial of that
 * number. The Supplied number should be between 2 and 100. otherwise, it should
 * print “Invalid number”. Call this method from the main method by suppling any
 * valid argument.
 */