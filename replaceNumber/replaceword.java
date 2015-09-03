package replaceNumber;
import java.util.*;
/*
 * Given a string. Replace the words whose length>=4 and is even, 
 * with a space between the two equal halves of the word. Consider 
 * only alphabets for finding the evenness of the word 
 * I/P "A person can't walk in this street" 
 * O/P "A per son ca n't wa lk in th is str eet"
 */

public class replaceword{
	public static void main(String[] agrs){
		String test = "A person can't walk in this street";
		replace(test);
	}

	public static void replace(String input){
		String[] in = input.split(" ");
		for (int i = 0; i < in.length; i++) {
			System.out.println(handle(in[i]) + " ");
		}
	}

	
	public static String handle(String input){
		int count = 0; 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				count++;
			}
		}
		if(count >= 4 && count % 2 == 0) {
			int i = 0;
			int j = 0; 
			while (i < count/2) {
				j++;
				sb.append(input.charAt(i));
				if (Character.isAlphabetic(input.charAt(i))) i++;
				
			}
			sb.append(" ");
			sb.append(input.substring(j));
		} else {
			sb.append(input);
		}
		return sb.toString();
	}


}

