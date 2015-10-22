package projectEuler;


/**
 * "A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers."
 * 
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 */

public class P004 {
	
	public static final int MAX = 999;

	public static void main(String[] args) {

		System.out.println(calculateAnswer());

	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(largestPalindrome(0, MAX, MAX));
	}

	/**
	 * Finds Largest Palindrome between a product of two numbers
	 * @param largestPalindromeSoFar largest palindrome so far (Should start with 0)
	 * @param multiplicand1 multiplicand 1. Should start with the max value
	 * @param multiplicand2 multiplicand 2. Should start with the max value
	 * @return largest palindrome found.
	 */
	private static int largestPalindrome(int largestPalindromeSoFar,
			int multiplicand1, int multiplicand2) {
		
		if(multiplicand2 == 1){
			if(multiplicand1 == 1){
				return largestPalindromeSoFar;
			}
			return largestPalindrome(largestPalindromeSoFar, multiplicand1 -1, multiplicand1-1);
		}
		
		int aux = multiplicand1 * multiplicand2;
		
		if(aux > largestPalindromeSoFar && P000.isPalindrome(String.valueOf(aux))){
			return largestPalindrome(aux, multiplicand1 -1, multiplicand1-1);
		}else if(aux < largestPalindromeSoFar){
			return largestPalindrome(largestPalindromeSoFar, multiplicand1-1, multiplicand1-1);
		}
		
		return largestPalindrome(largestPalindromeSoFar, multiplicand1, multiplicand2-1);
	}

}
