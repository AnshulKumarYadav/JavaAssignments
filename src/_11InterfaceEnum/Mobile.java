package _11InterfaceEnum;

//import java.util.Scanner;

public class Mobile {
	private String[] outdatedModels = {"note4","note5","note6","note7"};
	public void searchOutdatedModel(String company,String... model) {
		String bag="Your mobile is not outdated" ;
		for(int i=0;i<model.length;i++)
		{
			if(model[i]==outdatedModels[i])
			{
				bag =  model[i]+"_OUTDATED";
			}
			System.out.println(bag);
		}
	}
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter model name");
//		String company = scanner.next();
//		System.out.println("Enter model number");
//		int num = scanner.nextInt();
//		
//		String s = company + num; 
		
		Mobile mobile = new Mobile();
		mobile.searchOutdatedModel("note9","note9","note5","note6");
//		scanner.close();
	}
}
