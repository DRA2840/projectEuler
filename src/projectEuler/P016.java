package projectEuler;

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * @author Diego
 *
 */
public class P016 {
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(pow(2, 1000).toString()));
	}
	
	
	private static BigInteger pow(long num, int exp){
		return (exp == 0)? BigInteger.ONE : BigInteger.valueOf(num).multiply(pow(num, exp-1));
	}
	
	private static int sumOfDigits(String s){
		return (s.length()== 0)? 0 : Integer.valueOf(s.substring(0, 1)) + sumOfDigits(s.substring(1));
	}

}
