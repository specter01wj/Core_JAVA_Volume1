package ch6_4_cloneTest;

public class CloneTest {

	public static void main(String[] args) {
		
		try {
			
			Employee original = new Employee("Jmaes Wang", 65000);
			original.setHireDay(2000, 8, 12);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2013, 5, 23);
			System.out.println("original: " + original);
			System.out.println("copy: " + copy);
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
}
