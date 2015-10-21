package projectEuler;

import java.math.BigDecimal;

/**
 * Starting in the top left corner of a 2x2 grid, and only being able to move 
 * to the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 *      IMAGE(https://projecteuler.net/project/images/p015.gif)
 * 
 * How many such routes are there through a 20x20 grid?
 * 
 * @author Diego (DRA2840)
 *
 */
public class P015 {
	
	private static final int GRID_SIZE = 20;
	private static final int SMALL_GRID_SIZE = 14;
	
	public static void main(String[] args) {
		System.out.println(numberOfSteps(0, 0));
		System.out.println(2*halfOfTheSteps(0, 0));
		System.out.println(binomial(GRID_SIZE*2, GRID_SIZE));
	}
	
	/* Almost 10 minutes running. Not the used algorithm, but was the first.
	 * 
	 * But let's face it. One line programs are so cool =X
	 * */
	private static long numberOfSteps(int x, int y){
		return (x == SMALL_GRID_SIZE || y == SMALL_GRID_SIZE)? 1 :(numberOfSteps(x+1, y)+numberOfSteps(x, y+1));
	}
	
	/* Expected to work under 1 minute, but took 5 =/
	 * As Daft Punk would say, One More Time!
	 * */
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
	private static BigDecimal binomial(int a, int b){
		return binomial(a-1, b, a-b).multiply(BigDecimal.valueOf(a)).divide(fatorial(a-b));
	}
	
	private static BigDecimal binomial(int a, int b, int c){
		return (a==b)? BigDecimal.ONE :binomial(a-1, b, c).multiply(BigDecimal.valueOf(a));
	}
	
	private static BigDecimal fatorial(int a){
		return (a==1)?BigDecimal.ONE:fatorial(a-1).multiply(BigDecimal.valueOf(a));
	}

}
