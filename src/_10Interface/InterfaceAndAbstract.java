package _10Interface;

public interface InterfaceAndAbstract {
	/*
	 * interface:- It should have abstract methods and their object can not created directly.
	 * For inheriting child class should take implements keyword.
	 * Child class of interface should override the parent class or declare abstract class.
	 * 
	 * */
	
	abstract String funcA();
	abstract String funcB();
}

class InterfaceChild implements InterfaceAndAbstract{

	@Override
	public String funcA() {
		return "Hii i am in funcA";
	}

	@Override
	public String funcB() {
		return "Hii i am in funcB";
	}
	
}
class MainInterface{
	public static void main(String[] args) {
		InterfaceAndAbstract inter = new InterfaceChild();
		String aString =  inter.funcA();
		System.out.println(aString);
		String bString = inter.funcB();
		System.out.println(bString);
		
	}
}
