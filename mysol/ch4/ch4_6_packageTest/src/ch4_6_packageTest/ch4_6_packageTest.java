package ch4_6_packageTest;

import static java.lang.System.*;
import java.util.*;
import java.time.*;

import ch4_6_packageTest.Employee;

public class ch4_6_packageTest {

	public static void main(String[] args) {
		
		Employee harry = new Employee("James Wang", 55000, 1988, 02, 12);
		
		harry.raiseSalary(5);
		
		out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());
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

