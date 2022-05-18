package com.anshul;

public class switchMethod {
	
	public static void main(String[] args) {
		String city = "Mumbai";
		
		switch (city) {
		case "Mumbai": System.out.println("Financial city");
			break;
		case "Kolkata": System.out.println("City of Joy");
		break;
		case "Delhi": System.out.println("Capital of the country");
		break;
		case "Banglore" : System.out.println("Cyber City");
		break;
		default: System.out.println("May be Other Indian City");
			break;
		}
	}

}


//if city.equals("Mumbai") then print
//"Financial city"
//if city.equals("Kolkata") then print
//"City of Joy"
//if city.equals("Delhi") then print
//"Capital of the country"
//if city.equals("Bangalore") then print
//"Cyber City"
//otherwise
//"May be Other Indian City"