package searchWord;

public class searchWord {
 public static void main(String args[]) {
	 char[][] dic = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'o', 'r'}, {'s', 't', 'a', 't'}};
	 String word = "coa";
	 if (check(dic, word))
		 System.out.println("In it!");
 }
 public static boolean check(char[][] dic, String word) {
	 boolean found = false;
	 int index = 0;
	 System.out.println("enter");
	 //check row 
	 for (int i = 0; i < dic.length; i++) {
		 for (int j = 0; j < dic[0].length; j++) {
			 if (dic[i][j] != word.charAt(index)) {
				 index = 0;
				 continue;
			 } else {
//				 System.out.println("enter row");
				 index++;
				 if (index == word.length()) {
					 return true;
				 }
			 }
		 }
	 }
	 // check col
	 for (int i = 0; i < dic[0].length; i++) {
		 for (int j = 0; j < dic.length; j++) {
			 if (dic[j][i] != word.charAt(index)) {
				 index = 0;
				 continue;
			 } else {
//				 System.out.println("enter col");

				 index++;
				 if (index == word.length()) {
//					 System.out.println(i);
//					 System.out.println(j - index + 1);
					 return true;
					 
				 }
			 }
		 }
	 }
	 return found;
 }
}
