package ch6_3_timerTest;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {

	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
		this.hireDay = new Date();
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.hireDay = (Date) hireDay.clone();
		
		return cloned;
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

	public Date getHireDay() {
		return this.hireDay;
	}

	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month = 1, day).getTime();
		this.hireDay.setTime(newHireDay.getTime());;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String toString() {
		return "Employee[name = " + name + ", salary = " + salary +  ", hireDay = " + hireDay + "]";
	}
	
}
