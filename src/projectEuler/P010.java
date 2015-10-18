package projectEuler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * @author Diego (DRA2840)
 *
 */
public class P010 {

	public static void main(String[] args) {
		System.out.println(sumAllPrimes( 0,10));
		System.out.println(sumAllPrimesNotRecursive(2000000));
	}
	
	//Just like P007, the recursive approach didn't work for big numbers =(
	public static long sumAllPrimes(long sumSoFar, long number){
		if(number == 1){
			return sumSoFar;
		}
		return sumAllPrimes( ((P003.isPrime(2, number))? sumSoFar+number : sumSoFar), number-1 );
	}
	
	public static long sumAllPrimesNotRecursive(long number){
		
		long sumSoFar = 0;
		while(number != 1){
			if(P003.isPrime(2, number)){
				sumSoFar += number;
			}
			number--;
		}
		return sumSoFar;
	}
}