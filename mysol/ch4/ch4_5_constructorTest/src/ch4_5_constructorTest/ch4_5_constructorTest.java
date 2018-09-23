package ch4_5_constructorTest;

import java.util.Random;

public class ch4_5_constructorTest {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 45000);
		staff[1] = new Employee(85000);
		staff[2] = new Employee();
		
		for(Employee e : staff) {
			System.out.println("name = " + e.getName() + 
					", id = " + e.getId() + ", salary = " + e.getSalary());
		}
	}
	
}

class Employee {
	private static int nextId;
	private int id;
	
	private String name = "";
	private double salary;
	
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
	}
	
	public Employee(double s) {
		this("Employee #" + nextId, s);
	}
	
	public Employee(){
		
	}
	
	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}
	
	public int getId() {
		return this.id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Josh Hill", 45000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
	
}
