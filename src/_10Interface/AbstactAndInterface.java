package _10Interface;

public abstract class AbstactAndInterface {
	/*
	 * Abstract class:- Those classes which are having these type of method that have'nt any body they called abstract classes.
	 * abstract classes may have abstract method but if method is abstract and class is concrete type then there should
	 * be an compile time error.
	 * Objects of a abstract class can not create directly they can create by another child class.
	 * Child class of abstract class should have to abstract or override the methods of parent class.
	 * */
	
	public abstract void func1();
	public abstract void func2();
	
}
class Child extends AbstactAndInterface{

	@Override
	public void func1() {
		System.out.println("I am in child class func1");
		
	}

	@Override
	public void func2() {
		System.out.println("I am in child class func2");
	}
	
}

class Main2{
	
	public static void main(String[] args) {
		AbstactAndInterface a = new Child();
		a.func1();
		a.func2();
	}
}
