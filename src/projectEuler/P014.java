package projectEuler;

public class P014 {
	
	private static final int[] collatzSequence = new int[1000000];
	
	public static void main(String[] args) {
		System.out.println(collatzSequence(0,0,1,1));
	}
	
	private static int collatzSequence(int size, int longest, int aux, int index){
		
		System.out.println("collatzSequence(" + size+ "," +longest +","+ aux +","+index+")");
		
		if(index == 1000000){
			return longest;
		}
		
		if(aux == 1){
			collatzSequence[index] = ++size;
			if(collatzSequence[index] > collatzSequence[longest]){
				longest = index;
			}
			return collatzSequence(0, longest, ++index, index);
		}
		
		if(aux < index){
			collatzSequence[index] = ++size + collatzSequence[aux];
			if(collatzSequence[index] > collatzSequence[longest]){
				longest = index;
			}
			return collatzSequence(0, longest, ++index, index);
		}
		
		return collatzSequence(++size, longest, nextNumberCollatzSequence(aux), index);
		
	}
	
	private static int nextNumberCollatzSequence(int i){
		if(i%2 == 0){
			return i/2;
		}else{
			return i*3+1;
		}
	}
	
	
}
