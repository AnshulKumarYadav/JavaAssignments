package com.objectCollaboration;

public class Students {
//	-------------------------------------------------------------Java Beans class-------------------------------------------------------
	
	
	
	
//  ---------------------Parameters as private for java beans-------------------------------------------
	private int roll;
	private String name;
	private int age;
	private int marks;
//	----------------------------------------------------------------------------------------------------
	
	
	
	
//	----------------------------------------Default Constructor-------------------------------------
//	--------------------zero argument constructor-------------------
	public Students() { 
		// TODO Auto-generated constructor stub
	
	}
	
//	-----------------Parameterized constructor---------------------
	public Students(int roll,String name,int age,int marks) {
		// TODO Auto-generated method stub
		this.roll=roll;
		this.name = name;
		this.age=age;
		this.marks=marks;

	}
	
//	------------------------------------------------------------------------------------------
	
	
	
//	------------------------------static function to show details----------------------------------------------
	
	public void showDetails()
	{
		System.out.println("The rollNumber is: "+roll);
		System.out.println("The name is: "+name);
		System.out.println("The age is: "+age);
		System.out.println("The marks are: "+marks);
	}
	
	
	
	
//	-----------------------------------------------------------------------------------------------------------
	
	
	
	
	
//	---------------------------------------------getter and setters---------------------------------------
	
//	--------------------------------------------
	public void setRoll(int roll) {  //setter for roll
		this.roll = roll;
	}
	public int getRoll() { //getter for roll
		return roll;
	}
//	--------------------getter setter for name-------------------------
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
//	-------------------getter setter for age--------------------------
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		if(age>18 && age<60)
		{
		return age;
		}
		else return 0;
	}
//	--------------------getter setter for marks-------------------------
	public void setMarks(int marks) {
		
		this.marks = marks;
	}
	public int getMarks() {
		if(marks>0 && marks<500)
		{
		return marks;
		}
		else return 0;
	}
//	-------------------------------------------------------------------------------------------------------
	
	
}
//----------------------------------Students class end-----------------------------------------------------------------------





// ----------------------------------------------------------Show class to show details-----------------------------------------------











/*
 * Create a Java Bean class Student with the following fields : 
 * roll: Integer
 * name: String 
 * age: Integer
 *  marks: Integer
 *   Make ensure that encapsulation is
 * maintained. Make validation checks before setting the age and marks of the
 * Student (i.e. are they in the valid range,18<age<60, 0<marks<500). Inside a
 * Separate class main method, Create 2 objects of the Student class one by
 * using the zero-argument constructor and the second by using the parameterized
 * constructor. Print the details of both the Student objects.
 */
