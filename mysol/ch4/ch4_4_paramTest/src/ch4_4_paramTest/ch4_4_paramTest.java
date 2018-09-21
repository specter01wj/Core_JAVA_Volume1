package ch4_4_paramTest;


public class ch4_4_paramTest {

	public static void main(String[] args) {
		
		System.out.println("Test tripleValue");
		double percent = 10;
		System.out.println("Before: percent= " + percent);
		tripleValue(percent);
		System.out.println("After: percent= " + percent);
		
//		for(Employee e : staff) {
//			e.setId();
//			System.out.println("name = " + e.getName() + ", id = " + e.getId() 
//				+ ", salary = " + e.getSalary());
//		}
//		
//		int n = Employee.getNextId();
//		System.out.println("Next avail id = " + n);
//		
//		Employee a = new Employee("Alice", 25000);
//		Employee b = new Employee("Bob", 35000);
//		System.out.println("A = " + a.getName() + ", B = " + b.getName());
//		swap(a,b);
//		System.out.println("A = " + a.getName() + ", B = " + b.getName());
	}
	
	public static void tripleValue(double x) {
		x = 3 * x;
		System.out.println("tripleValue end: x = " + x);
	}
	
	public static void swap(Employee x, Employee y) {
		System.out.println("Before: x = " + x.getName() + ", y = " + y.getName());
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("After: x = " + x.getName() + ", y = " + y.getName());
	}
	
}

class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
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
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Josh Hill", 45000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
	
}
