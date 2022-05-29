package _day9AccessModifier;

import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public Student() {
	}
	
	public void displayDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number: ");
		int r = sc.nextInt();
		System.out.println("Enter name: ");
		String s = sc.next();
		System.out.println("Enter marks: ");
		int m = sc.nextInt();
		
		sc.close();
		
		this.marks=m;
		this.name=s;
		this.roll=r;
		
		System.out.println("The roll is: "+roll);
		System.out.println("The name is: "+name);
		System.out.println("The marks is: "+marks);
		Student student = new Student();
		char a =  student.calculateGrade(m);
		this.grade=a;
		System.out.println("Grade is : "+a);
		System.out.println("-------------------------------");
		
	}
	
	public char calculateGrade(int marks) {
		if(marks>=500)
		{
			return 'A';
		}
		else if(marks<500 && marks>=400)
		{
			return 'B';
		}
		else if(marks<400)
		{
			return 'C';
		}
		return 'n';
	}
	
	

}











//Instance variables
//private roll: int
//private String name
//private int marks
//private char grade



//Provide suitable constructors, and following methods:
//public displayDetails(): void
//private calculateGrade(): char



//if marks ≥ 500 : Grade is A
//if marks < 500 and ≥ 400 : Grade is B
//if marks <400 : Grade is C


/*
 * Override the toString() method to print all the details of Student class.
 * inside the displayDetails() method, create the Student class object by taking
 * (roll, name, marks ) from the user and call the calculateGrade() method to
 * get the Grade of the Student.
 */


/*
 * Create another class Demo in which create two Student objects, and invoke the 
 * displayDetails(). It should also display the student grade.
 * */






