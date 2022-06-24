package _18Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Student{
	private int roll;
	private String name;
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		Map<String, Student> h = new HashMap<>();
		h.put("U.P", new Student(29,"Anshul",43));
		h.put("Maharastra", new Student(27,"Timans",98));
		h.put("Hyderabad", new Student(12,"Manish",78));
		h.put("Gujrat", new Student(33,"Rihan",35));
		h.put("Karnatka", new Student(43,"Frahab",75));
		h.put("Tamil Nadu", new Student(24,"Timans",25));
		
		
		
		 Set<String> keySet= h.keySet();

	       // List<String> list=new ArrayList<>(keySet);
	        System.out.println(keySet);
	        System.out.println();
	        Set<Map.Entry<String,Student>> entrySet=h.entrySet();

	        List<Map.Entry<String,Student>> listOfStudent=new ArrayList<>(entrySet);


	        Collections.sort(listOfStudent,(e1,e2)->e1.getValue().getMarks()>e2.getValue().getMarks() ? 1:-1);
	        System.out.println(listOfStudent);
	        

	        Collections.sort(listOfStudent,MethodReferenceForComparator::CompareStudentRoll);
	        System.out.println(listOfStudent);
				
		
	}
	
}
