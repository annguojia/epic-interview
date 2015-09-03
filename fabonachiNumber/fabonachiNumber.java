package fabonachiNumber;
/*
 * There is one kind of numbers call FibbonaciNumber, which satisfy 
 * the following situation:
 * A. can be split into several numbers;
 * B. The first two number are the same, the next number is equal to 
 * the sum of previous two
 * eg. 112 (2 = 1 + 1), 12,122,436(12 + 12 = 24,12 + 24 = 36)
 * If you are given a range by the user, find all numbers that are 
 * Fibonacci numbers.
 */
public class fabonachiNumber {
	public static void main(String args[]) {
		if (isFabon("12122436"))
			System.out.println("True");
		else {
			System.out.println("False");
		}
		
	}
	public static boolean isFabon(String str) {
		for (int i = 1; i < str.length()/ 2; i++) {
				String part1 = str.substring(0, i);
				String part2 = str.substring(i, 2*i);
				if (!part1.equals(part2)) {
					continue;
				}
				int p1 = Integer.parseInt(part1);
				int p2 = Integer.parseInt(part2);
				int sum = p1 + p2;
				String sumStr = String.valueOf(sum);
				String cur = part1 + part2 + sumStr;
				int len = cur.length();
				while(len < str.length()) {
					part1 = part2;
					part2 = sumStr;
					cur += String.valueOf(Integer.parseInt(part1) + Integer.parseInt(part2));
					len = cur.length();
				}
				if (cur.equals(str)) {
					return true;
				}
		}
		return false;
	}
}
