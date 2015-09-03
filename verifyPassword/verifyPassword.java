package verifyPassword;
/**
 * Verify if the given password is valid/invalid
 * 1. must be 5-12 characters long 
 * 2. must contain at least one number and one lower case character 
 * 3. a sequence must not be followed by the same sequence 
 * (like 123123qs is invalid, 123qs123 is valid)
 */
public class verifyPassword {
	public static void main (String args[]) {
		if (verifyPassword("123qs1212")) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
	public static boolean verifyPassword(String pwd) {
		// check length limit
		if (pwd.length() < 5  || pwd.length() > 12) {
			return false;
		}
		// check number && lower case
		boolean number = false;
		boolean lower = false;
		for (int i = 0; i < pwd.length(); i++) {
			if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') {
				lower = true;
			}
			if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
				number = true;
			} 
		}
		if (lower == false || number == false) {
			return false;
		}
		// check whether has sequence
		for (int i = 0; i < pwd.length(); i++) {
			int index = pwd.indexOf(pwd.charAt(i), i + 1);// next index with the same character
			if (index != -1) {
				String str1 = pwd.substring(i, index);
				if ( index + (index - i - 1) < pwd.length()) {
					String str2 = pwd.substring(index, index + str1.length());
					if (str1.equals(str2)) {
						return false; 
					}
				}
			} 
		}
		return true;
		
	}

}
