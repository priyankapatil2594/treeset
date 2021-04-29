package com.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		new ComparatorEx().idComparator();
		new ComparatorEx().nameComparator();
		new ComparatorEx().addressComparator(); 
	}
	
	void idComparator(){
		
		Employee emp1 = new Employee(10, "Candy", "Ichalkaranji");
		Employee emp2 = new Employee(15, "Murali", "Ratnagiri");
		Employee emp3 = new Employee(5,  "Piya", "Kolhapur");
		
		
		Set<Employee> empSet = new TreeSet<>(new ComparatorForId());
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		
		System.out.println("\n Sorting by employee's Id ");
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
	}
	
	void nameComparator(){
		
		Employee emp1 = new Employee(3, "Shubham", "Ichalkarnji");
		Employee emp2 = new Employee(1, "Kiran", "Pune");
		Employee emp3 = new Employee(2, "Akshay", "Kolhapur");
		
		
		Set<Employee> empSet1 = new TreeSet<>(new ComparatorForName());
		empSet1.add(emp1);
		empSet1.add(emp2);
		empSet1.add(emp3);
		
		System.out.println("\n Sorting by Name ");
		for (Employee employee : empSet1) {
			System.out.println(employee);
		}
	}
	void addressComparator(){
		
		Employee emp1 = new Employee(11, "Aniket", "Sangli");
		Employee emp2 = new Employee(12, "Supriya", "Pune");
		Employee emp3 = new Employee(9, "Kalyani", "Kolhapur");

		Set<Employee> empSet2 = new TreeSet<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.empAddress.compareTo(o2.empAddress);
			}
		});
		empSet2.add(emp1);
		empSet2.add(emp2);
		empSet2.add(emp3);
		
		System.out.println("\n Sorting by Address ");
		for (Employee employee : empSet2) {
			System.out.println(employee);
		}
	}
}

class Employee {
	int empId;
	String empName;
	String empAddress;
	
	public Employee(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
    @Override
	public String toString() {
		return "empId = " + empId + ",   empName = " + empName + ",   empAddress = " + empAddress + "";
	}	
}
class ComparatorForId implements Comparator<Employee>{
   @Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empId == o2.empId)
		 return 0;
		else if(o1.empId < o2.empId)
			return -1;
		else
			return 1;
	}	
}
class ComparatorForName implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}	
}
