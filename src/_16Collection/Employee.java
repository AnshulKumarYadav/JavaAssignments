package _16Collection;


import java.util.Scanner;

public class Employee implements Comparable<Employee> {
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee() {}
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e) {
		return e.getSalary()>this.getSalary() ? +1:-1;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}
	
	
}

class EmMain{
	public static void main(String[] args) {
		try {
			treeSortSalary s = new treeSortSalary();
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter EmployeeId: ");
			int id = scanner.nextInt();
			System.out.println("Enter EmployeeName: ");
			String name = scanner.next();
			System.out.println("Enter "+ name +"'s Salary: ");
			double salary = scanner.nextDouble();
			s.add(new Employee(id,name,salary));
		}
//		s.add(new Employee(89,"Anshul",120000));
//		s.add(new Employee(12,"Manish",135000));
//		s.add(new Employee(76,"Vivek",118000));
//		s.add(new Employee(2,"Rabinarayan",10000));
//		s.add(new Employee(99,"Ram",80000));


		System.out.println(s.viewEmployees());
		scanner.close();
		}
		catch (Exception e) {
			System.out.println("Please enter correct details!");
		}
	}
}





