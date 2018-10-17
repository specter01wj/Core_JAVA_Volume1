package ch8_3_pairTest3;

public class PairTest3 {

	public static void main(String[] args) {
		
		
		
	}
	
	public static void printBuddies(Pair<? extends Employee> p) {
	      Employee first = p.getFirst();
	      Employee second = p.getSecond();
	      System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
	}

	public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
	      if (a.length == 0) return;
	      Manager min = a[0];
	      Manager max = a[0];
	      for (int i = 1; i < a.length; i++)
	      {
	         if (min.getBonus() > a[i].getBonus()) min = a[i];
	         if (max.getBonus() < a[i].getBonus()) max = a[i];
	      }
	      result.setFirst(min);
	      result.setSecond(max);
	}

	public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
	      minmaxBonus(a, result);
	      PairAlg.swapHelper(result); // OK--swapHelper captures wildcard type
	}
	
}
