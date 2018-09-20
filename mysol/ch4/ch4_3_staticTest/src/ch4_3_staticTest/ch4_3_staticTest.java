package ch4_3_staticTest;

import java.time.*;

public class ch4_3_staticTest {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("James Wang", 75000);
		staff[1] = new Employee("Harry Hacker", 45000);
		staff[2] = new Employee("Tony Yuan", 105000);
		
		for(Employee e : staff) {
			e.setId();
			System.out.println("name = " + e.getName() + ", id = " + e.getId() 
				+ ", salary = " + e.getSalary());
		}
		
		int n = Employee.getNextId();
		System.out.println("Next avail id = " + n);
		
	}
	
}

class Employee {
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
		id = 0;
	}
	
	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getNextId() {
		return nextId;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = nextId;
		nextId++;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Josh Hill", 45000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
	
}


