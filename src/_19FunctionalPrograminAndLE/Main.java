package _19FunctionalPrograminAndLE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(3, "Aman", 567));
		students.add(new Student(21, "Riyansh", 349));
		students.add(new Student(45, "Raman", 768));
		students.add(new Student(32, "Gyaan", 457));
		students.add(new Student(56, "Naman", 576));
		students.add(new Student(76, "Suman", 986));
		students.add(new Student(1, "Garima", 286));
		
	List<Employee> employeeList = 	students
			.stream()
			.map(s->{
			Employee employee = new Employee();
			employee.setEmployeeId(s.getRoll());
			employee.setEmployeeName(s.getName());
			employee.setSalary(1000*s.getMarks());
			return employee;
		})
			.collect(Collectors.toList());
		for(Employee e: employeeList)
		{
		    System.out.println("The Employee Id is: "+e.getEmployeeId());
		    System.out.println("The Employee Name is: "+e.getEmployeeName());
		    System.out.println("The Employee Salary is: "+e.getSalary());
		    System.out.println("***********************************************");
		}
		
	}
}
