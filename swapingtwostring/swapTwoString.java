package swapingtwostring;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two strings, you need to transpose the first string to 
 * the second string by means of only swaps between 2 consecutive 
 * characters in the first string. This must be performed by doing a 
 * series of these swaps in order to get the second string.
 */
public class swapTwoString{
	public static void main(String[] args){
		String s1 = "TEHUNOOL";
		String s2 = "ONLEHTUO";
		transpose(s1.toCharArray(),s2.toCharArray());
	}

	public static void transpose(char[] s1, char[] s2) {
		int i = 0;
		List<String> res = new ArrayList<String>();
		while (i < s2.length) {
			if (s2[i] == s1[i]) {
				i++;
				continue;
			} else {
				int pos = i;
				for(int j=i;j<s1.length;j++){
					if(s2[i] == s1[j]){
						pos = j;
					}
				}
				for(int k=pos;k>i;k--){
					char temp = s1[k];
					s1[k] = s1[k-1];
					s1[k-1] = temp;
					res.add(String.valueOf(s1));
				}
				
			}
		}
		System.out.println("The steps are: ");
		System.out.println(res);
	}
}