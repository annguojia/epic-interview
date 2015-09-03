package continuousAlphabet;
/*
 * Print continuous alphabets from a sequence of arbitrary alphabets 
 * For example: 
 * Input: abcdefljdflsjflmnopflsjflasjftuvwxyz 
 * Output: abcdef; lmnop; tuvwxyz
 * Input: AbcDefljdflsjflmnopflsjflasjftuvWxYz 
 * Output: abcdef; lmnop; tuvwxyz
 */
public class continuousAlphabet {
 	public static void main(String args[]) {
		checkContinuouse("AbcDefljdflsjflmnopflsjflasjftuvWxYz");
	}
	public static void checkContinuouse(String str) {
		str = str.toLowerCase();
		int left = 0; 
		int right = 0;
		String res = "";
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) - str.charAt(i - 1) == 1) {
				right++;
			} else {
				if (right != left) {
					res += str.substring(left, right + 1) + "; ";
				} 
				right  = i; 
				left = i;
			}
		}
		res += str.substring(left, right + 1);
		System.out.println(res);
		
//		int i = 1;
//		String res = "";
//		while( i < str.length()) {
//			int j = i;
//			while(j < str.length() && str.charAt(j - 1) + 1 == str.charAt(j) ){
//				res += String.valueOf(str.charAt(j - 1));
//				j++;
//			}
//			if (j != i && j != str.length() ) {
//				res += String.valueOf(str.charAt(j - 1)) + "; ";
//			}
//			i = j + 1;
//		}
//		System.out.println(res);
//
//		if (str.charAt(str.length() - 2) + 1 == (str.charAt(str.length() - 1) )) {
//			res += String.valueOf(str.charAt(str.length() -1));
//		}
//		System.out.println(res);
	}
}