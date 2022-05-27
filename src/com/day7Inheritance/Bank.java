package com.day7Inheritance;

public class Bank {
	
	String branchName;
	String ifscCode;
	
	void displayDetails() {
		branchName=branchName;
		ifscCode=ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	

}

class Axis extends Bank{
	double rateOfInterest=3.64;
	
	@Override
	void displayDetails() {
		branchName=branchName;
		ifscCode=ifscCode;
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
}
class ICICI extends Bank{
	double rateOfInterest=4.3;
	@Override
	void displayDetails() {
		branchName=branchName;
		ifscCode=ifscCode;
	}
}





//branchName: String
//IfscCode: String


//rateOfInterest: double