package _14RegularExpression2;

import java.util.Scanner;

public class Account {
	String accountNumber;
	double Balance;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public void deposit(double amount) {
		Balance = amount;
	}
	
	public double withdraw(int amount) throws InsufficientFundsException {
		if(amount>Balance)
		{
			throw new InsufficientFundsException("Insufficient Fund In Your Account");
		}
		else {
		   Balance=Balance-amount;
		}
		return Balance;
	}
}

class AccountDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bank account number: ");
		String accountNumber = sc.next();
		
		System.out.println("Deposit the amount: ");
		double amount = sc.nextInt();
		
		System.out.println("Enter amount to be withdraw: ");
		int amount2 = sc.nextInt();

		Account account = new Account();
		
		account.deposit(amount);
		
		try {
		 	double withdraw = account.withdraw(amount2);
		 	System.out.println("The remaining amount is: "+withdraw);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		account.setAccountNumber(accountNumber);
		sc.close();
	}
}