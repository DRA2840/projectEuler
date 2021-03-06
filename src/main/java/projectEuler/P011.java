package projectEuler;

/**
 * <p>In the 20x20 grid below, four numbers along a diagonal line have been marked in bold.</p>
 * 
 * <center>
 *   <code>
 * 
 *     08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08<br>
 *     49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00<br>
 *     81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65<br>
 *     52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91<br>
 *     22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80<br>
 *     24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50<br>
 *     32 98 81 28 64 23 67 10 <b>26</b> 38 40 67 59 54 70 66 18 38 64 70<br>
 *     67 26 20 68 02 62 12 20 95 <b>63</b> 94 39 63 08 40 91 66 49 94 21<br>
 *     24 55 58 05 66 73 99 26 97 17 <b>78</b> 78 96 83 14 88 34 89 63 72<br>
 *     21 36 23 09 75 00 76 44 20 45 35 <b>14</b> 00 61 33 97 34 31 33 95<br>
 *     78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92<br>
 *     16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57<br>
 *     86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58<br>
 *     19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40<br>
 *     04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66<br>
 *     88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69<br>
 *     04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36<br>
 *     20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16<br>
 *     20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54<br>
 *     01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48<br>
 *     
 *   </code>
 * </center>
 * <p>The product of these numbers is 26 x 63 x 78 x 14 = 1788696.</p>
 * 
 * <p>What is the greatest product of four adjacent numbers in the same direction 
 * (up, down, left, right, or diagonally) in the 20x20 grid?</p>

 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" alt="Gravatar"> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P011 {
	
	private static final String MATRIX_20_X_20 = 
			  "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 "
			+ "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 "
			+ "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 "
			+ "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 "
			+ "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 "
			+ "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 "
			+ "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 "
			+ "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 "
			+ "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 "
			+ "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 "
			+ "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 "
			+ "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 "
			+ "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 "
			+ "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 "
			+ "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 "
			+ "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 "
			+ "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 "
			+ "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 "
			+ "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 "
			+ "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48 ";
	
	private static final int MATRIX_SIZE = 20;
	
	private static String[][] matrix;
	
	public static void main(String[] args) {
		System.out.println(calculateAnswer());
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		splitter();
		return String.valueOf(greatestProductAdjacentNumbers(0,0));
	}
	
	/**
	 * Calculates the greatest product between 4 adjacent numbers in this matrix
	 * @param i position I
	 * @param j position J
	 * @return greatest product between 4 adjacent numbers
	 */
	private static long greatestProductAdjacentNumbers(int i, int j){
		
		if(j >= MATRIX_SIZE){
			return greatestProductAdjacentNumbers(i+1, 0);
		}
		if(i >= MATRIX_SIZE){
			return -1;
		}
		int aux = 0;
		
		long greatestProductInThisPosition = 0;
		if(j+ 4 < MATRIX_SIZE){// Is line possible to calculate?
			
			aux = lineProduct(i,j, 4);
			greatestProductInThisPosition = P000.max(greatestProductInThisPosition, aux);
			
		}
		if(i+4< MATRIX_SIZE){// Is column Possible?
			
			aux = columnProduct(i,j, 4);
			greatestProductInThisPosition = P000.max(greatestProductInThisPosition, aux);
			
		}
		if(j+4 < MATRIX_SIZE && i+4 < MATRIX_SIZE){// Is diagonal Right possible?
			
			aux = diagRightProduct(i,j, 4);
			greatestProductInThisPosition = P000.max(greatestProductInThisPosition, aux);
			
		}
		if(j-4 >= 0 && i+4 < MATRIX_SIZE){// Is diagonal Left possible?
			
			aux = diagLeftProduct(i,j, 4);
			greatestProductInThisPosition = P000.max(greatestProductInThisPosition, aux);
			
		}
		
		return P000.max(greatestProductInThisPosition, greatestProductAdjacentNumbers(i, ++j));
	}
	
	/**
	 * Performs a line product, starting in position matrix[i][j]
	 * @param i I
	 * @param j J
	 * @param k size of the product
	 * @return product
	 */
	private static int lineProduct(int i, int j, int k) {
		return (k == 0)? 1:Integer.valueOf(matrix[i][j])*lineProduct(i, j+1, k-1);
	}
	
	/**
	 * Performs a column product, starting in position matrix[i][j]
	 * @param i I
	 * @param j J
	 * @param k size of the product
	 * @return product
	 */
	private static int columnProduct(int i, int j, int k) {
		return (k == 0)? 1:Integer.valueOf(matrix[i][j])*columnProduct(i+1, j, k-1);
	}
	
	/**
	 * Performs a diagonal product, to the right, starting in position matrix[i][j]
	 * @param i I
	 * @param j J
	 * @param k size of the product
	 * @return product
	 */
	private static int diagRightProduct(int i, int j, int k) {
		return (k == 0)? 1:Integer.valueOf(matrix[i][j])*diagRightProduct(i+1, j+1, k-1);
	}
	
	/**
	 * Performs a diagonal product, to the left, starting in position matrix[i][j]
	 * @param i I
	 * @param j J
	 * @param k size of the product
	 * @return product
	 */
	private static int diagLeftProduct(int i, int j, int k) {
		return (k == 0)? 1:Integer.valueOf(matrix[i][j])*diagLeftProduct(i+1, j-1, k-1);
	}
	
	/**
	 * Splits the String and populates the matrix
	 */
	private static void splitter(){
		String[] array = MATRIX_20_X_20.split(" ");
		matrix = convertArrayToMatrix(new String[MATRIX_SIZE][MATRIX_SIZE], array, 0, 0);
	}
	
	/**
	 * Creates a String matrix from a String array
	 * 
	 * @param matrixSoFar aux variable of the matrix
	 * @param array String array used as base
	 * @param i position on the matrix
	 * @param j position on the matrix
	 * @return populated matrix
	 */
	private static String[][] convertArrayToMatrix(String[][] matrixSoFar, String[]array, int i, int j){
		if(j >= MATRIX_SIZE){
			return convertArrayToMatrix(matrixSoFar, array, i+1, 0);
		}
		if(i >= MATRIX_SIZE){
			return matrixSoFar;
		}
		matrixSoFar[i][j] = array[MATRIX_SIZE*i+j];
		return convertArrayToMatrix(matrixSoFar, array, i, j+1);
		
	}

	
	
}
