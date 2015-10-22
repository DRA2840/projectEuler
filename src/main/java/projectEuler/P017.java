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
	
	public static void main(String[] args) {
		System.out.println(calculateAnswer());
	}
	
	public static String calculateAnswer(){
		return sumsAllCharactersFromAllNumbersFromXToOne(1000).toString();
	}
	
	private static Integer sumsAllCharactersFromAllNumbersFromXToOne(int x){
		return (x==0)?0: (numberOfCharacters(x) + sumsAllCharactersFromAllNumbersFromXToOne(x-1));
	}
	
	//This works... but why not create a pretty printer, do a trim and creates an useful code?
	private static int numberOfCharacters(Integer i){
		if(i == 1000){
			return "ONETHOUSAND".length();
		}else if(i.toString().length() == 3){
			int numCharTens = numberOfCharacters(Integer.valueOf(i.toString().substring(1)));
			return numberOfCharactersUnits(Integer.valueOf(i.toString().substring(0, 1))) + "Hundred".length() + ((numCharTens == 0)? 0 : numCharTens + "AND".length());
		}else if(i.toString().length() == 2){
			return numberOfCharactersTens(i);
		}
		
		return numberOfCharactersUnits(i);
	}

	private static int numberOfCharactersTens(Integer i) {
		char aux = i.toString().charAt(0);
		int characters = 0;
		if(aux == '1'){
			if(i == 11 || i == 12){
				return 6;
			}else if(i == 10 || i == 13 || i == 15 || i == 18){
				return 3 + numberOfCharactersUnits(Integer.valueOf(i.toString().substring(1)));
			}else{
				return 4 + numberOfCharactersUnits(Integer.valueOf(i.toString().substring(1)));
			}
		}else if(aux == '2' || aux == '3' || aux == '8' || aux == '9'){
			characters = 6;
		}else if(aux == '4' || aux == '5' || aux == '6'){
			characters = 5;
		}else if(aux == '7'){
			characters = 7;
		}
		return characters + numberOfCharactersUnits(Integer.valueOf(i.toString().substring(1)));
	}

	private static int numberOfCharactersUnits(Integer i) {
		if(i == 1 || i == 2 || i == 6 ){
			return 3;
		}else if(i == 4 || i == 5 || i == 9){
			return 4;
		}else if(i == 3 || i == 7 || i == 8){
			return 5;
		}
		return 0;
	}

}
