package com.oops;

public class vowelOrConsonent {
	
	
	    void alphabets() {
	    	char vowel = 'b';
	
		if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
		{
			System.out.println(vowel);
		}
		else{
			System.out.println("This is not vowel");
		}	
	}
	
	    void consonant() {
		char consonant = 'i';
		if(consonant=='a'||consonant=='e'||consonant=='i'||consonant=='o'||consonant=='u')
		{
			System.out.println("This is not consonent");
		}
		else{
			System.out.println(consonant);
		}

		
	}
	    void invalid()
	{
		char invalid = '3';
		
       byte invalidChar = (byte)invalid;
		
		if((invalidChar>=97 && invalidChar<=122)|| (invalidChar>=60 && invalidChar<=90))
		{
			System.out.println(invalid);
		}
		else {
			System.out.println("Invalid Character");
		}
	}
	public static void main(String[] args) {
		vowelOrConsonent   v = new vowelOrConsonent();
		v.alphabets();
		v.consonant();
		v.invalid();
	}
	    

}

/*
 * VOWEL AND CONSONANT Write a java application with a non-static method that
 * will accept a character (a-z or A-Z) and print if that character is vowel or
 * consonant, if we supply other than (a-z or A-Z) then that method should print
 * the error message.
 * 
 * Call the above method from the main method of the same class 3 times,
 * 
 * first time by supplying a vowel
 * 
 * the second time by supplying a consonant
 * 
 * third time by supplying an invalid character
 */