package _day9AccessModifier;

public class SuppertInheritance {
	/*
	 * The reason behind this is to prevent ambiguity.
	 * 
	 * Consider a case where class B extends class A and Class C and both class A
	 * and C have the same method display().
	 * 
	 * Now java compiler cannot decide, which display method it should inherit. To
	 * prevent such situation, multiple inheritances is not allowed in java.
	 */
	
	void display() {
		System.out.println("I am in SupperInheritance class");
	} 
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
	
}

class C{
	void display()
	{
		System.out.println("I am in class C");
	}
}
class B extends SuppertInheritance,C{
	@Override
	void display() {
		System.out.println("I am in class B");
	}
	
}
