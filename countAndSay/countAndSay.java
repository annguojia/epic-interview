/**
 * First,let user input a number, say 1. Then, the function will 
 * generate the next 10 numbers which satisfy this condition: 
 * 1,11,21,1211,111221,312211... 
 * explanation: first number 1, second number is one 1, so 11. 
 * Third number is two1(previous number), so 21. next number one 
 * 2 one 1, so 1211 and so on...
 */
 
package countAndSay;

public class countAndSay{
 	public static void main(String args[]) {
 		countAndSay(1);
 	}
	public static void countAndSay(int digit) {
		String cur = String.valueOf(1) + String.valueOf(digit);
		String res = String.valueOf(digit) + ", "+ String.valueOf(1) + String.valueOf(digit) + ", ";
		int cnt = 8;
		while (cnt > 0) {
			String now = "";
			int i = 1;
			while (i <= cur.length()){
				int count = 1;
				while (i < cur.length() && cur.charAt(i - 1) == cur.charAt(i)) {
					i++;
					count++;
				}
				now += String.valueOf(count) + String.valueOf(cur.charAt(i - 1));
				;
				i = i + 1;
			}
			cnt--;
			cur = now;
			res += String.valueOf(now) + ", ";
		}
		System.out.println(res);
	}
 }