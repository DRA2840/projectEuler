package projectEuler;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This class provides Methods and solutions that can be reused in other problems.
 *  
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P000 {

	/**
	 * Checks if the given number is prime
	 * @param numberToTest given number
	 * @return true, if number is prime
	 */
	public static boolean isPrime(long numberToTest){
		return isPrime(2, numberToTest);
	}
	
	/**
	 * Checks if the given number is prime
	 * @param aux number being verified if is a factor. Should start with 2, since all numbers are divisible by 1
	 * @param numberToTest given number
	 * @return true, if number is prime
	 */
	private static boolean isPrime(long aux, long numberToTest){
		return (aux*aux > numberToTest) || ((numberToTest % aux != 0) && isPrime(aux+1, numberToTest));
	}

	/**
	 * Checks if the given String is a palindrome.
	 * @param string Given String
	 * @return true, if string is a palindrome
	 */
	public static boolean isPalindrome(String string){
		return isPalindrome(0, string);
	}
	
	/**
	 * Checks if the given String is a palindrome.
	 * @param a position tested. should start with 0.
	 * @param string Given String
	 * @return true, if string is a palindrome
	 */
	private static boolean isPalindrome(int a,String string){
		return (a >= string.length()/2) || ((string.charAt(0+a) == string.charAt(string.length()-1-a)) && isPalindrome(a+1, string));
	}

	/**
	 * Sum all naturals until X
	 * @param x last natural to count
	 * @return sum of all naturals until x
	 */
	public static long sumOfTheNaturalsUntilX(int x){
		return ((x+1)*x)/2;
	}

	/**
	 * X^2
	 * @param x X
	 * @return X^2
	 */
	public static long square(long x){
		return x*x;
	}

	/**
	 * X^3
	 * @param x X
	 * @return X^2
	 */
	public static final long cube(long x){
		return x*x*x;
	}

	/**
	 * Largest number between two.
	 * @param a number 1
	 * @param b number 2
	 * @return max between number 1 and number 2
	 */
	public static int max(int a, int b){
		return (a>b)? a : b;
	}

	/**
	 * Returns the number of divisors of a given number
	 * 
	 * @param number given number
	 * @return number of divisors of a given number.
	 */
	public static int numerOfDivisors(long number){
		return numerOfDivisors(number, 0, 1);
	}
	
	/**
	 * Returns the number of divisors of a given number
	 * 
	 * @param number given number
	 * @param aux number of divisors so far (should start with 0)
	 * @param i first divisor to check (should start with 1)
	 * @return number of divisors of a given number.
	 */
	private static int numerOfDivisors(long number, int aux, int i){
		if(i*i > number){
			return aux;
		}else if(i*i == number){
			return aux+1;
		}
	
		return numerOfDivisors(number, P000.isDivisor(i, number)?aux+2:aux, ++i);
	}

	/**
	 * is 'Number' divisible by 'I'?
	 * @param i I
	 * @param number Number
	 * @return true if I can divide Number
	 */
	public static boolean isDivisor(int i, long number) {
		return number%i==0;
	}

	/**
	 * Binomial [a!/(b!*(a-b)!)] 
	 * @param a A
	 * @param b B
	 * @return A!/(B!*(A-B)!)
	 */
	public static BigDecimal binomial(int a, int b){
		return P000.binomialPart1(a-1, (b>a-b)? b: a-b).multiply(BigDecimal.valueOf(a)).divide(P000.fatorial((b>a-b)?a-b:b));
	}
	
	//Internal use by binomial function
	private static BigDecimal binomialPart1(int a, int b){
		return (a==b)? BigDecimal.ONE :binomialPart1(a-1, b).multiply(BigDecimal.valueOf(a));
	}

	/**
	 * Fatorial (A*(A-1)*...*2*1
	 * @param a A
	 * @return A!
	 */
	public static BigDecimal fatorial(int a){
		return (a==1)?BigDecimal.ONE:fatorial(a-1).multiply(BigDecimal.valueOf(a));
	}

	/**
	 * 'Num'^'Exp' 
	 * @param num Num
	 * @param exp Exp
	 * @return Num^Exp
	 */
	public static BigInteger pow(long num, int exp){
		return (exp == 0)? BigInteger.ONE : BigInteger.valueOf(num).multiply(pow(num, exp-1));
	}

	/**
	 * Sum all digits on a numeric string
	 * @param s numeric string
	 * @return sum of all digits
	 */
	public static int sumOfDigits(String s){
		return (s.length()== 0)? 0 : Integer.valueOf(s.substring(0, 1)) + sumOfDigits(s.substring(1));
	}

}
