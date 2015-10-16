package projectEuler;


/**
 * "The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 "
 * 
 * 
 * @author Diego (DRA2840)
 */
public class P003 {
	
	public static void main(String[] args) {
		
		System.out.println(findLargestPrimeFactor(1, 2, 600851475143L) );
		
	}
	
	/**
	 * Finds the largest prime factor of a given number
	 * @param maxPrimeFactor max prime factor so far. Should start with 1
	 * @param aux number being verified if is a prime factor. Should start with 2, since all numbers are divisible by 1
	 * @param numberToTest the given number
	 * @return
	 */
	private static long findLargestPrimeFactor(long maxPrimeFactor, long aux, long numberToTest) {
		
		if(aux * aux > numberToTest){
			return (isPrime(2, numberToTest)? numberToTest :maxPrimeFactor);
		}
		if(numberToTest % aux == 0 && isPrime(2L, aux)){
			return findLargestPrimeFactor(aux, aux+1, numberToTest/aux);
		}
		return findLargestPrimeFactor(maxPrimeFactor, aux+1, numberToTest);
	}

	private static boolean isPrime(long aux, long numberToTest){
		if(aux*aux > numberToTest){
			return true;
		}
		return ((numberToTest % aux == 0)? false: isPrime(aux+1, numberToTest) );
	}
	
}
