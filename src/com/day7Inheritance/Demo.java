package com.day7Inheritance;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String Bank) {
		if(Bank.equals("Axis")) {
			Bank axisBank = new Axis();
			axisBank.setBranchName("Mumbai");
			axisBank.setIfscCode("ASDSDDDS");
			axisBank.displayDetails();
			return axisBank;
		}
		else if(Bank.equals("ICICI"))
		{
			Bank iciciBank = new ICICI();
			iciciBank.setBranchName("Noida");
			iciciBank.setIfscCode("ICIHU00J7");
			iciciBank.displayDetails();
			return iciciBank;
		}
		else {
			System.out.println("null");
		}
		Bank s = new Bank();
		return s;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank: ");
		String Bank = sc.next();
		sc.close();
		Bank bank = new Bank();
		System.out.println(getBank(Bank));
		
		
	}

}
