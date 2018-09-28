package ch6_1_employeeSortTest;

import java.util.*;;

public class EmployeeSortTest {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("James Wang", 75000);
		staff[1] = new Employee("Harry Hacker", 45000);
		staff[2] = new Employee("Tony Yuan", 105000);
		
		Arrays.sort(staff);
		
		for(Employee e : staff) {
			System.out.println("name = " + e.getName() + ", salary = "
					+ e.getSalary());
		}
		
	}
	
}
