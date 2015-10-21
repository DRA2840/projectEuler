package projectEuler;
/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * @author Diego (DRA2840)
 *
 */
public class P006 {

	public static void main(String[] args) {
		System.out.println( P000.square(P000.sumOfTheNaturalsUntilX(100)) - sumOfTheSquaresUntilX(100) );
	}
	
	private static long sumOfTheSquaresUntilX(int x){
		return ((x == 1)? 1 : x*x+sumOfTheSquaresUntilX(x-1) );
	}
}
