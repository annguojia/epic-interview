package balancedString;

import java.util.Stack;

public class balancedString {
	public static void main(String args[]) {
		if (isBalanced("([])({})([])")) {
			System.out.println("Balanced!");
		} else {
			System.out.println("Not Balanced!");
		}
	}
	public static boolean isBalanced(String str) {
		Stack<Character> left = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char cur = str.charAt(i);
			if (!isParenthes(cur)) {
				continue;
			} else {
				if (cur == '(' || cur == '{' || cur == '[') {
					left.push(cur);
				} else if (cur == ')' && left.pop() == '(') {
					continue;
				} else if (cur == ']' && left.pop() == '[') {
					continue;
				} else if (cur == '}' && left.pop() == '{') {
					continue;
				} else {
					return false;
					// break;
				}
					
			}
		}
		return true;
	}
	public static boolean isParenthes(char cur) {
		if (cur == '{' || cur == '[' || cur == '(' || cur == '}' || cur == ']' || cur == ')') {
			return true;
		} else {
			return false;
		}
	}
}
