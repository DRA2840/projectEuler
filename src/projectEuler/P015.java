package projectEuler;

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
	private static final int SMALL_GRID_SIZE = 2;
	
	public static void main(String[] args) {
		System.out.println(numberOfSteps(0, 0));
		System.out.println(2*halfOfTheSteps(0, 0));
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

}
