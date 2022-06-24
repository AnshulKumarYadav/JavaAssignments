package _16Collection;

import java.util.Set;
import java.util.TreeSet;

public class treeSortSalary {
	Set<Employee> employees = new TreeSet<>();
	public void add(Employee e) {
		employees.add(e);
	}
	public Set<Employee> viewEmployees()
	{
		return employees;
	}
}
