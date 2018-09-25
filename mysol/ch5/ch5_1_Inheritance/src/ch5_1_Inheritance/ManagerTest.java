package ch5_1_Inheritance;

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager boss = new Manager("James Wang", 120000, 1976, 8, 23);
		boss.setBonus(12000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Peter Nike", 65000, 1983, 6, 16);
		staff[2] = new Employee("Tom Hacker", 75000, 1987, 12, 21);
		
		for(Employee e : staff) {
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
		}
		
	}
	
}
