package _20StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(12,"Raman",856));
		students.add(new Student(4,"Aman",658));
		students.add(new Student(45,"Shyam",423));
		students.add(new Student(9,"Priyanshi",943));
		students.add(new Student(5,"Anamika",543));
		
		students.stream()
		.filter(s->s.getMarks()<800)
		.forEach(s->{
			System.out.println("The roll no is "+s.getRoll());
			System.out.println("The name is "+s.getName());
			System.out.println("The marks are "+s.getMarks());
			System.out.println("**********************************");
		});
	}
}

//"editor.background": "#23272e",

//"editor.selectionBackground": "#67769660",