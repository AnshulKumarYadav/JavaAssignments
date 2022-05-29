package _day9AccessModifier;

public class Parent {
	
	void method1() {
		System.out.println("Method 1 belongs to Parent class");
		System.out.println("number is: "+numb);
	}
	void method2() {
		System.out.println("Method 2 belongs to Parent Class");
	}
	void method3() {
		System.out.println("Method 3 belongs to Parent Class");
	}
	
	final int number=5;
	
	public Parent() {
		
	}
	int numb;
	public Parent(int num){
		this.numb=num;
		if(num>1 && num<10)
		{
		  method1();
		}
		else {
			System.out.println("Invalid Number");
		}
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent(9);
//		parent.method1();
		parent.method2();
		parent.method3();
		Child child = new Child();
		child.method1();
		child.method4();
		
	}
	
	

}

class Child extends Parent{
	@Override
	void method1() {
		System.out.println("Method 1 belongs to Child Class");
	}
	
	void method4() {
		System.out.println("Method 4 belongs to Child Class");
	}
	
	
}


//method1(): void
//method2(): void
//method3(): void

//And the following Final filed:
//number: integer

/*
 * While creating the child class object of the above class, take a positive
 * number from
 * 
 * the user between the range of 1 to 10, and initialize the value of the number
 * variable of the parent class otherwise print “Invalid number”.From method1()
 * print the value of the number variable.
 * 
 * Call method1(), method2(), method3() and method4() from the parent class
 * variable. Note: Inside each method body mention this method belongs to which
 * class
 */
