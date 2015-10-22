package projectEuler;
/**
 * "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000."
 * 
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 */
public class P001 {
	
	public static void main(String[] args) {
		
		System.out.println( calculateAnswer() );
		
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(sumOfAllMultiplesof3or5ForAandBelow(999));
	}
	
	/**
	 * Sums all multiples of 3 or 5 for a given number a (included) and below
	 * @param a given number.
	 * @return sum of all multiples of 3 or 5
	 */
	private static int sumOfAllMultiplesof3or5ForAandBelow (int a){
		return (a==0)? 0 : sumOfAllMultiplesof3or5ForAandBelow(a-1) + ((isDivisibeby3or5(a))? a : 0) ;
	}
	
	/**
	 * Is a number divisible by 3 or 5?
	 * @param a number
	 * @return true, if number is divisible by 3 or 5
	 */
	private static boolean isDivisibeby3or5(int a){
		return  a%3 == 0 || a%5 == 0;
	}

}
