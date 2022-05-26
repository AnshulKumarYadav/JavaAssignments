package com.day6Arrays;

public class CLA_factorial {

	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if(args.length==1)
		{
			System.out.println("The number is: "+a);
		int multi = 1;
		for(int i=a;i>0;i--)
		{
			multi=multi*i;
		}
		System.out.println("The factorial is : "+multi);
		}
		else if(args.length==2)
		{
			int multi = 1;
			int b = Integer.parseInt(args[1]);
			System.out.println("The two numbers are : "+a+" "+b);
			int diff = Math.abs(a-b);
			System.out.println("Difference of two numbers is: "+diff);
			for(int i=diff;i>0;i--)
			{
				multi*=i;
			}
			System.out.println("The factorial is : "+multi);
		}
		else {
			System.out.println("Error");
		}
	}
}
