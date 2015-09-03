package wellorderString;

import java.util.ArrayList;
import java.util.List;

public class wellOrderString {
/**
 * Well-ordered String:
 * You know a password is well-ordered string. 
 * Well-orderedstring means that the order of the characters is in an alphabetical increasingorder. 
 * Like “abEm” is a well-ordered number. However, “abmE” is not a well-ordernumber. 
 * Given an input# that tells you also how many digits are in thepassword, print all possible passwords.
 */
	public static void main(String args[]) {
		ArrayList<String> path = wellOrderStr("abmEacdfGiXYZorz");
		for (int i = 0; i < path.size(); i++) {
			System.out.println(path.get(i));
		}
	}
	public static ArrayList<String> wellOrderStr(String words) {
		words = words.toLowerCase();
		ArrayList<String> res = new ArrayList<String>();
		int i = 1;
		while (i < words.length()){
			String temp = "";
			while (i < words.length() && words.charAt(i - 1) < words.charAt(i)) {
				temp = temp + words.charAt(i - 1);
				i++;
			}
			if(i < words.length())
				temp = temp + words.charAt(i - 1);
			res.add(temp);
			i++;
		}
		
		return res;
		
		
	}
}
