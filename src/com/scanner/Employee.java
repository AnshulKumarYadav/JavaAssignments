package com.scanner;

import java.util.Scanner;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	 public void calculateNetSalary(int pfpercentage) {
	
	 }
	 
	 public static Employee getEmployeeDetails() {
		 
	 }
	 public static int getPFPercentage() {
		 
	 }
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int employeeId = sc.nextInt();
		System.out.println("Enter Name:");
		String employeeName = sc.next();
		System.out.println("Enter Salary:");
		double salary = sc.nextDouble();
		System.out.println("Enter PF percentage:");
		double netSalary = sc.nextDouble();
		
	}
	 
}

//Enter Id: 101 Enter Name: Vivek Enter salary: 20000 Enter PF percentage: 7

//int employeeId
//String employeeName
//double salary
//double netSalary