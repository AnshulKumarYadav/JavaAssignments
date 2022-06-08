package _15DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DOB {
	public void dobAuthentication(String dob) throws InvalidDateFormat{
		
		LocalDate ld = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		LocalDate curDate = LocalDate.now();

		Period period = Period.between(ld, curDate);

		if (ld.isAfter(curDate)) {
			System.out.println("Date should not be in Future");
		} 
		else{
			System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
		}
		
		throw new InvalidDateFormat("Invalid Date Format");
		


		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date of birth in the form of DD/MM/YYYY");
		String dob = sc.next();
		
		DOB p = new DOB();

		try {
			p.dobAuthentication(dob);
		} catch (InvalidDateFormat e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
