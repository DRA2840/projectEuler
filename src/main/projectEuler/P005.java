package projectEuler;

/**
 * "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 */
public class P005 {

	private static final int A = 1;
	private static final int B = 20;
	
	
	public static void main(String[] args) {
		System.out.println(calculateAnswer());
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static long calculateAnswer(){
		/* first I find the product of all of them, and then I rip-off the unnecessary factors*/
		long inicial = P000.fatorial(20).longValue();
		return unnecessaryFactorReaper(inicial, A, B);
	}
	
	/**
	 * Removes factors from a big number
	 * @param bigNumber big number
	 * @param a first factor to be eligible to be ripped-off
	 * @param b last factor to be eligible to be ripped-off
	 * @return still big, but smaller number that is divisible by all numbers from A to B.
	 */
	private static long unnecessaryFactorReaper(long bigNumber, int a, int b){
		return (a==b)? bigNumber : isDivisibleByAllNumbersFromAtoB(A, B, bigNumber/b)? unnecessaryFactorReaper(bigNumber/b, a, b) :unnecessaryFactorReaper(bigNumber, a, b-1);
	}

	/**
	 * Checks if a number is divisible by all numbers from A to B
	 * @param a A
	 * @param b B
	 * @param number number
	 * @return true, if number is divisible by all numbers from A to B.
	 */
	private static boolean isDivisibleByAllNumbersFromAtoB(int a, int b, long number){
		return (a > b) || ((number % a == 0) && isDivisibleByAllNumbersFromAtoB(a+1, b, number));
	}
}
