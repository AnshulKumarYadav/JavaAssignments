package com.oops;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("RollNo is :" +roll);
		System.out.println("Name is:" +name);
		System.out.println("Marks:"+marks);
		
	}
	
	public static void main(String[] args) {
		Student  s = new Student();
		
		int roll = s.roll = 14;
		String name = s.name = "Rishabh";
		int marks = s.marks = 49;
		
		Student  s2= s;
		
		int roll2 = s2.roll = 114;
		String name2 = s2.name = "Ram";
		int marks2 = s2.marks = 54;
		
		
		s.displayStudentDetails(roll,name,marks);
		s2.displayStudentDetails(roll2, name2, marks2);
		
		
	}

}


/*
 * Create a class Student with 3 instance variables: roll: int name: String
 * marks: int Create a non-static method inside the Student class:
 * displayStudentDetails: void
 * 
 * inside the above method print all the details of the student in the following
 * format:
 * 
 * Roll is :
 * 
 * Name is :
 * 
 * Marks is :
 * 
 * From the main method of the Student class create 2 Student class objects and
 * sets the proper details to both objects and call the above
 * displayStudentDetails method on the both student objects.
 * 
 * After calling the method on both student objects, make both the object
 * eligible for the garbage collector.
 */