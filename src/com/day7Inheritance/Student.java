package com.day7Inheritance;

public class Student {
	int stuId;
	String studName;
	double examFee;
	
	void displayDetails() {
		
	}
	
	double payFee() {
		
	}
	
	abstract void Fee();
	

}

class DayScholar{
	double transportFee;
}
class Hosteller{
	double hostelFee ;
	
	abstract void fees();
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