package ch6_6_lambdaTest;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		
		String[] planets = new String[] { "Mercury", "Venus", "Earth", 
				"Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		System.out.println("Planets = " + Arrays.toString(planets));
		System.out.println("Sorted in dict order: ");
		Arrays.sort(planets);
		System.out.println("Planets dict = " + Arrays.toString(planets));
		System.out.println("Sorted by length: ");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println("Planets len = " + Arrays.toString(planets));
		
		Timer t = new Timer(1000, event -> 
			System.out.println("The time is " + new Date()) );
		
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit Mess");
		System.exit(0);
	}
	
}
