package _15DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {
	
	public double authenticate(String joiningDate) throws InvalidAgeException{
		LocalDate localDate  = LocalDate.now();
		LocalDate ld = LocalDate.parse(joiningDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Period period = Period.between(localDate, ld);
		double bonus=0;
		if(period.getYears()<1 && period.getYears()>0)
		{
			bonus=5000;
			return bonus;
		}
		else if(period.getYears()>=1 && period.getYears()<2)
		{
			bonus=8000;
			return bonus;
		}
		else if(period.getYears()>=2)
		{
			bonus=10000;
			return bonus;
		}
		else if(localDate.isBefore(ld)==true)
		{
			throw new InvalidAgeException("Age should not be in future");
		}
		else {
			throw new InvalidAgeException("Please pass date in correct format");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the joining date in the dd/MM/yyyy format");
		String joiningDate = scanner.next();
		EmployeeBonus employeeBonus = new EmployeeBonus();
		try {
			System.out.println(employeeBonus.authenticate(joiningDate));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
}
