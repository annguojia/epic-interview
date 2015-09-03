package validPassword;
/**
 * In 1-9 keypad one key is not working. If someone enters a password 
 * then not working key will not be entered. You have given expected 
 * password and entered password. Check that entered password is valid 
 * or not. Ex: entered 164, expected 18684 (you need to take care as 
 * when u enter 18684 and 164 only both will be taken as 164 input)
 */
public class validPassword {
	public static void main(String args[]) {
		check("1836845", "1645");
	}
	public static void check(String expected, String entered) {
		boolean flag = true;
		char key = '8';
		int pos1 = 0; 
		int pos2 = 0; 
		boolean res = true;
		while (pos1 < expected.length() && pos2 < entered.length()) {
			if (expected.charAt(pos1) == key) {
				pos1++;
			} else {
				if (expected.charAt(pos1) != entered.charAt(pos2)) {
					flag = false;
					break;
				} else {
					pos1++;
					pos2++;
				}
			}
		}
		if (pos2 != entered.length() || pos1 != expected.length()) {
			flag = false;
		}
		if (flag) {
			System.out.println("They are valid");
		} else {
			System.out.println("Fail");
		}
		
	}

}
