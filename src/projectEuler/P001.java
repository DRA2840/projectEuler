package projectEuler;
/**
 * "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000."
 * 
 * 
 * @author Diego (DRA2840)
 */
public class P001 {
	
	public static void main(String[] args) {
		
		System.out.println( problem1(999) );
		
	}
	
	private static int problem1 (int a){
		if(a == 0){
			return 0;
		}
		return problem1(a-1) + ((isDivisibeby3or5(a))? a : 0) ;
	}
	
	private static boolean isDivisibeby3or5(int a){
		return  a%3 == 0 || a%5 == 0;
	}

}
