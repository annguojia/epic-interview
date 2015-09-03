package keypadpermutation;
import java.util.ArrayList;
public class keypadpermutation {
	public static String[] map ={"", "", "ABC", "DEF", "GHI","JKL","MNO","PQRS","TUV","WXYZ"} ;
	public static void main(String args[]) {
//		String[] map ={"", "", "ABC", "DEF", "GHI","JKL","MNO","PQRS","TUV","WXYZ"} ;
		generate("23");
	}
	public static void generate(String digits) {
		ArrayList<String> res = new ArrayList<String>();
		generate(res, "", digits, 0);
		for (String s : res) {
			System.out.println(s);
		}
	}
	public static void generate(ArrayList<String> res, String path, String digits, int index) {
		if (index == digits.length()) {
			res.add(new String(path));
			return; 
		}
		String cur = map[digits.charAt(index) - '0'];
		for (int i = 0; i < cur.length(); i++) {
			generate(res, path + String.valueOf(cur.charAt(i)), digits, index + 1);
		}
	}

}
