package com.day7Inheritance;

public class Member {
	
//	<<-----------------Instance variables----------------->>
	String Name;
	int Age;
	String Phone_number;
	String Address;
	double Salary;
	
	void printSalary() {
		System.out.println("The Salary is:" +Salary);
		
	}

}

class Employee extends Member{
	String Specialisation;
	String Department;
	@Override
	void printSalary() {
		System.out.println("The Salary is:" +Salary);
		System.out.println("The specialisation is :"+Specialisation);
		System.out.println("The Department is: "+Department);
		
	}
	
}
class Manager extends Member{
	String Specialisation;
	String Department;
	@Override
	void printSalary() {
		System.out.println("The Salary is:" +Salary);
		System.out.println("The specialisation is :"+Specialisation);
		System.out.println("The Department is: "+Department);
		
	}
	
}



//Name : String
//Age : int
//Phone number : String
//Address : String
//Salary : double

/*It also has a method named 'printSalary' which prints the salary of the members.
 * Create two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members such as. :
Specialisation : String
Department : String
Now, create a Main class which has the main method in it and assign name, age, phone
number, address and salary to an employee and a manager by making an object of both
of these classes and print the same.
 */