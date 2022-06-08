package _14RegularExpression2;

import java.util.Scanner;

public class UserRegistration {
	public void registerUser(String username,String userCountry)throws InvalidCountryException {
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			throw new InvalidCountryException("User Outside India");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.next();
		System.out.println("Enter Country: ");
		String country = sc.next();
		try {
			UserRegistration u = new UserRegistration();
			u.registerUser(username, country);
		}
		catch(InvalidCountryException i) {
			System.out.println(i.getMessage());
		}
		sc.close();
	}
}
