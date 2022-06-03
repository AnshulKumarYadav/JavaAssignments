package _12RegularExpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean m =  Pattern.matches("[6789]{1}\\d{9}",mobileNum);
		boolean a =  Pattern.matches("\\d{12}", aadharCard);
		boolean n =  Pattern.matches("[a-zA-Z]{3,8}", name);
		
		if(m==true && a==true &&n==true)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the mobile number: ");
		String mobile = sc.next();
		System.out.println("Enter the aadhar number: ");
		String aadhar = sc.next();
		
		Citizen citizen = new Citizen(name,mobile,aadhar);
		
		
		
		Demo demo = new Demo();
		boolean a =  demo.validate(name,mobile,aadhar);
		if(a==true)
		{
			citizen.display();
		}
		else {
			
			System.out.println("Invalid details please try again");
		}
		sc.close();
	}
}
