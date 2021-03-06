package projectEuler;

/**
 * <p>The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.</p>
 * <p>Find the sum of all the primes below two million.</p>
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" alt="Gravatar"> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P010 {

	public static void main(String[] args) {
		System.out.println(sumAllPrimes( 10));
		System.out.println(calculateAnswer());
	}

	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(sumAllPrimesNotRecursive(2000000));
	}
	
	//Just like P007, the recursive approach didn't work for big numbers =(
	/**
	 * Sums all primes bellow a max number
	 * @param number max number
	 * @return sum of all primes below number
	 */
	public static long sumAllPrimes(long number){
		if(number == 1){
			return 0;
		}
		return (P000.isPrime( number)? number : 0) + sumAllPrimes(number-1 );
	}
	
	/**
	 * Sums all primes bellow a max number. Non-recursive approach
	 * @param number max number
	 * @return Sums all primes bellow a max number
	 */
	public static long sumAllPrimesNotRecursive(long number){
		
		long sumSoFar = 0;
		while(number != 1){
			if(P000.isPrime( number)){
				sumSoFar += number;
			}
			number--;
		}
		return sumSoFar;
	}
}
