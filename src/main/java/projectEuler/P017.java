package projectEuler;

/**
 * <p>If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.</p>
 * 
 * <p>If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?</p>
 * 
 * <p>NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
 * The use of "and" when writing out numbers is in compliance with British usage.</p>
 * 
 * @author <img src="https://avatars2.githubusercontent.com/u/3778188?v=2&s=30" width="30" height="30" alt="Gravatar"> <a href="https://github.com/DRA2840" target="_blank"> Diego Azevedo (DRA2840) </a>
 *
 */
public class P017 {
	
	private static String[] units = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
	private static String[] tens  = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	private static String[] teens = {"ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
	
	
	public static void main(String[] args) {
		System.out.println(prettyPrinter(1522));
		System.out.println(calculateAnswer());
	}
	
	/**
	 * Calculates answer
	 * @return answer
	 */
	public static String calculateAnswer(){
		return sumsAllCharactersFromAllNumbersFromXToOne(1000).toString();
	}
	
	/**
	 * Sums the number of characters each number has in written form (British English) from
	 * number 'X' until 1
	 * @param x X
	 * @return Sum of all the characters from all numbers from x to 1
	 */
	private static Integer sumsAllCharactersFromAllNumbersFromXToOne(int x){
		return (x==0)?0: (numberOfCharacters(x) + sumsAllCharactersFromAllNumbersFromXToOne(x-1));
	}
	
	/**
	 * Returns a String representing a number between 1 and 9999 in British English
	 * 
	 * @param i number to be 'Stringed'
	 * @return The number in British English
	 */
	public static String prettyPrinter(Integer i){
		int size = i.toString().length();
		if(size == 4){
			String hundreds = prettyPrinter(Integer.valueOf(i.toString().substring(1)));
			return units[Integer.valueOf(i.toString().substring(0, 1))] + "thousand " + (hundreds.length() == 0 || hundreds.contains("hundred")? "": "and ") + hundreds;
		}
		if(size == 3){
			String tens = prettyPrinter(Integer.valueOf(i.toString().substring(1)));
			return units[Integer.valueOf(i.toString().substring(0,1))] + "hundred " + (tens.length() > 0? ("and " + tens) : "");
		}
		if(size == 2){
			if(i<20){
				return teens[i-10];
			}else{
				String units = prettyPrinter(Integer.valueOf(i.toString().substring(1)));
				return tens[Integer.valueOf(i.toString().substring(0, 1))] + (units.length() > 0 ? ("-" + units) : "");
			}
		}
		if(size == 1){
			return units[i];
		}
		return "";
	}
	
	/**
	 * Calculates the number of characters a number has in British English
	 * @param i number
	 * @return number of characters
	 */
	private static int numberOfCharacters(Integer i){
		return prettyPrinter(i).replace(" ", "").replace("-", "").length();
	}
}
