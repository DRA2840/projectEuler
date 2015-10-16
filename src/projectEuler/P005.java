package projectEuler;

/**
 * "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
 * 
 * @author Diego (DRA2840)
 */
public class P005 {

	private static final int A = 1;
	private static final int B = 20;
	
	/* first I find the product of all of them, and then I rip-off the unnecessary factors*/
	public static void main(String[] args) {
		long inicial = fatorial(20);
		System.out.println(unnecessaryFactorReaper(inicial, A, B));
	}
	
	private static long unnecessaryFactorReaper(long bigNumber, int a, int b){
		if(a == b){
			return bigNumber;
		}
		
		return ((isDivisibleByAllNumbersFromAtoB(A, B, bigNumber/b))? unnecessaryFactorReaper(bigNumber/b, a, b) :unnecessaryFactorReaper(bigNumber, a, b-1));

	}

	private static long fatorial(int j) {
		return ((j == 1)? 1 : j*fatorial(j-1));
	}
	private static boolean isDivisibleByAllNumbersFromAtoB(int a, int b, long number){
		return (a > b) || ((number % a == 0) && isDivisibleByAllNumbersFromAtoB(a+1, b, number));
	}
}
