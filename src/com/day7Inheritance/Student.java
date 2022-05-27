package com.day7Inheritance;

public class Student {
	int stuId;
	String studName;
	double examFee;
	
	void displayDetails() {
		
	}
	
	double payFee() {
		double a = 334.66;
		return a;
		
		
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
}

class DayScholar extends Student{
	double transportFee;
}
class Hosteller extends Student{
	double hostelFee ;
	public Hosteller() {
		// TODO Auto-generated constructor stub
	}
	
	
}
//Class Student:
//Instance Variables:
//studId : integer,
//studName :String,
//examFee:double
//Methods:
//displayDetails(): void,
//payFee() :double
//Provide suitable constructors
//Class DayScholar :
//Instance Variables :
//transportFee: doubleMethods:
//
//Class Hosteller :
//Instance Variables:
//hostelFee: double
//Provide suitable constructors

/*
 * Create a “Main Class”. In this create two objects for each DayScholar and
 * Hosteler classes. Invoke payFee() method with suitable amount and obtain the
 * remaining amount to be paid.
 */