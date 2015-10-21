package projectEuler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
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
		return sumAllPrimes( ((P000.isPrime( number))? sumSoFar+number : sumSoFar), number-1 );
	}
	
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
