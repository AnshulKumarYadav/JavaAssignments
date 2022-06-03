package _11InterfaceEnum;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) {
		switch(stadium)
		{
		case EDEN_GARDENS_STADIUM: System.out.println("This is the home ground of KKR");
		break;
		case WANKHEDE_STADIUM: System.out.println("This is the home ground of Mumbai Indians");
		break;
		case CHIDAMBARAM_STADIUM: System.out.println("This is the home ground of CSK");
		break;
		case M_CHINNASWAMY_STADIUM: System.out.println("This is the home ground of RCB");
		break;
		default: System.out.println("Enter valid stadium");
		break;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the stadium");
		String string = scanner.next();
		
		try {
		IPL ipl = new IPL();
		ipl.homeTeamStadium(Stadium.valueOf(string));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
	
}

//If Stadium = EDEN_GARDENS_STADIUM then print “This is the home ground of KKR”
//If Stadium = WANKHEDE_STADIUM then print “This is the home ground of Mumbai Indians”
//If Stadium = CHIDAMBARAM_STADIUM then print “This is the home ground of CSK”
//If Stadium = M_CHINNASWAMY_STADIUM then print “This is the home ground of RCB”