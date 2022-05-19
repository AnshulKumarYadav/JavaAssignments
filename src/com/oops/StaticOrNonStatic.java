package com.oops;

public class StaticOrNonStatic {
	
	//Static - static element is that element which we can access directly inside the main method without creating 
		//creating any object
		
		// non-Static - non-static elements are instance variable i.e those element which we can not directly in main method, we should have to 
		// have to create a object to access that variable 
		
		int value=34; //non-static element or instance variable
		
	  public static void main(String[] argus) {
		
		  int value2=28; // static variable 
		    System.out.println(value2);
		    
		    // to access the non- static elements we need to create a object
		    
		StaticOrNonStatic v= new StaticOrNonStatic();
		   System.out.println(v.value);
		    
		  
		   
	}

}
