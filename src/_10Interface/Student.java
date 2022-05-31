package _10Interface;

public abstract class Student {
	String name;
	String address;
	
	abstract void getPercentage();
	
	public Student() {
	
	}
	public Student(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
}
