package com.objectCollaboration;


//      <<-------------------------------------------------Student class start--------------------------------------------------------->>
public class Student {
	
//	<<-------------Instance Variable--------------->>
	int roll;
	String name;
	String address;
	String collegeName;
//	<<-------------------------------------------->>
	
//	<<-----------------------getter and setter---------------------->>
//	<<-------------------------------------------->>
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
//	<<-------------------------------------------->>
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
//	<<-------------------------------------------->>
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
//	<<-------------------------------------------->>
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
//	<<--------------------------------------------------------------->>
	
	
	
//	<<-------------Static method------------------>>
	public static Student getStudent(boolean isFromNIT)
	{
		Student student = new Student();
		if(isFromNIT==true)
		{
			
		}
		
	}
//	<<-------------------------------------------->>

	
}


// <<-----------------------------------------------------Demo2 class------------------------------------------------------------------>>
class Demo2{
	
	public static void main(String[] args) {
		Student s = new Student();
		s.getStudent(false);
	}
	
}







//<<------------------------------------------------------------------------------------------------------------------------------------>>

















