package ch8_1_pairTest1;

public class PairTest1 {

	public static void main(String[] args) {
		
		String[] words = {"James", "John", "Thomas", "Mary"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min: " + mm.getFirst());
		System.out.println("max: " + mm.getSecond());
	}
	
}

class ArrayAlg {
	
	public static Pair<String> minmax(String[] a) {
		
		if(a == null || a.length == 0) return null;
		String min = a[0], max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(min.compareTo(a[i]) > 0) min = a[i];
			if(max.compareTo(a[i]) < 0) max = a[i];
		}
		
		return new Pair<>(min, max);	
	}
	
}


