package ch5_4_abstractClasses;

import java.time.*;

public class Employee extends Person {

	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		super(n);
		this.salary = s;
		this.hireDay = LocalDate.of(year,  month,  day);
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

	public String getDescription() {
		return String.format("an employee with a salary of $%,2f", this.salary);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
}
