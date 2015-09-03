package wellOrderedString;
import java.util.ArrayList;
/*
 * You know a password is well-ordered string. 
 * Well-ordered string means that the order of the 
 * characters is in an alphabetical increasing order.
 * Like abEm is a well-ordered number. However,
 * abmE is not a well-order number. Given an input # that 
 * tells you also how many digits are in the password, 
 * print all possible passwords.
 */
public class wellOrderedString {
	public static void main(String args[]) {
		generate(4);
	}
	public static void generate(int num) {
		ArrayList<String> res = new ArrayList<String>();
		generate(res,"", num, 0);
		for (String s : res) {
			System.out.println(s);
		}
	}
	public static void generate(ArrayList<String> res, String path, int num, int index) {
		if (num == 0) {
			res.add(new String (path));
			return;
		}
		for (int i = index; i < 26; i++) {
			generate(res, path + String.valueOf((char)(i + 'a')), num - 1, i + 1);
			generate(res, path + String.valueOf((char)(i + 'A')), num - 1, i + 1);
		}
	}
}
