package _day9AccessModifier;

public class Demo {
	public static void main(String[] args) {
		Student student = new Student();
		student.displayDetails();
		
		System.out.println(student.toString());
		System.out.println("------------------------------");
		
		Student student2 = new Student();
		student2.displayDetails();
		
		System.out.println(student2.toString());
		System.out.println("------------------------------");
		
		
	}
}
