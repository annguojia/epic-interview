package seedNubmer;

import java.util.ArrayList;

/*
 * Find the seed of a number
 * Eg : 1716 = 143*1*4*3 =1716 so 143 is the seed of 1716. 
 * find all possible seed for a given number.
 */

public class seedNumber {
	public static void main(String args[]) {
		findSeed(1716);
	}
	public static void findSeed(int num) {
		System.out.println("entered");
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = (int) Math.sqrt(num); i < num; i++) {
			int temp = i; 
			String strtemp = String.valueOf(temp);
			for (int j = 0; j < strtemp.length(); j++) {
				temp = temp *(strtemp.charAt(j) - '0');
			}
			if (temp == num) {
				res.add(i);
			} else {
				continue;
			}
		}
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
}
