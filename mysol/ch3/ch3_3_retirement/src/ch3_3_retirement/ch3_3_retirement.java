package ch3_3_retirement;

import java.util.*;

public class ch3_3_retirement {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("How much do you need to retire?");
		double goal = in.nextDouble();
		
		System.out.println("How much will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while(balance < goal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("you can retire in " + years + " years.");

	}
	
}
