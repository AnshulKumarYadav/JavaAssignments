package com.day7Inheritance;

public class thisAndSuper {
	
	/*
	 * this:- To point an object from a method which is
	 *  under execution because of that object.
	 *  
	 *  super:- A reference variable which is used to refer immediate object class.
	 */
	String name;
	int num;
	
	public thisAndSuper() {
		this.name="Rishabh";
		this.num = 32;
		
	}
	void details()
	{
		System.out.println("The name is: "+name);
		System.out.println("The num is :"+num);
	}
	public static void main(String[] args) {
		thisAndSuper andSuper = new superKey();
		andSuper.details();
	}

}

class superKey extends thisAndSuper{
	String name = "Shyan";
	int num = 48;
	public superKey() {
		    super();
		    System.out.println("The name is: "+name);
			System.out.println("The num is :"+num);
		}
	}
		

