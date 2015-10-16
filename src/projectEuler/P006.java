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
		System.out.println( square(sumOfTheNaturalsUntilX(100)) - sumOfTheSquares(100) );
	}
	
	public static long sumOfTheNaturalsUntilX(int x){
		return ((x+1)*x)/2;
	}
	public static long square(long x){
		return x*x;
	}
	public static long sumOfTheSquares(int num){
		return ((num == 1)? 1 : num*num+sumOfTheSquares(num-1) );
	}
}
