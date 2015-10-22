package projectEuler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P007 {
	
	public static void main(String[] args) {
		System.out.println(findNPrimeNumber(900,1));
		System.out.println(calculateAnswer());
		
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(findNPrimeNumberNonRecursive(10001));
	}
	
	//This recursive approach works only for ''smal'' values for N
	//TODO: Improve recursive approach
	/**
	 * Finds the 'N'st prime number 
	 * @param n N
	 * @param aux Auxiliary variable. Should start with 1
	 * @return the 'N'st prime number
	 */
	private static long findNPrimeNumber(int n, int aux){
		return ((P000.isPrime(aux))? ((n ==0)? aux :findNPrimeNumber(n-1, aux+1)) : findNPrimeNumber(n, aux+1));
	}
	
	/* I do not like this. It's the same algorithm, but non recursive, 
	 * and we all know that tail recursion is it's own reward =)
	 * (Writing the whole function in one line with ternary operators is another)
	 * 
	 * I'm gonna think in another recursive solution or
	 * some kind of optimization that won't get me a stackoverflow error
	 * Funny thing: sometimes I get the error with 900, sometimes I don't.
	 * */
	/**
	 * Finds the 'N'st prime number using a non-recursive approach
	 * @param n N
	 * @return the 'N'st prime number
	 */
	public static long findNPrimeNumberNonRecursive(int n){
		
		int aux = 2;
		while(n != 0){
			if(P000.isPrime( aux)){
				n--;
			}
			aux++;
		}
		
		return --aux;
	}

}
