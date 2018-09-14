package ch3_6_bigIntegerTest;

import java.util.*;
import java.math.*;

public class ch3_6_bigIntegerTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();
		System.out.println("highest number you can draw: ");
		int n = in.nextInt();

		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for(int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		}
		
		System.out.println("you odds are 1 in " + lotteryOdds + ". Good luck!");

	}
	
}
