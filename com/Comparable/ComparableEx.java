package com.Comparable;

import java.util.Set;
import java.util.TreeSet;


public class ComparableEx {
	public static void main(String[] args) {
		new ComparableEx().comparableEmployee();
			}
	void comparableEmployee(){
		Employee emp1 = new Employee(3, "Candy");
		Employee emp2  = new Employee(2, "Piya");
		Employee emp3  = new Employee(1, "Akshay");
		
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		
		System.out.println("\n Sorting by Employee's Name ");
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
		
	}

}

class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	
	public Employee (int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getempId() {
		return empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return this.getempName().compareTo(e.empName);
	}
	
	
	
}