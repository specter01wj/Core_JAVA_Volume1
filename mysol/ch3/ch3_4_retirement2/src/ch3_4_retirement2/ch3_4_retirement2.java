package ch3_4_retirement2;

import java.util.*;

public class ch3_4_retirement2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		String input;
		
		do {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
			System.out.printf("after year %d, your balance is %.2f%n", years, balance);
			System.out.print("Ready to retire?(Y/N)");
			input = in.next();
		} while(input.equals("N"));
		
		System.out.println("See you in heaven!");

	}

}
