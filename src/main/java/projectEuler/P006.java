package projectEuler;
/**
 * <p>The sum of the squares of the first ten natural numbers is,</p>
 * 
 * <center>1<sup>2</sup> + 2<sup>2</sup> + ... + 10<sup>2</sup> = 385</center>
 * 
 * <p>The square of the sum of the first ten natural numbers is,</p>
 * 
 * <center>(1 + 2 + ... + 10)<sup>2</sup> = 55<sup>2</sup> = 3025</center>
 * 
 * <p>Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.</p>
 * 
 * <p>Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.</p>
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" alt="Gravatar"> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P006 {

	public static void main(String[] args) {
		System.out.println( calculateAnswer() );
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(P000.square(P000.sumOfTheNaturalsUntilX(100)) - sumOfTheSquaresUntilX(100));
	}
	
	/**
	 * Sums all squares from 1 until X
	 * @param x X
	 * @return sum of all squares from 1 until X
	 */
	private static long sumOfTheSquaresUntilX(int x){
		return ((x == 1)? 1 : x*x+sumOfTheSquaresUntilX(x-1) );
	}
}
