package projectEuler;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" /> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P014 {
	
	private static final int MAX_VALUE = 1000000;
	private static final int RECURSIVE_MAX_VALUE = 1000;
	
	/*
	 * Ok, I do know I could add a int[1000000] to reduce CPU usage. 
	 * But I'm not sure if the time spent with all this RAM access would pay out.
	 * And it is not an recursive approach (global variables and all that stuff)
	 */
	public static void main(String[] args) {
		System.out.println(collatzSequence(0,0,1));
		System.out.println(calculateAnswer());
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static int calculateAnswer(){
		return collatzSequenceNonRecursive();
	}
	
	/**
	 * Calculates the number with greatest Collatz sequence below MAX_VALUE
	 * @return the number with longest Collatz sequence below MAX_VALUE
	 */
	private static int collatzSequenceNonRecursive(){
		int size;
		int longest =0;
		long aux;
		int result =0;
		for(int i=0; i< MAX_VALUE; i++){
			aux = i+1;
			size = 1;
			while(aux > 1){
				size++;
				aux = nextNumberCollatzSequence(aux);
			}
			if(size > longest){
				longest = size;
				result = i+1;
			}
		}
		return result;
	}
	
	/**
	 * Calculates the number with greatest Collatz sequence below RECURSIVE_MAX_VALUE
	 * @param longestSize auxiliary. Starts with 0.
	 * @param longestValue auxiliary. Starts with 0
	 * @param index auxiliary. Starts with 1
	 * @return the number with longest Collatz sequence below RECURSIVE_MAX_VALUE
	 */
	private static int collatzSequence( int longestSize, int longestValue, int index){

		if(index == RECURSIVE_MAX_VALUE){
			return longestValue;
		}
		int size = collatzSequenceSize(0, index);
		if( size > longestSize){
			longestSize = size;
			longestValue = index;
		}
			
		return collatzSequence(longestSize, longestValue, ++index);
		
	}
	
	//TODO: Rip-off unnecessary variable
	/**
	 * Collatz sequence size for a given number
	 * 
	 * @param size to be ripped off. starts with 0
	 * @param value given number
	 * @return Collatz sequence size for 'value'
	 */
	private static int collatzSequenceSize(int size, long value){
		if(value == 1){
			return size;
		}
		return collatzSequenceSize(++size, nextNumberCollatzSequence(value));
	}
	
	/**
	 * Calculates the next number in the Collatz Sequence
	 * @param i actual number
	 * @return next number
	 */
	private static long nextNumberCollatzSequence(long i){
		if(i%2 == 0){
			return i/2;
		}else{
			return i*3+1;
		}
	}
	
	
}
