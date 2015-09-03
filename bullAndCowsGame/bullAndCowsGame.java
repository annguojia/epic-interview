package bullAndCowsGame;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * There’s a word guessing game. One person think a word, and the other 
 * one guess a word, both words have the same length.The person should 
 * return the number of bulls and cows for the guessing. Bulls represent 
 * the number of same characters in the same spots, whereas cows represent 
 * the number of characters guessed right but in the wrong spots. Write a 
 * program with two input strings, return the number of bulls and cows.
 */
public class bullAndCowsGame{
	public static void main(String args[]) {
		game("spam","Smap");
	}
	public static void game(String think, String guess) {
		if (think.length() != guess.length()) {
			System.out.println("Input error");
			// return new int[2];
		}
		think = think.toLowerCase();
		guess = guess.toLowerCase();
		int bulls = 0;
		int cows = 0;
		
		HashMap<Character, ArrayList<Integer> > map = new HashMap<Character, ArrayList<Integer>>();
		
		for (int i = 0; i < think.length(); i++ ) {
			char cur = think.charAt(i);
			if (!map.containsKey(cur)) {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(i);
				map.put(cur, arr);
			} else {
				ArrayList<Integer> arr = map.get(cur);
				arr.add(i);
				map.put(cur, arr);
			}
		}
		
		for (int j = 0; j < guess.length(); j++) {
			char cur = guess.charAt(j);
			if (!map.containsKey(cur)) {
				continue;
			} else {
				ArrayList<Integer> arr = map.get(cur);
				if (arr.contains(j)) {
					bulls++;
				} else {
					cows++;
				}
			}
		}
		System.out.println("bulls" + bulls + "cows" + cows);		
	}
}