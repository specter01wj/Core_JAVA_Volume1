package ch3_8_compoundInterest;

public class ch3_8_compoundInterest {

	public static void main(String[] args){
		
		final double STARTRATE = 10;
		final int NRATES = 6, NYEARS = 10;
		double[] interestRate = new double[NRATES];
		double[][] balances = new double[NYEARS][NRATES];
		
		for(int i = 0; i < interestRate.length; i++){
			interestRate[i] = (STARTRATE + i) / 100.0;
		}
		
		for(int i = 0; i < balances[0].length; i++){
			balances[0][i] = 10000;
		}
		
		for (int i = 1; i < balances.length; i++){
	         for (int j = 0; j < balances[i].length; j++)
	         {
	            double oldBalance = balances[i - 1][j];
	            double interest = oldBalance * interestRate[j];
	            balances[i][j] = oldBalance + interest;
	         }
	    }
		
		
		for (int j = 0; j < interestRate.length; j++) {
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		}
	         
		System.out.println();

	      // print balance table
	    for (double[] row : balances){
	         // print table row
	         for (double b : row)
	            System.out.printf("%10.2f", b);

	         System.out.println();
	    }
		
	}
	
}
