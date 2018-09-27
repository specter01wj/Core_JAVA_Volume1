package ch5_11_arrayListTest;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> staff = new ArrayList<>();
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
