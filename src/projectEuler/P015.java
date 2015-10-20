package projectEuler;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move 
 * to the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 *      IMAGE(https://projecteuler.net/project/images/p015.gif)
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * @author Diego (DRA2840)
 *
 */
public class P015 {
	
	private static final int GRID_SIZE = 20;
	
	public static void main(String[] args) {
		System.out.println(numberOfSteps(0, 0));
	}
	
	/* Almost 7 minuts running. To be improved. 
	 * 
	 * But let's face it. One line programs are so cool =X
	 * */
	private static long numberOfSteps(int x, int y){
		return (x == GRID_SIZE || y == GRID_SIZE)? 1 :(numberOfSteps(x+1, y)+numberOfSteps(x, y+1));
	}

}
