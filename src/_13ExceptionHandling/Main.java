package _13ExceptionHandling;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		
//		<<------------------try------------------>>
		try {
		System.out.println("start of main..");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		String message = null;
		
		int num3 = num1 / num2;
		if(num3 > 10){
			message = "Welcome to Exception Handling ";
		}
		sc.close();
		
		System.out.println("Message is :"+message.toUpperCase());
		System.out.println("end of main");
		
		
		}
		
		
//		<<--------------------Catch-------------------->>
		catch(ArithmeticException ae)
		{
			System.out.println("num2 should not be 0");
		}
		catch(InputMismatchException i)
		{
			System.out.println("Please enter valid number");
		}
		catch(NullPointerException n)
		{
			System.out.println("String value is null");
		}
		
		}

}
