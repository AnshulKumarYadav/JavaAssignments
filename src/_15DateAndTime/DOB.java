package _15DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DOB {
	public static void main(String[] args) throws InvalidDateFormat{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date of birth in the form of DD/MM/YYYY");
		String dob = sc.next();
		
		LocalDate ld = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		LocalDate curDate = LocalDate.now();

		Period period = Period.between(ld, curDate);

		if (ld.isAfter(curDate)) {
			System.out.println("Date should not be in Future");
		} 
		else{
			System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");
		}
		sc.close();
		throw new InvalidDateFormat("Invalid Date Format");
		
	}
}
