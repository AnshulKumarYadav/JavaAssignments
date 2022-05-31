package _10Interface;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		
		if(amount>1000)
		{
			Hotel tajHotel = new TajHotel();
			TajHotel tajHotel2 = (TajHotel)tajHotel;
			tajHotel2.welcomeDrink();
			return tajHotel;
		}
		else if(amount>200 && amount<1000)
		{
			Hotel hotel = new RoadSideHotel();
			return hotel;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount = sc.nextInt();
		if(amount<200)
		{
			System.out.println("Enter a valid amount: ");
		}
		else {
			Demo demo = new Demo();
			Hotel hotel = demo.provideFood(amount);
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}
		sc.close();
	}
}
