package ch5_4_abstractClasses;

import ch5_4_abstractClasses.Employee;

public class PersonTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[2];
		people[0] = new Employee("Peter Boli", 95000, 1986, 9, 11);
		people[1] = new Student("Tom Hanks", "EE");
		
		for(Person p : people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
		
	}
	
}
