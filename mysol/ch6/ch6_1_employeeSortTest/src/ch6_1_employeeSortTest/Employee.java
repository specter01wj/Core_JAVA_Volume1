package ch6_1_employeeSortTest;

public class Employee implements Comparable<Employee> {

	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
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

	public void setName(String name) {
		this.name = name;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
	
}
