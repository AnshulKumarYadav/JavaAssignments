package _12RegularExpression;

public class Citizen {
	private String name;
	private String aadharNumber;
	private String mobileNumber;
	
	public Citizen() {
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name,String aadhar,String mobile)
	{
		this.name = name;
		this.aadharNumber = aadhar;
		this.mobileNumber = mobile;
	}
	void display()
	{
		System.out.println("The name is: "+name);
		System.out.println("The mobile number is: "+mobileNumber);
		System.out.println("The aadhar number is: "+aadharNumber);
		
	}
	
}
