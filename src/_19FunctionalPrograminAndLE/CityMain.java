package _19FunctionalPrograminAndLE;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CityMain {
	public static void main(String[] args) {
		
//		<<-------------------------------Using array list---------------------------->>
//		List<citites> list = new ArrayList<>();
//		list.add(new citites("Agra"));
//		list.add(new citites("Kanpur"));
//		list.add(new citites("Hyderabad"));
//		list.add(new citites("Banglore"));
//		list.add(new citites("Chennai"));
//		list.add(new citites("Mumbai"));
//		list.add(new citites("Oddisa"));
		
		
//		<<-------------------------Using array class----------------------------------->>
		List<citites> list =  Arrays.asList(new citites("Agra"),new citites("Kanpur"),new citites("Hyderabad"),new citites("Banglore"),new citites("Chennai"),new citites("Mumbai"),new citites("Oddisa"));
			System.out.println(list);
			
		Collections.sort(list,(s1,s2)->s1.getCity().compareTo(s2.getCity()));
		
		for(citites t:list)
		{
			System.out.println("City : "+t.getCity());
		}
		
	}
		
	
}
