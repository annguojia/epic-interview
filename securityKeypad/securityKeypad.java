package securityKeypad;
/*
 * There is a security keypad at the entrance of a building. It has 9 
 * numbers 1 - 9 in a 3x3 matrix format
 * 1 2 3 
 * 4 5 6 
 * 7 8 9 
 * The security has decided to allow one digit error for a person but 
 * that digit should be horizontal or vertical. Example: for 5 the user 
 * is allowed to enter 2, 4, 6, 8 or for 4 the user is allowed to 
 * enter 1, 5, 7. IF the security codeto enter is 1478 and if the user 
 * enters 1178 he should be allowed. Write a function to take security 
 * code from the user and print out if he should be allowed or not.
 */
public class securityKeypad {
	public static void main(String args[]) {
		int[][] matrix = {  {'1','2','3'},
							{'4','5','6'},
							{'7','8','9'}
						 };
		checkSecurity("1979","1179");
	}
	public static void checkSecurity(String entered, String expected) {
		boolean rst = true;
		if (entered.length() != expected.length()) {
			rst = false;
		}
		int errorcnt = 0; 
		char enter = '0';
		char expect = '0';
		for (int i = 0; i < entered.length(); i++) {
			if (entered.charAt(i) == expected.charAt(i)) {
				continue;
			} else {
				errorcnt++;
				enter = entered.charAt(i);
				expect = expected.charAt(i);
			}
		}
		if (errorcnt > 1) {
			rst = false;
		} else {
			int a = enter - '0';
			int b = expect - '0';
			if (a == b - 1 || a == b + 1 || a == b - 3 || a == b + 3 ) {
				rst = true;
				System.out.println("This Password can be entered");
			} else {
				rst = false;
			}
		}
		if (rst == false) {
			System.out.println("Fail to enter");
		}
	}
}
