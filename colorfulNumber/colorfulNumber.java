package colorfulNumber;

import java.util.HashSet;
import java.util.Set;

public class colorfulNumber{
	public static void main(String args[]) {
		if (isColorfulNumber(239)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	public static boolean isColorfulNumber(int num){
		String str = String.valueOf(num);
		Set<Integer> map = new HashSet<Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			int cur = Integer.parseInt(str.substring(i, i + 1));
			if (!map.contains(cur)) {
				map.add(cur);
			} else {
				return false;
			}
			for (int j = i + 1; j < str.length(); j++) {
				cur = cur * Integer.parseInt(str.substring(j, j + 1));
				if (map.contains(cur)) {
					return false;
				} else {
					map.add(cur);
				}
			}
			
		}
		return true;
 	}
 }