package com.day7Inheritance;

public class Main {
		public static void main(String[] args) {
			
// <<----------------Employee class objects--------------------------->>
			Employee employee = new Employee();
			employee.Salary=15000.98;
			employee.Specialisation="Development";
			employee.Department="Backend";
			employee.printSalary();
			
			Manager manager = new Manager();
			manager.Salary=45000.78;
			manager.Specialisation="Design";
			manager.Department="UI Designer";
			manager.printSalary();
// <<------------------------------------------------------------------>>
			
			
			
			
//	<<----------------Student.java/DayScholar and hosteler class------------>>
			
			DayScholar dayScholar = new DayScholar();
			dayScholar.transportFee=500.98;
			
			
			Hosteller hosteller = new Hosteller();
			hosteller.hostelFee=8000;
			
			
			
			
			
//  <<---------------------------------------------------------------------->>
			
		}
	

}
