package projectEuler;

import java.math.BigDecimal;

/**
 * <p>Starting in the top left corner of a 2x2 grid, and only being able to move 
 * to the right and down, there are exactly 6 routes to the bottom right corner.</p>
 * 
 *      <img src="https://projecteuler.net/project/images/p015.gif" alt="Problem 15" align="middle">
 * 
 * <p>How many such routes are there through a 20x20 grid?</p>
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" alt="Gravatar"> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P015 {
	
	private static final int GRID_SIZE = 20;
	private static final int SMALL_GRID_SIZE = 14;
	
	public static void main(String[] args) {
		System.out.println(numberOfSteps(0, 0));
		System.out.println(2*halfOfTheSteps(0, 0));
		System.out.println(calculateAnswer().toString());
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return binomial(GRID_SIZE*2, GRID_SIZE).toString();
	}
	
	/* Almost 10 minutes running. Not the used algorithm, but was the first.
	 * 
	 * But let's face it. One line programs are so cool =X
	 * */
	/**
	 * Calculates the number of paths for a square grid with SMAL_GRID_SIZE as size
	 * @param x starting point. Should start with 0
	 * @param y starting point. Should start with 0
	 * @return number of paths
	 */
	private static long numberOfSteps(int x, int y){
		return (x == SMALL_GRID_SIZE || y == SMALL_GRID_SIZE)? 1 :(numberOfSteps(x+1, y)+numberOfSteps(x, y+1));
	}
	
	/* Expected to work under 1 minute, but took 5 =/
	 * As Daft Punk would say, One More Time!
	 * */
	/**
	 * Calculates half the number of paths for a square grid with SMAL_GRID_SIZE as size
	 * @param x starting point. Should start with 0
	 * @param y starting point. Should start with 0
	 * @return half the number of paths
	 */
	private static long halfOfTheSteps(int x, int y){
		
		if(x == SMALL_GRID_SIZE ){
			return 1;
		}
		if(y+1 > x){
			return numberOfSteps(x+1, y);
		}
		
		return numberOfSteps(x+1, y)+numberOfSteps(x, y+1);
	}
	
	/* Real math solution is a binomial:
	 * a!/(a-b)!b!
	 * a*(a-1)*...*(b+1)/(a-b)!
	 * Had to use BigDecimal because the 40*39*...*21 is way too big to fit a Long.
	 */
	/**
	 * Binomial a!/(b!*(a-b)!)
	 * @param a A
	 * @param b B
	 * @return Binomial a!/(b!*(a-b)!)
	 */
	private static BigDecimal binomial(int a, int b){
		return P000.binomial(a,b);
	}

}
