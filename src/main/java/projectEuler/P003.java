package projectEuler;


/**
 * "The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 "
 * 
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 */
public class P003 {
	
	public static void main(String[] args) {
		
		System.out.println(calculateAnswer() );
		
	}
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(findLargestPrimeFactor(1, 2, 600851475143L));
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
			return (P000.isPrime( numberToTest)? numberToTest :maxPrimeFactor);
		}
		if(numberToTest % aux == 0 && P000.isPrime( aux)){
			return findLargestPrimeFactor(aux, aux+1, numberToTest/aux);
		}
		return findLargestPrimeFactor(maxPrimeFactor, aux+1, numberToTest);
	}
	
	
}
