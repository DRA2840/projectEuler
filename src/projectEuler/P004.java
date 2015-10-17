package projectEuler;


/**
 * "A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers."
 * 
 * 
 * @author Diego (DRA2840)
 */

public class P004 {
	
	public static final int MAX = 999;

	public static void main(String[] args) {

		System.out.println(largestPalindrome(0, MAX, MAX));

	}

	private static int largestPalindrome(int largestPalindromeSoFar,
			int multiplicand1, int multiplicand2) {
		
		if(multiplicand2 == 1){
			if(multiplicand1 == 1){
				return largestPalindromeSoFar;
			}
			return largestPalindrome(largestPalindromeSoFar, multiplicand1 -1, multiplicand1-1);
		}
		
		int aux = multiplicand1 * multiplicand2;
		
		if(aux > largestPalindromeSoFar && isPalindrome(0,String.valueOf(aux))){
			return largestPalindrome(aux, multiplicand1 -1, multiplicand1-1);
		}else if(aux < largestPalindromeSoFar){
			return largestPalindrome(largestPalindromeSoFar, multiplicand1-1, multiplicand1-1);
		}
		
		return largestPalindrome(largestPalindromeSoFar, multiplicand1, multiplicand2-1);
	}
	
	public static boolean isPalindrome(int a,String number){
		return (a >= number.length()/2) || ((number.charAt(0+a) == number.charAt(number.length()-1-a)) && isPalindrome(a+1, number));
	}

}
