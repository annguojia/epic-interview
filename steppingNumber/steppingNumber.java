package steppingNumber;

import java.util.ArrayList;
import java.util.List;
/*
 * A number is called as a stepping number if the adjacent 
 * digits are having a difference of 1. For eg. 8,343,545 are 
 * stepping numbers. While 890, 098 are not. The difference 
 * between a ‘9’ and ‘0’ should not be considered as1. 
 * Given start number(s) and an end number (e) your function 
 * should list out all the stepping numbers in the range including 
 * both the numbers s & e.
 */
 
public class steppingNumber{
	
	public static void main(String args[]) {
		generate("1", "50");
	}
	public static void generate(String start, String end) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (Integer.parseInt(start) > Integer.parseInt(end)) {
			System.out.println("Error input");
		}
		for (int i = start.length(); i <= end.length(); i++) {
			for (int j = 1; j < 10; j++) {
				dfs(res, i - 1, j, Integer.parseInt(start), Integer.parseInt(end));
			}
		}
	}
	public static void dfs(ArrayList<Integer> res, int len, int num, int start,
			int end) {
		// TODO Auto-generated method stub
		if(len == 0 && num <= end && num >= start) {
			res.add(num);
			return;
		}
		int last = num % 10;
		if (last == 0) {
			dfs(res, len - 1, num * 10 + 1, start, end);
		} else {
			if (last == 9) {
				dfs(res, len - 1, num * 10 + 8,start, end);
			} else {
				dfs(res, len - 1, num * 10 + last + 1, start, end);
				dfs(res, len - 1, num * 10 + last - 1, start, end);
			}
		}
		
	}
	
}