package ch3_2_constants;

public class ch3_2_constants {

	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		
		//final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5, paperHeight = 11;
		System.out.println("Paper size in Centim: " + paperWidth * 
				CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
		
	}
	
}
