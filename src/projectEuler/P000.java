package projectEuler;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This class provides Methods and solutions that can be reused in other problems.
 *  
 * @author Diego (DRA2840)
 *
 */
public class P000 {

	/**
	 * Checks if the given number is prime
	 * @param aux number being verified if is a factor. Should start with 2, since all numbers are divisible by 1
	 * @param numberToTest given number
	 * @return
	 */
	public static boolean isPrime(long aux, long numberToTest){
		return (aux*aux > numberToTest) || ((numberToTest % aux != 0) && isPrime(aux+1, numberToTest));
	}

	/**
	 * Checks if the given String is a palindrome.
	 * @param a position tested. should start with 0.
	 * @param string Given String
	 * @return true, if string is a palindrome
	 */
	public static boolean isPalindrome(int a,String string){
		return (a >= string.length()/2) || ((string.charAt(0+a) == string.charAt(string.length()-1-a)) && isPalindrome(a+1, string));
	}

	public static long sumOfTheNaturalsUntilX(int x){
		return ((x+1)*x)/2;
	}

	public static long square(long x){
		return x*x;
	}

	public static final long cube(long a){
		return a*a*a;
	}

	public static int max(int a, int b){
		return (a>b)? a : b;
	}

	/**
	 * Returns the number of divisors of a given number
	 * 
	 * @param number given number
	 * @param aux number of divisors so far (should start with 0)
	 * @param i first divisor to check (should start with 1)
	 * @return number of divisors of a given number.
	 */
	public static int numerOfDivisors(long number, int aux, int i){
		if(i*i > number){
			return aux;
		}else if(i*i == number){
			return aux+1;
		}
	
		return numerOfDivisors(number, P000.isDivisor(i, number)?aux+2:aux, ++i);
	}

	static boolean isDivisor(int i, long number) {
		return number%i==0;
	}

	static BigDecimal binomial(int a, int b, int c){
		return (a==b)? BigDecimal.ONE :binomial(a-1, b, c).multiply(BigDecimal.valueOf(a));
	}

	static BigDecimal fatorial(int a){
		return (a==1)?BigDecimal.ONE:fatorial(a-1).multiply(BigDecimal.valueOf(a));
	}

	static BigInteger pow(long num, int exp){
		return (exp == 0)? BigInteger.ONE : BigInteger.valueOf(num).multiply(pow(num, exp-1));
	}

	static int sumOfDigits(String s){
		return (s.length()== 0)? 0 : Integer.valueOf(s.substring(0, 1)) + sumOfDigits(s.substring(1));
	}

}
