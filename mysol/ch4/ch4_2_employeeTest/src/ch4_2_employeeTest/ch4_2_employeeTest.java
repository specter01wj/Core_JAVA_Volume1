package ch4_2_employeeTest;

import java.time.*;

public class ch4_2_employeeTest {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("James Wang", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 45000, 1989, 10, 11);
		staff[2] = new Employee("Tony Yuan", 105000, 1985, 06, 22);
		
		for(Employee e : staff) {
			e.raiseSalary(5);
		}
		
		for(Employee e : staff) {
			System.out.println("name = " + e.getName() + ", salary = "
					+ e.getSalary() + ", hireDay = " + e.getHireDay());
		}
		
	}
	
}

class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		this.name = n;
		this.salary = s;
		this.hireDay = LocalDate.of(year,  month,  day);
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

	public LocalDate getHireDay() {
		return this.hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
}
