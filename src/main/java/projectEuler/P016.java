package projectEuler;



/**
 * <p>2<sup>15</sup> = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.</p>
 * 
 * <p>What is the sum of the digits of the number 2<sup>1000</sup>?</p>
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" alt="Gravatar"> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P016 {
	
	public static void main(String[] args) {
		System.out.println(calculateAnswer());
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return String.valueOf(P000.sumOfDigits(P000.pow(2, 1000).toString()));
	}

}
