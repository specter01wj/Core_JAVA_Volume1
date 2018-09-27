package ch5_8_equalsTest;

public class EqualsTest {

	public static void main(String[] args) {
		
		Employee alice1 = new Employee("Alice Adams", 850000, 1988, 6, 11);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice Adams", 850000, 1988, 6, 11);
		Employee bob = new Employee("Bob Brandon", 550000, 1979, 12, 23);
		
		System.out.println("alice1 == alice2: " + (alice1 == alice2));
		System.out.println("alice1 == alice3: " + (alice1 == alice3));
		System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
		System.out.println("alice1.equals(bob): " + alice1.equals(bob));
		System.out.println("bob.toString(): " + bob);
		
	}
	
}
