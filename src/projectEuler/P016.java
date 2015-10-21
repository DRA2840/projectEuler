package projectEuler;


/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * @author Diego
 *
 */
public class P016 {
	
	public static void main(String[] args) {
		System.out.println(P000.sumOfDigits(P000.pow(2, 1000).toString()));
	}

}
