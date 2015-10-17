package projectEuler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * @author Diego (DRA2840)
 *
 */
public class P007 {
	
	public static void main(String[] args) {
		System.out.println(findNPrimeNumber(900,1));
		System.out.println(findNPrimeNumberNonRecursive(10001));
		
	}
	
	//This recursive approach works only for ''smal'' values for N
	public static long findNPrimeNumber(int n, int aux){
		return ((P003.isPrime(2, aux))? ((n ==0)? aux :findNPrimeNumber(n-1, aux+1)) : findNPrimeNumber(n, aux+1));
	}
	
	/* I do not like this. It's the same algorithm, but non recursive, 
	 * and we all know that tail recursion is it's own reward =)
	 * (Writing the whole function in one line with ternary operators is another)
	 * 
	 * I'm gonna think in another recursive solution or
	 * some kind of optimization that won't get me a stackoverflow error
	 * Funny thing: sometimes I get the error with 900, sometimes I don't.
	 * */
	public static long findNPrimeNumberNonRecursive(int n){
		
		int aux = 2;
		while(n != 0){
			if(P003.isPrime(2, aux)){
				n--;
			}
			aux++;
		}
		
		return --aux;
	}

}
