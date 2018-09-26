package ch5_4_abstractClasses;

public class Student extends Person {

	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	
	public String getDescription() {
		return "a student majoring in " + this.major;
	}
	
}
